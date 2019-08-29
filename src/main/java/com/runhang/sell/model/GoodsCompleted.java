package com.runhang.sell.model;

/**
 * 商品实体类
 *
 * @Author wangzhendong
 * @Date 2018-6-14 9:00
 */
public class GoodsCompleted extends com.runhang.base.model.goods.Goods {
    private Integer id;

    private Integer brandId;
    
    private String name;

    private String code;

    private String pack;

    private String specUnit;

    private static final long serialVersionUID = 1L;

    private GoodsBrand goodsBrand;

    private String imageUrl;

    /**
     * 商品分类: 饮料，零食...
     */
    private String goodsClass;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public GoodsBrand getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(GoodsBrand goodsBrand) {
        this.goodsBrand = goodsBrand;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getBrandId() {
        return brandId;
    }

    @Override
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    @Override
    public String getPack() {
        return pack;
    }

    @Override
    public void setPack(String pack) {
        this.pack = pack == null ? null : pack.trim();
    }

    public String getGoodsClass() {
        return goodsClass;
    }

    public void setGoodsClass(String goodsClass) {
        this.goodsClass = goodsClass;
    }

    @Override
    public String getSpecUnit() {
        return specUnit;
    }

    @Override
    public void setSpecUnit(String specUnit) {
        this.specUnit = specUnit;
    }

}