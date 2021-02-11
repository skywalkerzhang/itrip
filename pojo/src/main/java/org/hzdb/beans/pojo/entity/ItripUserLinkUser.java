package org.hzdb.beans.pojo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (ItripUserLinkUser)实体类
 *
 * @author makejava
 * @since 2020-07-30 15:39:24
 */
public class ItripUserLinkUser implements Serializable {
    private static final long serialVersionUID = 729424176633122173L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 常用联系人姓名
    */
    private String linkusername;
    /**
    * 证件号码
    */
    private String linkidcard;
    /**
    * 常用联系人电话
    */
    private String linkphone;
    /**
    * 用户id
    */
    private Integer userid;
    
    private Date creationdate;
    
    private Long createdby;
    
    private Date modifydate;
    
    private Long modifiedby;
    /**
    * 证件类型：(0-身份证，1-护照，2-学生证，3-军人证，4-驾驶证，5-旅行证)
    */
    private Integer linkidcardtype;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLinkusername() {
        return linkusername;
    }

    public void setLinkusername(String linkusername) {
        this.linkusername = linkusername;
    }

    public String getLinkidcard() {
        return linkidcard;
    }

    public void setLinkidcard(String linkidcard) {
        this.linkidcard = linkidcard;
    }

    public String getLinkphone() {
        return linkphone;
    }

    public void setLinkphone(String linkphone) {
        this.linkphone = linkphone;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public Integer getLinkidcardtype() {
        return linkidcardtype;
    }

    public void setLinkidcardtype(Integer linkidcardtype) {
        this.linkidcardtype = linkidcardtype;
    }

}