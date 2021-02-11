package org.hzdb.search;

import org.apache.solr.client.solrj.beans.Field;

public class HotleSolrBean {
        @Field
        private Integer id;
       @Field
        private String hotelname;
       @Field
        private String address;
       @Field
        private String details;
       @Field
        private  Integer cityId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
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

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "HotleSolrBean{" +
                "id=" + id +
                ", hotelname='" + hotelname + '\'' +
                '}';
    }
}
