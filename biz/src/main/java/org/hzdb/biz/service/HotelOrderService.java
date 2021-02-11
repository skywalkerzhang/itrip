package org.hzdb.biz.service;

import org.hzdb.beans.pojo.dto.OutDto;
import org.hzdb.biz.vo.OrderVo;

public interface HotelOrderService {
    OutDto findOrderByQuery(OrderVo vo);
}
