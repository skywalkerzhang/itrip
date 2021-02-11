package org.hzdb.beans.pojo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单表(ItripHotelOrder)实体类
 *
 * @author makejava
 * @since 2020-07-30 15:39:24
 */
public class ItripHotelOrder implements Serializable {

    /**
    * 主键
    */
    private Long id;
    /**
    * 用户id
    */
    private Long userid;
    /**
    * 订单类型(0:旅游产品 1:酒店产品 2：机票产品)
    */
    private Integer ordertype;
    /**
    * 订单号
    */
    private String orderno;
    /**
    * 交易编号
    */
    private String tradeno;
    /**
    * 冗余字段 酒店id
    */
    private Long hotelid;
    /**
    * 冗余字段 酒店名称
    */
    private String hotelname;
    /**
    * 房间id
    */
    private Long roomid;
    /**
    * 消耗数量
    */
    private Integer count;
    /**
    * 预订天数
    */
    private Integer bookingdays;
    /**
    * 入住时间
    */
    private Date checkindate;
    /**
    * 退房时间
    */
    private Date checkoutdate;
    /**
    * 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
    */
    private Integer orderstatus;
    /**
    * 支付金额
    */
    private Double payamount;
    /**
    * 支付方式:1:支付宝 2:微信 3:到店付
    */
    private Integer paytype;
    /**
    * 联系手机号
    */
    private String noticephone;
    /**
    * 联系邮箱
    */
    private String noticeemail;
    /**
    * 特殊需求
    */
    private String specialrequirement;
    /**
    * 是否需要发票（0：不需要 1：需要）
    */
    private Integer isneedinvoice;
    /**
    * 发票类型（0：个人 1：公司）
    */
    private Integer invoicetype;
    /**
    * 发票抬头
    */
    private String invoicehead;
    /**
    * 入住人名称
    */
    private String linkusername;
    /**
    * 0:WEB端 1:手机端 2:其他客户端
    */
    private Integer booktype;
    /**
    * 预定时间
    */
    private Date creationdate;
    
    private Long createdby;
    /**
    * 支付完成时间
    */
    private Date modifydate;
    
    private Long modifiedby;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Integer getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Integer ordertype) {
        this.ordertype = ordertype;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    public Long getHotelid() {
        return hotelid;
    }

    public void setHotelid(Long hotelid) {
        this.hotelid = hotelid;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public Long getRoomid() {
        return roomid;
    }

    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getBookingdays() {
        return bookingdays;
    }

    public void setBookingdays(Integer bookingdays) {
        this.bookingdays = bookingdays;
    }

    public Date getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(Date checkindate) {
        this.checkindate = checkindate;
    }

    public Date getCheckoutdate() {
        return checkoutdate;
    }

    public void setCheckoutdate(Date checkoutdate) {
        this.checkoutdate = checkoutdate;
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public Double getPayamount() {
        return payamount;
    }

    public void setPayamount(Double payamount) {
        this.payamount = payamount;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public String getNoticephone() {
        return noticephone;
    }

    public void setNoticephone(String noticephone) {
        this.noticephone = noticephone;
    }

    public String getNoticeemail() {
        return noticeemail;
    }

    public void setNoticeemail(String noticeemail) {
        this.noticeemail = noticeemail;
    }

    public String getSpecialrequirement() {
        return specialrequirement;
    }

    public void setSpecialrequirement(String specialrequirement) {
        this.specialrequirement = specialrequirement;
    }

    public Integer getIsneedinvoice() {
        return isneedinvoice;
    }

    public void setIsneedinvoice(Integer isneedinvoice) {
        this.isneedinvoice = isneedinvoice;
    }

    public Integer getInvoicetype() {
        return invoicetype;
    }

    public void setInvoicetype(Integer invoicetype) {
        this.invoicetype = invoicetype;
    }

    public String getInvoicehead() {
        return invoicehead;
    }

    public void setInvoicehead(String invoicehead) {
        this.invoicehead = invoicehead;
    }

    public String getLinkusername() {
        return linkusername;
    }

    public void setLinkusername(String linkusername) {
        this.linkusername = linkusername;
    }

    public Integer getBooktype() {
        return booktype;
    }

    public void setBooktype(Integer booktype) {
        this.booktype = booktype;
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