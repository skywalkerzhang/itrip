package org.hzdb.beans.pojo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 酒店房间表(ItripHotelRoom)实体类
 *
 * @author makejava
 * @since 2020-07-30 15:39:24
 */
public class ItripHotelRoom implements Serializable {
    private static final long serialVersionUID = 714865373840074546L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 酒店ID
    */
    private Long hotelid;
    /**
    * 房间名称
    */
    private String roomtitle;
    /**
    * 房间价格
    */
    private Double roomprice;
    /**
    * 酒店床型
    */
    private Long roombedtypeid;
    /**
    * 是否包含早餐
    */
    private Integer ishavingbreakfast;
    /**
    * 1:在线付 2:到店付 3:不限
    */
    private Integer paytype;
    /**
    * 满意度（冗余字段，在用户评论后更新）
    */
    private Double satisfaction;
    /**
    * 是否可预订(0:不可以 1:可以)
    */
    private Integer isbook;
    /**
    * 是否可取消(0:不可 1:可以)
    */
    private Integer iscancel;
    /**
    * 是否及时响应(0:不及时 1:及时)
    */
    private Integer istimelyresponse;
    
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

    public String getRoomtitle() {
        return roomtitle;
    }

    public void setRoomtitle(String roomtitle) {
        this.roomtitle = roomtitle;
    }

    public Double getRoomprice() {
        return roomprice;
    }

    public void setRoomprice(Double roomprice) {
        this.roomprice = roomprice;
    }

    public Long getRoombedtypeid() {
        return roombedtypeid;
    }

    public void setRoombedtypeid(Long roombedtypeid) {
        this.roombedtypeid = roombedtypeid;
    }

    public Integer getIshavingbreakfast() {
        return ishavingbreakfast;
    }

    public void setIshavingbreakfast(Integer ishavingbreakfast) {
        this.ishavingbreakfast = ishavingbreakfast;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Double getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(Double satisfaction) {
        this.satisfaction = satisfaction;
    }

    public Integer getIsbook() {
        return isbook;
    }

    public void setIsbook(Integer isbook) {
        this.isbook = isbook;
    }

    public Integer getIscancel() {
        return iscancel;
    }

    public void setIscancel(Integer iscancel) {
        this.iscancel = iscancel;
    }

    public Integer getIstimelyresponse() {
        return istimelyresponse;
    }

    public void setIstimelyresponse(Integer istimelyresponse) {
        this.istimelyresponse = istimelyresponse;
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