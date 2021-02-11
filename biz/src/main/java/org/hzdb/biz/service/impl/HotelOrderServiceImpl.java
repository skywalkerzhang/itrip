package org.hzdb.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.hzdb.beans.pojo.dto.OutDto;
import org.hzdb.beans.pojo.entity.ItripHotelOrder;
import org.hzdb.beans.pojo.vo.HotelOrderVo;
import org.hzdb.biz.service.HotelOrderService;
import org.hzdb.biz.vo.OrderVo;
import org.hzdb.mapper.ItripHotelOrderMapper;
import org.hzdb.util.DtoUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HotelOrderServiceImpl implements HotelOrderService {
    @Resource
    private ItripHotelOrderMapper itripHotelOrderMapper;

    @Override
    public OutDto findOrderByQuery(OrderVo vo) {
        IPage page=new Page(vo.getPageNo()*vo.getPageSize(),vo.getPageSize(),true);
        page.setPages(vo.getPageNo());
        QueryWrapper qw =new QueryWrapper<ItripHotelOrder>();
        if(vo.getOrderType()>0){
            qw.eq("ordertype",vo.getOrderType());
        }
        if(vo.getOrderStatus()>=0){
            qw.eq("orderstatus",vo.getOrderStatus());
        }
        page = itripHotelOrderMapper.selectPage(page,qw);
        //beginPos":6,"curPage":2,"pageCount":19,"pageSize":6,"total":109
        //{"orderStatus":-1,"orderType":-1,"pageSize":6,"pageNo":1}
        Map map = new HashMap<>();
        System.out.println(page.getTotal());
        System.out.println(page.getSize());
        map.put("beginPos",page.getCurrent());
        map.put("curPage",vo.getPageNo());
        map.put("pageCount",(page.getRecords().size()+vo.getPageSize()-1)/vo.getPageSize());
        map.put("pageSize",vo.getPageSize());
        map.put("rows",page.getRecords());
        map.put("total",page.getRecords().size());
        List<ItripHotelOrder> list= page.getRecords();
        HotelOrderVo v=new HotelOrderVo();
        for (ItripHotelOrder itripHotelOrder : list) {
            BeanUtils.copyProperties(itripHotelOrder,v);
            System.out.println(v);

        }



        return DtoUtil.getSuccessWithData("success",page);
    }
}
