package org.hzdb.beans.pojo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 酒店表(ItripHotel)实体类
 * @author makejava
 * @since 2020-07-30 15:39:24
 */
public class ItripHotel implements Serializable {
    private static final long serialVersionUID = -33202765898100873L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 酒店名称
    */
    private String hotelname;
    /**
    * 所在国家id
    */
    private Long countryid;
    /**
    * 所在省份id
    */
    private Long provinceid;
    /**
    * 所在城市id
    */
    private Long cityid;
    /**
    * 酒店所在地址
    */
    private String address;
    /**
    * 酒店介绍（保存附文本）
    */
    private String details;
    /**
    * 酒店设施
    */
    private String facilities;
    /**
    * 酒店政策
    */
    private String hotelpolicy;
    /**
    * 酒店类型(1:国内酒店 2:国际酒店)
    */
    private Integer hoteltype;
    /**
    * (1:经济酒店  2:二星级酒店  3:三星级 4:四星酒店 5星酒店)
    */
    private Integer hotellevel;
    /**
    * 是否是团购酒店
    */
    private Integer isgrouppurchase;
    /**
    * 城市名称 冗余字段
    */
    private String redundantcityname;
    /**
    * 省名称 冗余字段
    */
    private String redundantprovincename;
    /**
    * 国家名称 冗余字段
    */
    private String redundantcountryname;
    /**
    * 酒店库存（冗余，每天开定时任务的时候更新）
    */
    private Integer redundanthotelstore;
    
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

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public Long getCountryid() {
        return countryid;
    }

    public void setCountryid(Long countryid) {
        this.countryid = countryid;
    }

    public Long getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Long provinceid) {
        this.provinceid = provinceid;
    }

    public Long getCityid() {
        return cityid;
    }

    public void setCityid(Long cityid) {
        this.cityid = cityid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getHotelpolicy() {
        return hotelpolicy;
    }

    public void setHotelpolicy(String hotelpolicy) {
        this.hotelpolicy = hotelpolicy;
    }

    public Integer getHoteltype() {
        return hoteltype;
    }

    public void setHoteltype(Integer hoteltype) {
        this.hoteltype = hoteltype;
    }

    public Integer getHotellevel() {
        return hotellevel;
    }

    public void setHotellevel(Integer hotellevel) {
        this.hotellevel = hotellevel;
    }

    public Integer getIsgrouppurchase() {
        return isgrouppurchase;
    }

    public void setIsgrouppurchase(Integer isgrouppurchase) {
        this.isgrouppurchase = isgrouppurchase;
    }

    public String getRedundantcityname() {
        return redundantcityname;
    }

    public void setRedundantcityname(String redundantcityname) {
        this.redundantcityname = redundantcityname;
    }

    public String getRedundantprovincename() {
        return redundantprovincename;
    }

    public void setRedundantprovincename(String redundantprovincename) {
        this.redundantprovincename = redundantprovincename;
    }

    public String getRedundantcountryname() {
        return redundantcountryname;
    }

    public void setRedundantcountryname(String redundantcountryname) {
        this.redundantcountryname = redundantcountryname;
    }

    public Integer getRedundanthotelstore() {
        return redundanthotelstore;
    }

    public void setRedundanthotelstore(Integer redundanthotelstore) {
        this.redundanthotelstore = redundanthotelstore;
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