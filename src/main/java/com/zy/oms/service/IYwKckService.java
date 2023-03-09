package com.zy.oms.service;

//import com.ejlchina.searcher.SearchResult;
import com.sankuai.meituan.shangou.open.sdk.dto.MedicineInfoDto;
import com.zy.oms.dto.LbCountSum;
import com.zy.oms.dto.MT.MedicineListDto;
import com.zy.oms.pojo.entity.YwKck;
import jakarta.persistence.EntityManager;
import jakarta.validation.constraints.NotNull;
import java.util.List;

public interface IYwKckService {
//    List<Mdkc> getAllYwKck();

    long getAllYwKckCount();

    List<YwKck> getAllYwKck();


    List<MedicineInfoDto> getAllByHh(@NotNull String hh);
    /**
     * @return
     */
    List<LbCountSum> getLbCountSumLsj();

    /**
     * 自定义查询
     * @param sql,自定义的SQL查询语句
     * @param entityManager
     * @return
     */
    List customQuery(String sql, @NotNull EntityManager entityManager);

//    SearchResult<Map<String, Object>> getIndex(HttpServletRequest request);

}
