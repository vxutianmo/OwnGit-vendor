import fetch from '../config/fetch'
import {getStore} from '../config/mUtils'


/**
 * test
 */
export const test = (test) => fetch('/sell/wxpay/test', {
	test
});

/**
 * 经纬度获取售货机列表         润航
 */
export const getVendorInfo = (longitude,latitude) => fetch('/sell/presale/get_vendor_info', {
  longitude,
  latitude
});
/**
 * 经纬度获取售货机列表         银座
 */
// export const getVendorInfo = (longitude,latitude) => fetch('/sell/presale/get_vendor_info_inzone', {
// 	longitude,
// 	latitude
// });

/**
 * 微信支付
 */
export const wpsale = (outTradeNum,price,infors,returnUrl,cancleUrl,failUrl,openid) => fetch('/sell/wxpay/wp_sale', {
	outTradeNum,
	price,
	infors,
	returnUrl,
	cancleUrl,
	failUrl,
	openid
});

/**
 * 生成订单信息
 */
export const genarateOrderInfo = (openId,totalOrderPrice,vdInfo) => fetch('/sell/presale/generate_orders', {
  openId,
  totalOrderPrice,
  vdInfo
});
/**
 * 获取设备商品信息
 */
export const getVendorGoods = (vdCode,openId) => fetch('/sell/presale/get_vendor_goods', {
	vdCode,
	openId
});

/**
 * 获取购物车信息
 */
export const getCartInfo = (openId) => fetch('/sell/presale/get_shopping_cart', {
	openId
});
/**
 * 获取订单接口
 */
export const getOrderInfo = (openId,orderType) => fetch('/sell/presale/get_order', {
	openId,
  orderType
});

/**
 * 保存/修改购物车信息
 */
export const editCartInfo = (openId,vdCode,goodsId,goodsQuantity) => fetch('/sell/presale/custom_shopping_cart', {
  openId,
  vdCode,
  goodsId,
  goodsQuantity
});

/**
 * 获取用户信息
 */
export const userInfo = (code,state) => fetch('/sell/wxpay/user_info', {
	code,
	state
});






/**
 * 获取订单详情
 */
export const getOrderDetails = (orderNumber) => fetch('/sell/presale/get_order_details',{orderNumber});



