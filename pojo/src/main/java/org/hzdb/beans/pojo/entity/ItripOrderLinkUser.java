package org.hzdb.beans.pojo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (ItripOrderLinkUser)实体类
 *
 * @author makejava
 * @since 2020-07-30 15:39:24
 */
public class ItripOrderLinkUser implements Serializable {
    private static final long serialVersionUID = -55984798258993993L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 订单id
    */
    private Long orderid;
    /**
    * 联系人id
    */
    private Long linkuserid;
    /**
    * 入住人姓名逗号分隔
    */
    private String linkusername;
    
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

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public Long getLinkuserid() {
        return linkuserid;
    }

    public void setLinkuserid(Long linkuserid) {
        this.linkuserid = linkuserid;
    }

    public String getLinkusername() {
        return linkusername;
    }

    public void setLinkusername(String linkusername) {
        this.linkusername = linkusername;
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