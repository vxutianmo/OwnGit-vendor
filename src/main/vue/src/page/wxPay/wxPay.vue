<template>
	<div id="wxPay">
    <head-top head-title="确认支付"  go-back='true'></head-top>
    <section class="showbody">
      <div>订单号：{{orderNum}}</div>
      <div>总价：{{totalPriceMo}}</div>
      <!--<button class="wxPay" @click="wxPay">微信支付</button>-->
    </section>
    <section class="buy_cart_container">
      <section  class="cart_icon_num">
        <div class="cart_icon_container" >
          <section  class="cancelpay">
            <section class="cancelpay_button_style"  @click = "cancelPay">
              取消支付
            </section>
          </section>
          <section class="gotopay">
            <section class="gotopay_button_style"  @click = "wxPay">
              确认支付
            </section>
          </section>

        </div>
      </section>
    </section>
	</div>
</template>

<script>
	import { wpsale } from 'src/service/getData'
	import axios from 'axios'
	import {baseUrl,frontUrl} from 'src/config/env'
  import headTop from 'src/components/header/head'
  import {mapState, mapMutations} from 'vuex'

	export default {
		data() {
			return {
				// openId: '',
				orderNum:'',
        totalNum:'',
        totalPriceMo:''
			}
		},
		async created() {
			// console.log('created---')
			// this.openId = localStorage.getItem('openId');
			// console.log('wxPay--openId:' + this.openId);

			this.orderNum=this.$route.query.orderNum;
			this.totalNum=this.$route.query.totalNum;
			this.totalPriceMo=this.$route.query.totalPriceMo;
			// console.log(this.orderNum);
		},
	    components: {
	      headTop,
	    },
    computed:{
      ...mapState([
        'openId'
      ]),
    },
		methods: {
		    cancelPay(){
			    this.$router.go(-1)
		    },
			wxPay() {

//				let outTradeNum = this.orderNum;
//				let price = '0.01';
//				let infors = '微信支付';
//				//支付成功回调地址
//				let returnUrl = 'http://sell.runhangtech.com/sell/wxpay/test';
//				//支付取消地址
//				let cancleUrl = frontUrl+'/sell/wxpay/test';
//				//支付异常地址
//				let failUrl = frontUrl+'/sell/wxpay/test';
//				let openid = this.openId;

//				this.wxSale(outTradeNum,price,infors,returnUrl,cancleUrl,failUrl,openid);

				this.wxSaleL(this.openId,this.orderNum);
       		},

			wxSaleL(openIdL,orderNumberL){
				axios.get(baseUrl+'/sell/presale/payment', {
				    params: {
						orderNumber:orderNumberL,
						openId:openIdL
				    }
				  })
				  .then((response)=> {
				  	// console.log(response.data)
				    // console.log(response.data.response.payInfo);

				    this.wxPayLS(response.data.response.payInfo);

				  })
				  .catch(function (error) {
				    // console.log(error);
				  });
			},

			wxPayLS(payInfoL){
				// console.log('wxPay：'+payInfoL);

				WeixinJSBridge.invoke('getBrandWCPayRequest', {
					"appId": payInfoL.appId,
					"nonceStr": payInfoL.nonceStr,
					"package": payInfoL.package,
					"paySign": payInfoL.paySign,
					"signType": payInfoL.signType,
					"timeStamp": payInfoL.timeStamp
				}, (res)=>{
					if(res.err_msg == "get_brand_wcpay_request:ok") {
//						location.href = frontUrl+"wxpay/wx_return_url";//支付成功
// 						alert('res:'+res.err_msg)
						this.$router.push({
						    path:'/order',
						    // query:{
						    // 	orderNum:this.orderNum
						    // }
						})

					} else if(res.err_msg == "get_brand_wcpay_request:cancel") {
//						location.href = frontUrl+"/sell/wxpay/test";//支付失败
// 						alert('res:'+res.err_msg)

						this.$router.push({
						    path:'/order',
						    // query:{
						    // 	orderNum:this.orderNum
						    // }
						})

					} else if(res.err_msg == "get_brand_wcpay_request:fail") {
						// console.log('res:'+res.err_msg)
						// alert(JSON.stringify(res));
					}
				});

				if(typeof WeixinJSBridge == "undefined") {
					if(document.addEventListener) {
						document.addEventListener('WeixinJSBridgeReady', onBridgeReady, false);
					} else if(document.attachEvent) {
						document.attachEvent('WeixinJSBridgeReady', onBridgeReady);
						document.attachEvent('onWeixinJSBridgeReady', onBridgeReady);
					}
				} else {
//					onBridgeReady();
				}

			},

/*			wxSale(outTradeNumL,priceL,inforsL,returnUrlL,cancleUrlL,failUrlL,openidL){

				axios.get(baseUrl+'/sell/wxpay/wp_sale', {
				    params: {
						outTradeNum:outTradeNumL,
						price:priceL,
						infors:inforsL,
						returnUrl:returnUrlL,
						cancleUrl:cancleUrlL,
						failUrl:failUrlL,
						openid:openidL
				    }
				  })
				  .then(function (response) {

				    console.log(response.data);
				    let data=response.data;

				    //微信支付代码
					var reg = /<script[^>]*>([^\x00]+)$/i
					var htmlBlock = data.split("<\/script>");
					for(var i in htmlBlock) {
						var blocks; //匹配正则表达式的内容数组，blocks[1]就是真正的一段脚本内容，因为前面reg定义我们用了括号进行了捕获分组
						if(blocks = htmlBlock[i].match(reg)) {
							//清除可能存在的注释标记，对于注释结尾-->可以忽略处理，eval一样能正常工作
							var code = blocks[1].replace(/<!--/, '');
							try {
								eval(code) //执行脚本
							} catch(e) {}
						}
					}

				  })
				  .catch(function (error) {
				    console.log(error);
				  });

			},*/
		}
	}
</script>

<style lang="scss" scoped>
  @import 'src/style/mixin';
  .showbody{
    font-size: 14px;
    padding-top: 1.95rem;
    overflow:hidden;
  }
  .buy_cart_container {
    position: fixed;
    background-color: #fff;
    bottom: 0;
    left: 0;
    z-index: 13;
    display: flex;
    @include wh(100%, 2rem);

    .cart_icon_num {
      flex: 1;

      .cart_icon_container {
        /*width: 100%;*/
        display: flex;
        /*position: absolute;*/
        /*padding: .4rem;*/
        /*left: .5rem;*/
        /*top: -.7rem;*/
      }


      .cart_num {
        @include ct;
        left: 3.5rem;

        div {
          color: #fff;
        }

        div:nth-of-type(1) {
          font-size: .8rem;
          font-weight: bold;
          margin-bottom: .1rem;
        }

        div:nth-of-type(2) {
          font-size: .4rem;
        }
      }
    }
    .cancelpay{
      /*position: absolute;*/
      /*top: .7rem;*/
      /*left: .5rem;*/
      background-color: #B8B8B8;
      @include wh(50%, 2rem);
      text-align: center;
      display: flex;
      align-items: center;
      justify-content: center;

      .cancelpay_button_style {
        @include sc(.7rem, #000);
        font-weight: bold;
      }
    }
    .gotopay {
      /*position: absolute;*/
      /*top: .7rem;*/
      /*left: 10rem;*/
      background-color: $mtOrange;
      @include wh(50%, 2rem);
      text-align: center;
      display: flex;
      align-items: center;
      justify-content: center;

      .gotopay_button_style {
        @include sc(.7rem, #fff);
        font-weight: bold;
      }
    }
  }
	.wxPay {
    overflow:hidden;
	}
</style>
