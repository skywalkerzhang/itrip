package org.hzdb.beans.pojo.vo;

public class Token {
        private long expTime;
        private long genTime;
        private String token;

    public long getExpTime() {
        return expTime;
    }

    public void setExpTime(long expTime) {
        this.expTime = expTime;
    }

    public long getGenTime() {
        return genTime;
    }

    public void setGenTime(long genTime) {
        this.genTime = genTime;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
