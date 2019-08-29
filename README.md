# 前言
src config env.js   baseUrl    接口 src service getData.js
build dev-server.js 中 local和online    proxypath修改
src store index.js 存放数据，用的时候引用 import {mapState, mapMutations} from 'vuex'


轮播 swipe


设备显示 商品展示  加入购物车 购买 订单列表 

## 技术栈

vue2 + vuex + vue-router + webpack + ES6/7 + fetch + axios + sass + flex + svg


## 项目运行

#### 注意：由于涉及大量的 ES6/7 等新属性，node 需要 6.0 以上版本

```
git clone git@github.com:vxutianmo/OwnGit-vendor.git

cd src/main/vue
 
npm install 或 yarn(推荐)

npm run dev

```



# 说明

>  如果对您有帮助，您可以点右上角 "Star" 支持一下 谢谢！ ^_^

>  或者您可以 "follow" 一下

>  开发环境 windows  Chrome  nodejs 



# 目标功能
- [x] 定位功能 -- 完成
- [x] 商品列表页 -- 完成
- [x] 购物车功能 -- 完成
- [x] 下单功能 -- 完成
- [x] 订单列表 -- 完成
- [x] 订单详情 -- 完成
- [x] 付款 -- 完成




# 部分截图


### 设备列表页

<img src="https://github.com/vxutianmo/OwnGit-vendor/blob/master/src/main/vue/screenshots/address.png" width="365" height="619"/> 


### 商品筛选页

<img src="https://github.com/vxutianmo/OwnGit-vendor/blob/master/src/main/vue/screenshots/goods.png" width="365" height="619"/> 


### 购物车

<img src="https://github.com/vxutianmo/OwnGit-vendor/blob/master/src/main/vue/screenshots/cart.png" width="365" height="619"/> 

### 订单页

<img src="https://github.com/vxutianmo/OwnGit-vendor/blob/master/src/main/vue/screenshots/order.png" width="365" height="619"/> 


###订单详情页

<img src="https://github.com/vxutianmo/OwnGit-vendor/blob/master/src/main/vue/screenshots/orderDetail.png" width="365" height="619"/> 





# 项目布局

```
.
├── build                                       // webpack配置文件
├── config                                      // 项目打包路径
├── runhang                                     // 上线项目文件，放在服务器即可正常访问
├── screenshots                                 // 项目截图
├── src                                         // 源码目录
│   ├── components                              // 组件
│   │   ├── common                              // 公共组件
│   │   │   ├── alertTip.vue                    // 弹出框组件
│   │   │   ├── buyCart.vue                     // 购物车组件
│   │   │   ├── computeTime.vue                 // 倒计时组件
│   │   │   ├── loading.vue                     // 页面初始化加载数据的动画组件
│   │   │   ├── mixin.js                        // 组件混合(包括：指令-下拉加载更多，处理图片地址)
│   │   │   ├── ratingStar.vue                  // 评论的五颗星组件
│   │   │   └── shoplist.vue                    // msite和shop页面的餐馆列表公共组件
│   │   ├── footer
│   │   │   └── footGuide.vue                   // 底部公共组件
│   │   └── header
│   │       └── head.vue                        // 头部公共组件
│   ├── config                                  // 基本配置
│   │   ├── env.js                              // 环境切换配置
│   │   ├── fetch.js                            // 获取数据
│   │   ├── mUtils.js                           // 常用的js方法
│   │   └── rem.js                              // px转换rem
│   ├── images                                  // 公共图片
│   ├── page
│   │   ├── cart
│   │   │   ├── children
│   │   │   │   └── pay.vue                  // 支付页面
│   │   │   └── cart.vue                       // 购物车页
│   │   ├── classify
│   │   │   └── classify.vue                    // 商品分类页
│   │   ├── error
│   │   │   └── error404.vue                    // 错误页
│   │   ├── order
│   │   │   ├── children
│   │   │   │   └── orderDetail.vue             // 订单详情页
│   │   │   └── order.vue                       // 订单列表页
│   │   ├── vendings
│   │   │   └── vendings.vue                      // 设备页面
│   │   ├── wxAuth
│   │   │   └── wxAuth.vue                      // 微信授权页面
│   │   ├── wxPay
│   │   │   └── wxPay.vue                      // 微信支付页面
│   ├── plugins                                 // 引用的插件
│   ├── router
│   │   └── router.js                           // 路由配置
│   ├── service                                 // 数据交互统一调配
│   │   ├── getData.js                          // 获取数据的统一调配文件，对接口进行统一管理
│   │   └── tempdata                            // 开发阶段的临时数据
│   ├── store                                   // vuex的状态管理
│   │   ├── action.js                           // 配置actions
│   │   ├── getters.js                          // 配置getters
│   │   ├── index.js                            // 引用vuex，创建store
│   │   ├── modules                             // store模块
│   │   ├── mutation-types.js                   // 定义常量muations名
│   │   └── mutations.js                        // 配置mutations
│   └── style
│       ├── common.scss                         // 公共样式文件
│       ├── mixin.scss                          // 样式配置文件
│       └── swiper.min.css
│   ├── App.vue                                 // 页面入口文件
│   ├── main.js                                 // 程序入口文件，加载各种公共组件
├── favicon.ico                                 // 图标
├── index.html                                  // 入口html文件
.


```
