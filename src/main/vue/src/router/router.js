import App from '../App'

const order = r => require.ensure([], () => r(require('../page/order/order')), 'order')
const orderDetail = r => require.ensure([], () => r(require('../page/order/children/orderDetail')), 'orderDetail')
const test = r => require.ensure([], () => r(require('../page/test/test')), 'test')
const classify = r => require.ensure([], () => r(require('../page/classify/classify')), 'classify')
const cart = r => require.ensure([], () => r(require('../page/cart/cart')), 'cart')
const pay = r => require.ensure([], () => r(require('../page/cart/children/pay')), 'pay')

const wxAuth = r => require.ensure([], () => r(require('../page/wxAuth/wxAuth')), 'wxAuth')
const noWechat = r => require.ensure([], () => r(require('../page/wxAuth/noWechat')), 'noWechat')
 const wxPay = r => require.ensure([], () => r(require('../page/wxPay/wxPay')), 'wxPay')
const vendings = r => require.ensure([], () => r(require('../page/vendings/vendings')), 'vendings')
const error404 = r => require.ensure([], () => r(require('../page/error/error404')), 'error404')


export default [{
  path: '/',
  component: App, //顶层路由，对应index.html
  children: [ //二级路由。对应App.vue
    //地址为空时跳转home页面
    //首页城市列表页
    {
      path: '/vendings',
      component: vendings
    },
    // {
    //   path: '/error404',
    //   component: error404
    // },
    //
    // {
    //   path: '',
    //   redirect: '/error404'
    // },

    {
      path: '/wxPay',
      component: wxPay
    },
    {
      path: '/noWechat',
      component: noWechat
    },
    {
      path: '/wxAuth',
      component: wxAuth
    },
    //订单列表页
    {
      path: '/order',
      component: order,
    },
    //分类
    {
      path: '/classify',
      component: classify,
      // meta: { keepAlive: true },
      // children: [{
      //   path: 'test', //分类页
      //   component: classify,
      // }, ]
    },
    //购物车
    {
      path: '/cart',
      component: cart,
      children: [{
        path: 'pay', //购物车页
        component: pay,
      },
      ],
      meta: { keepAlive: false },
    },
    //订单详情
    {
      path: '/orderDetail',
      component: orderDetail,
    },
    //测试
    {
      path: '/test',
      component: test,
      children: [{
        path: 'test', //订单详情页
        component: test,
      }, ]
    },

  ]
}]
