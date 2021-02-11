package org.hzdb.pojo.StroeVo;

import java.io.Serializable;
import java.util.Date;

//#{checkInDate},#{checkOutDate},#{roomId},#{hotelId}
public class StoreVo implements Serializable {

        private Date checkInDate;
        private Date checkOutDate;
        private Long roomId;
        private Long hotelId;

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }
}
