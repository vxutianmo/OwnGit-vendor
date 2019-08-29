package com.runhang.sell.netty;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import io.netty.util.ReferenceCountUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;

public class NettyServerHandler extends ChannelInboundHandlerAdapter {

    private Logger logger = LoggerFactory.getLogger(NettyServerHandler.class);
    private MsgUtils mu = new MsgUtils();
    //收到数据时调用
    @Override
    public  void channelRead(ChannelHandlerContext ctx, Object  msg) {
        try {
            ByteBuf in = (ByteBuf)msg;
            int readableBytes = in.readableBytes();
            byte[] bytes;
            String mm = "";
            String body = "";
            for (int i = 0; i < 17; i++) {
                String N = Integer.toHexString(in.getByte(i) & 0xff);
                if(N.length() <2 ){
                    N="0"+N;
                    body +=N;
                }else {
                    body +=N;
                }
               // System.out.println("数据: "+body);
                mm += ""+(char) in.getByte(i);
            }
            logger.info("Server received: " + mm +"数据: "+body);
            mu.dealMsg(body,ctx);
            // 回复消息
            String ok = "ok";
            byte[] bb = ok.getBytes();
            ByteBuf byteBuf = Unpooled.buffer(1024);
            for(int i = 0;i < bb.length;i++){
                byteBuf.writeByte(bb[i]);
            }
            ctx.writeAndFlush(byteBuf);
        }catch (Exception e){
            logger.error("channelRead error :"+e.getMessage());
            e.printStackTrace();
        }finally {
            // 抛弃收到的数据
            ReferenceCountUtil.release(msg);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        // 当出现异常就关闭连接
        cause.printStackTrace();
        ctx.close();
    }
    /*
     * 建立连接时，返回消息
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        //System.out.println("连接的客户端地址:" + ctx.channel().remoteAddress());
        logger.error("连接的客户端地址:" + ctx.channel().remoteAddress());
        logger.error("连接的客户端ID:" + ctx.channel().id());
        ctx.writeAndFlush("client"+ InetAddress.getLocalHost().getHostName() + "success connected！ \n");
        logger.info("connection");
        //StaticVar.ctxList.add(ctx);
        //StaticVar.chc = ctx;
        super.channelActive(ctx);
    }
}
