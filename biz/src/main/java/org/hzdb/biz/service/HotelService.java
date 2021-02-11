package org.hzdb.biz.service;

import org.hzdb.beans.pojo.dto.OutDto;

public interface HotelService {
    OutDto findHotCityByCountry(Long cid);

    OutDto selectFeature();
}
