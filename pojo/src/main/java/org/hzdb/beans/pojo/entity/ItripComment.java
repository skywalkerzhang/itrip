package org.hzdb.beans.pojo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 评论表(ItripComment)实体类
 *
 * @author makejava
 * @since 2020-07-30 15:39:24
 */
public class ItripComment implements Serializable {
    private static final long serialVersionUID = -66254071259031223L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 如果产品是酒店的话 改字段保存酒店id
    */
    private Long hotelid;
    /**
    * 商品id
    */
    private Long productid;
    /**
    * 订单id
    */
    private Long orderid;
    /**
    * 商品类型(0:旅游产品 1:酒店产品 2:机票产品)
    */
    private Integer producttype;
    /**
    * 评论内容
    */
    private String content;
    /**
    * 用户编号
    */
    private Long userid;
    /**
    * 是否包含图片(当用户上传评论时检测)0:无图片 1:有图片
    */
    private Integer ishavingimg;
    /**
    * 位置评分
    */
    private Integer positionscore;
    /**
    * 设施评分
    */
    private Integer facilitiesscore;
    /**
    * 服务评分
    */
    private Integer servicescore;
    /**
    * 卫生评分
    */
    private Integer hygienescore;
    /**
    * 综合评分
    */
    private Integer score;
    /**
    * 出游类型
    */
    private Long tripmode;
    /**
    * 是否满意（0：有待改善 1：值得推荐）
    */
    private Integer isok;
    
    private Date creationdate;
    
    private Long createdby;
    
    private Date modifydate;
    
    private Long modifiedby;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHotelid() {
        return hotelid;
    }

    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public Integer getProducttype() {
        return producttype;
    }

    public void setProducttype(Integer producttype) {
        this.producttype = producttype;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Integer getIshavingimg() {
        return ishavingimg;
    }

    public void setIshavingimg(Integer ishavingimg) {
        this.ishavingimg = ishavingimg;
    }

    public Integer getPositionscore() {
        return positionscore;
    }

    public void setPositionscore(Integer positionscore) {
        this.positionscore = positionscore;
    }

    public Integer getFacilitiesscore() {
        return facilitiesscore;
    }

    public void setFacilitiesscore(Integer facilitiesscore) {
        this.facilitiesscore = facilitiesscore;
    }

    public Integer getServicescore() {
        return servicescore;
    }

    public void setServicescore(Integer servicescore) {
        this.servicescore = servicescore;
    }

    public Integer getHygienescore() {
        return hygienescore;
    }

    public void setHygienescore(Integer hygienescore) {
        this.hygienescore = hygienescore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getTripmode() {
        return tripmode;
    }

    public void setTripmode(Long tripmode) {
        this.tripmode = tripmode;
    }

    public Integer getIsok() {
        return isok;
    }

    public void setIsok(Integer isok) {
        this.isok = isok;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Long getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(Long modifiedby) {
        this.modifiedby = modifiedby;
    }

}