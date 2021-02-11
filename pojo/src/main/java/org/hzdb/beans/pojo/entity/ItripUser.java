package org.hzdb.beans.pojo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 用户表(ItripUser)实体类
 *
 * @author makejava
 * @since 2020-07-30 15:39:24
 */

public class ItripUser implements Serializable {
    private static final long serialVersionUID = 306725819675384600L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 若是第三方登录，系统将自动生成唯一账号；自注册用户则为邮箱或者手机号
    */
    private String usercode;
    /**
    * 若是第三方登录，系统将自动生成唯一密码；自注册用户则为自定义密码
    */
    private String userpassword;
    /**
    * 用户类型（标识：0 自注册用户 1 微信登录 2 QQ登录 3 微博登录）
    */
    private Integer usertype;
    /**
    * 平台ID（根据不同登录用户，进行相应存入：自注册用户主键ID、微信ID、QQID、微博ID）
    */
    private Long flatid;
    /**
    * 用户昵称
    */
    private String username;
    /**
    * 微信号
    */
    private String wechat;
    /**
    * qq账号
    */
    private String qq;
    /**
    * 微博账号
    */
    private String weibo;
    /**
    * 百度账号
    */
    private String baidu;
    
    private Date creationdate;
    
    private Long createdby;
    
    private Date modifydate;
    
    private Long modifiedby;
    /**
    * 是否激活,(0 false，1 true,默认是0)
    */
    private Integer activated;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public Long getFlatid() {
        return flatid;
    }

    public void setFlatid(Long flatid) {
        this.flatid = flatid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeibo() {
        return weibo;
    }

    public void setWeibo(String weibo) {
        this.weibo = weibo;
    }

    public String getBaidu() {
        return baidu;
    }

    public void setBaidu(String baidu) {
        this.baidu = baidu;
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

    public Integer getActivated() {
        return activated;
    }

    public void setActivated(Integer activated) {
        this.activated = activated;
    }

}