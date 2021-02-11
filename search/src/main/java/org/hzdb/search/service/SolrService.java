package org.hzdb.search.service;

import org.hzdb.beans.pojo.dto.OutDto;

public interface SolrService {

    OutDto getHotelListByHotCity(int cityid);
}
