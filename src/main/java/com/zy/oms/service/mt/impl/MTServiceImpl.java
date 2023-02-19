package com.zy.oms.service.mt.impl;

//import com.ejlchina.searcher.BeanSearcher;
//import com.ejlchina.searcher.MapSearcher;
//import com.ejlchina.searcher.SearchResult;
//import com.ejlchina.searcher.operator.GreaterEqual;
//import com.ejlchina.searcher.util.MapUtils;
import com.zy.oms.service.mt.IMTService;
//import com.zhangzhe.oms.vo.Mdkc;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@Service
public class MTServiceImpl implements IMTService {
    /**
     * 注入 Map 检索器，它检索出来的数据以 Map 对象呈现
     */
//    @Autowired
//    private MapSearcher mapSearcher;
    /**
     * 注入 Bean 检索器，它检索出来的数据以 泛型 对象呈现
     */
//    @Autowired
//    private BeanSearcher beanSearcher;

    @Override
    public List<Map<String, Object>> medicineBatchUpdate(HttpServletRequest request) {
//        Map<String, Object> params = MapUtils.builder()
//                .field(Mdkc::getSl,0).op(GreaterEqual.class)
//                .field(Mdkc::getSubbh,"MD008X")
//                .build();
//        List<Map<String, Object>> search = mapSearcher.searchAll(Mdkc.class, params);
//
//        return search;
        return null;
    }
}
