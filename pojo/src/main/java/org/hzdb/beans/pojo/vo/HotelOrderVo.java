package org.hzdb.beans.pojo.vo;

import java.io.Serializable;
import java.util.Date;

public class HotelOrderVo implements Serializable {
    /**
     * 主键
     */
    private Long id;
    /**
     * 订单类型(0:旅游产品 1:酒店产品 2：机票产品)
     */
    private Integer orderType;
    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 冗余字段 酒店id
     */
    private Long hotelId;
    /**
     * 冗余字段 酒店名称
     */
    private String hotelName;
    /**
     * 入住时间
     */
    private Date checkinDate;
    /**
     * 创建时间
     */
    private Date creationDate;
    /**
     * 订单状态（0：待支付 1:已取消 2:支付成功 3:已消费 4：已点评）
     */
    private Integer orderStatus;
    /**
     * 支付金额
     */
    private Double payAmount;

    /**
     * 入住人名称
     */
    private String linkUserName;

    @Override
    public String toString() {
        return "HotelOrderVo{" +
                "id=" + id +
                ", orderType=" + orderType +
                ", orderNo='" + orderNo + '\'' +
                ", hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", checkinDate=" + checkinDate +
                ", creationDate=" + creationDate +
                ", orderStatus=" + orderStatus +
                ", payAmount=" + payAmount +
                ", linkUserName='" + linkUserName + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Double getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }

    public String getLinkUserName() {
        return linkUserName;
    }

    public void setLinkUserName(String linkUserName) {
        this.linkUserName = linkUserName;
    }
}
