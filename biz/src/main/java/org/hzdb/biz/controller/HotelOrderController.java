package org.hzdb.biz.controller;

import org.hzdb.beans.pojo.dto.OutDto;
import org.hzdb.biz.service.HotelOrderService;
import org.hzdb.biz.vo.OrderVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/hotelorder/")
public class HotelOrderController {
        @Resource
        private HotelOrderService orderService;

//{"orderStatus":-1,"orderType":-1,"pageSize":6,"pageNo":1}
        @PostMapping("getpersonalorderlist")
        public OutDto getOrderList(@RequestBody OrderVo vo){

            return     orderService.findOrderByQuery(vo);

        }

}
