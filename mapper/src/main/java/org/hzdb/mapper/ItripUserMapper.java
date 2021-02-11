package org.hzdb.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.hzdb.beans.pojo.entity.ItripUser;
import org.hzdb.pojo.StroeVo.StoreVo;

public interface ItripUserMapper extends BaseMapper<ItripUser> {

        @Select(" {call pre_flush_store(#{checkInDate},#{checkOutDate},#{roomId},#{hotelId})}")
        int  callProcude(StoreVo storeVo);


}
