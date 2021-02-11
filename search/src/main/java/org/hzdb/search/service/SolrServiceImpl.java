package org.hzdb.search.service;

import org.hzdb.beans.pojo.dto.OutDto;
import org.hzdb.beans.pojo.vo.HotelOrderVo;
import org.hzdb.search.HotleSolrBean;
import org.springframework.data.domain.Sort;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.core.query.Criteria;
import org.springframework.data.solr.core.query.Query;
import org.springframework.data.solr.core.query.SimpleQuery;
import org.springframework.data.solr.core.query.result.ScoredPage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SolrServiceImpl implements  SolrService {
        @Resource
        private SolrTemplate solrTemplate;



        public OutDto getHotelListByHotCity(int cityid ){

                Query query=new SimpleQuery("*:*");//q
                query.addSort(new Sort(Sort.Direction.ASC,"id"));//sort
                Criteria criteria= new Criteria("id");//df
                // 根据名称查询
                // nullpoint

                criteria=criteria.and("keywords").contains("北京");
                criteria=criteria.and("cityId").is(861); // fq
                query.addCriteria(criteria);
                query.setOffset(0);// start
                query.setRows(10);// 每页 pagesize  rows
                ScoredPage<HotleSolrBean> sp =  solrTemplate.queryForPage("test1",query, HotleSolrBean.class);
                for ( HotleSolrBean o : sp.getContent()) {
                        System.out.println(o);
                }
              //  System.out.println(sp.getContent()); // 0  10
                System.out.println(sp.getContent().size());//10
                System.out.println(sp.getTotalElements());//63
                System.out.println(sp.getTotalPages());//7
                return null;

        }



}
