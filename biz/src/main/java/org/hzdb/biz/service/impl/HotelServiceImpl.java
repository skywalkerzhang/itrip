package org.hzdb.biz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.hzdb.beans.pojo.dto.OutDto;
import org.hzdb.beans.pojo.entity.ItripAreaDic;
import org.hzdb.beans.pojo.entity.ItripHotelFeature;
import org.hzdb.beans.pojo.entity.ItripLabelDic;
import org.hzdb.biz.service.HotelService;
import org.hzdb.mapper.ItripAreaDicMapper;
import org.hzdb.mapper.ItripHotelFeatureDicMapper;
import org.hzdb.util.DateUtil;
import org.hzdb.util.DtoUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HotelServiceImpl implements HotelService {
    @Resource
    private ItripAreaDicMapper itripAreaDicMapper;
    @Resource
    private ItripHotelFeatureDicMapper itripHotelFeatureMapper;

    @Override
    public OutDto findHotCityByCountry(Long cid) {
        Map map = new HashMap<String,Long>();
        map.put("isChina",cid);
        map.put("isHot",1);

        List<ItripAreaDic> list = itripAreaDicMapper.selectByMap(map);
        return DtoUtil.getSuccessWithData("查询成功",list);
    }

    @Override
    public OutDto selectFeature() {
        List<ItripLabelDic> list= itripHotelFeatureMapper.selectList(new QueryWrapper<ItripLabelDic>().eq("parentid",16));
        return DtoUtil.getSuccessWithData("查询成功",list);
    }
}

