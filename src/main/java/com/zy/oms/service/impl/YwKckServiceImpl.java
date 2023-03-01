package com.zy.oms.service.impl;

//import com.ejlchina.searcher.BeanSearcher;
//import com.ejlchina.searcher.MapSearcher;
//import com.ejlchina.searcher.SearchResult;
//import com.ejlchina.searcher.operator.Equal;
//import com.ejlchina.searcher.operator.GreaterEqual;
//import com.ejlchina.searcher.util.MapUtils;
//import com.querydsl.core.types.dsl.BooleanExpression;
//import com.querydsl.core.types.dsl.Expressions;
//import com.querydsl.core.types.dsl.NumberPath;
import com.sankuai.meituan.shangou.open.sdk.dto.MedicineInfoDto;
import com.zy.oms.Mapper.MTDtoMapper;
import com.zy.oms.common.annotation.UsingDataSource;
import com.zy.oms.dto.LbCountSum;
//import com.zy.vo.Mdkc;
//import com.zy.pojo.entity.QSubphk;
//import com.zy.pojo.entity.QYwKck;
//import com.zy.pojo.entity.YwKck;
import com.zy.oms.dto.MT.MedicineListDto;
import com.zy.oms.pojo.entity.YwKck;
import com.zy.oms.repository.IYwKckRepository;
import com.zy.oms.service.IYwKckService;
//import com.zy.utils.Dsl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 */
@Service
public class YwKckServiceImpl implements IYwKckService {
    private final IYwKckRepository ywKCKRepository;

    public YwKckServiceImpl(IYwKckRepository ywKCKRepository) {
        this.ywKCKRepository = ywKCKRepository;
    }
//    @PersistenceContext
//    private EntityManager em;

    /**
     * 注入 Map 检索器，它检索出来的数据以 Map 对象呈现
     */
//    @Autowired
//    private MapSearcher mapSearcher;
//    /**
//     * 注入 Bean 检索器，它检索出来的数据以 泛型 对象呈现
//     */
//    @Autowired
//    private BeanSearcher beanSearcher;

    @Override
    public List<LbCountSum> getLbCountSumLsj() {

//        List<User> users = queryFactory.selectFrom(user)
//                .where(user.id.in(
//                        JPAExpressions.select(blogPost.user.id)
//                                .from(blogPost)
//                                .where(blogPost.title.eq("Hello World!"))))
//                .fetch();
//
//        QTbOrderInfo tbOrderInfo = QTbOrderInfo.tbOrderInfo;
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.HOUR,-2);
//        Predicate predicate = tbOrderInfo.suspendStatus.eq(SuspendStatusEnum.SUSPEND.getCode())
//                .and(tbOrderInfo.orderState.gt(2))
//                .and(tbOrderInfo.operatorId.eq("2222222"))
//                .and(tbOrderInfo.userStopTime.after(new Timestamp(calendar.getTime().getTime())));
//        List<TbOrderInfo> tbOrderInfos = jpaQueryFactory.select(Projections.fields(TbOrderInfo.class,lxTbOrderInfo.orderId,TbOrderInfo.connectorId, TbOrderInfo.orderState, TbOrderInfo.suspendStatus))
//                .from(TbOrderInfo)
//                .where(predicate)
//                .fetch();

//        final QYwKck ywKck = QYwKck.ywKck;
//        NumberPath<Long> lbCount = Expressions.numberPath(Long.class, "lbCount");
//        NumberPath<BigDecimal> lsjSum = Expressions.numberPath(BigDecimal.class, "lsjSum");
//        return Dsl.factory.select(
//                        ywKck.lb,
//                        ywKck.hh.countDistinct().as(lbCount),
//                        ywKck.lsj.sum().as(String.valueOf(lsjSum)))
//                .from(ywKck)
//                .groupBy(ywKck.lb)
//                .orderBy(ywKck.lb.asc())
//                .fetchAll()
//                .stream()
//                .map(tuple -> {
//                    LbCountSum lbCountSum = new LbCountSum();
//                    lbCountSum.setLb(tuple.get(ywKck.lb));
//                    lbCountSum.setLbCount(tuple.get(lbCount));
//                    lbCountSum.setLsjSum(tuple.get(lsjSum));
//                    return  lbCountSum;
//                }).collect(Collectors.toList());
//        //tuples.forEach(System.out::println);
        return null;
    }

    @Override
    public long getAllYwKckCount() {
//        //final JPAQuery query = new JPAQuery(entityManager);
//        final QYwKck ywKck = QYwKck.ywKck;
//        //final JPAQuery query = new JPAQuery(em);
//        //return (long) query.from(ywKck).select(ywKck.hh.countDistinct()).fetchFirst();
//        return Dsl.factory.from(ywKck).select(ywKck.hh.countDistinct()).fetchFirst();
        return ywKCKRepository.count();
        //return 1L;
    }

    @Override
    public List<MedicineInfoDto> getAllByHh(String hh) {
        List<YwKck> byHh = ywKCKRepository.findByHh(hh);
//        List<MedicineListDto> collect = byHh.stream().map(
//                mld -> {
//                    MedicineListDto medicineListDto = new MedicineListDto(
//                            mld.getHh(),
//                            mld.getLsj(),
//                            100,
//                            null,
//                            null,
//                            0,
//                            null,
//                            null
//                    );
//                    return medicineListDto;
//                }
//        ).collect(Collectors.toList());
        List<MedicineInfoDto> collect = byHh.stream().map(
                mid -> {
                    MedicineInfoDto medicineInfoDto = new MedicineInfoDto();
                    medicineInfoDto.setMedicine_no(mid.getHh());
                    medicineInfoDto.setPrice(mid.getLsj().toString());
                    medicineInfoDto.setSpec(mid.getGg());
                    medicineInfoDto.setUpc(mid.getTm());
                    medicineInfoDto.setMedicine_no(mid.getPzwh());
                    medicineInfoDto.setStock("100");
                    medicineInfoDto.setIs_sold_out("1");
                    return medicineInfoDto;
                }
        ).collect(Collectors.toList());
        return collect;
    }

    @Override
    public List<YwKck> getAllYwKck() {
        System.out.println(new Date());
        return ywKCKRepository.findAll();
    }

    //@Autowired //存在线程安全问题，用PersistenceContext来解决
    //@PersistenceContext
    //JPAQueryFactory queryFactory;


//    @Override
//    public List<Mdkc> getAllYwKck() {
////        final QYwKck ywKck = QYwKck.ywKck;
////        final QSubphk subphk = QSubphk.subphk;
////
////        BooleanExpression be = subphk.hh.eq("13406").and(subphk.sl.gt(BigDecimal.valueOf(0L)));
////
////        //采用java8新特性返回自定义结果集
////        return Dsl.factory.select(
////                subphk.id.subbh,subphk.hh,ywKck.pm,subphk.sl,ywKck.jj
////                ).from(subphk)
////                .innerJoin(ywKck).on(subphk.hh.eq(ywKck.hh))
////                //.where(subphk.hh.eq("13406"),subphk.sl.gt(0))
////                .where(be)
////                .orderBy(subphk.id.subbh.asc(),subphk.hh.asc())
////                .fetch()
////                .stream()
////                .map(tuple -> {
////                    Mdkc mdkc = new Mdkc();
////                    mdkc.setSubbh(tuple.get(subphk.id.subbh));
////                    mdkc.setHh(tuple.get(subphk.hh));
////                    mdkc.setPm2(tuple.get(ywKck.pm));
////                    mdkc.setSl(tuple.get(subphk.sl));
////                    mdkc.setJj(tuple.get(ywKck.jj));
////                    return mdkc;
////                })
////                .collect(Collectors.toList());
//        return null;
//    }


    @Override
    public List customQuery(String sql, EntityManager entityManager) {
        return entityManager.createQuery(sql).getResultList();
    }

//    @Override
//    public SearchResult<Map<String, Object>> getIndex(HttpServletRequest request) {
//        // 一行代码，实现一个用户检索接口（MapUtils.flat 只是收集前端的请求参数）
//        //return mapSearcher.search(Mdkc.class, MapUtils.flat(request.getParameterMap()));
//
//        //分页
////        Map<String, Object> params = MapUtils.builder()
////                .page(0, 15)                    // 第 0 页，每页 15 条（推荐写法）
////                .field(Mdkc::getSl,0).op(GreaterEqual.class)
////                //.put("page", 0)                 // 等效写法
////                //.put("size", 15)                // 等效写法
////                .build();
////        SearchResult<Map<String, Object>> search = mapSearcher.search(Mdkc.class, params);
////
////        return search;
//        return null;
//    }
}
