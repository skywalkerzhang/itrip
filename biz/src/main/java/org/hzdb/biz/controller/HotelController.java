package org.hzdb.biz.controller;

import com.oracle.jrockit.jfr.ValueDefinition;
import org.hzdb.beans.pojo.dto.OutDto;
import org.hzdb.biz.service.HotelService;
import org.hzdb.util.DtoUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api/")
public class HotelController {
    @Resource
    private HotelService hotelService;


    @GetMapping("hotel/queryhotcity/{cid}")
    public OutDto queryhotcity(@PathVariable("cid") Long cid){//1  2
        return  hotelService.findHotCityByCountry(cid);
      //  return DtoUtil.getSuccessDto("查看热点城市成功");
    }
    @GetMapping("hotel/queryhotelfeature")
    public OutDto queryhotelfeature(){

       return hotelService.selectFeature();
        //return DtoUtil.getSuccessDto("查看酒店特性成功");
    }

}
