package com.runhang.sell.model.lipstick;

import com.runhang.base.model.goods.Goods;
import com.runhang.base.model.vendormgt.BaseVendorTrackDeployLipstick;
import com.runhang.base.model.vendormgt.VendorTrack;
import com.runhang.base.model.vendormgt.VendorTrackDeploy;

public class VendorTrackDeployLipstick extends BaseVendorTrackDeployLipstick {
	private VendorTrackDeploy vendorTrackDeploy;
	private VendorTrack vendorTrack;
	private Goods goods;
	
	public void setVendorTrackDeploy(VendorTrackDeploy vendorTrackDeploy) {
		this.vendorTrackDeploy = vendorTrackDeploy;
	}
	
	public VendorTrackDeploy getVendorTrackDeploy() {
		return this.vendorTrackDeploy;
	}

	public void setVendorTrack(VendorTrack vendorTrack) {
		this.vendorTrack = vendorTrack;
	}
	
	public VendorTrack getVendorTrack() {
		return this.vendorTrack;
	}
	
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	public Goods getGoods() {
		return this.goods;
	}
}
