package com.runhang.sell.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @创建人：zc
 * @时间：2018/9/19 0019
 * @描述：
 *  创建两个NIO线程组，一个专门用于接收来自客户端的连接，另一个则用于处理已经被接收的连接。
 *  创建一个ServerBootstrap对象，配置Netty的一系列参数，例如接受传出数据的缓存大小等。
 *  创建一个用于实际处理数据的类ChannelInitializer，进行初始化的准备工作，比如设置接受传出数据的字符集、格式以及实际处理数据的接口。
 *  绑定端口，执行同步阻塞方法等待服务器端启动即可。
 */
@Component
public class NettyServer extends AnnotationConfigServletWebServerApplicationContext {
    private static final Logger log = LoggerFactory.getLogger(NettyServer.class);

    private static final int port = 9066;
    public void run()  {
        //NioEventLoopGroup是用来处理IO操作的多线程事件循环器
        EventLoopGroup bossGroup  = new NioEventLoopGroup();  // 用来接收进来的连接
        EventLoopGroup workerGroup  = new NioEventLoopGroup();// 用来处理已经被接收的连接
        try{
            ServerBootstrap server =new ServerBootstrap();//是一个启动NIO服务的辅助启动类
            server.group(bossGroup,workerGroup )
                    .channel(NioServerSocketChannel.class)  // 这里告诉Channel如何接收新的连接
                    .childHandler(new SimpleChatServerInitializer())
                    .option(ChannelOption.SO_BACKLOG,128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true);
            ChannelFuture f = null;// 绑定端口，开始接收进来的连接
            try {
                f = server.bind(port).sync();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info("售卖服务端启动成功...");
            // 监听服务器关闭监听
            try {
                f.channel().closeFuture().sync();
            } catch (InterruptedException e) {
                log.info("售卖服务端启动失败... "+e.getMessage());
                e.printStackTrace();
            }
        }finally {
            bossGroup.shutdownGracefully(); ////关闭EventLoopGroup，释放掉所有资源包括创建的线程
            workerGroup.shutdownGracefully();
        }
        // 服务器绑定端口监听
    }
//    public static void main(String[] args) {
//        NettyServer n =new NettyServer();
//        n.run();
//    }
}
