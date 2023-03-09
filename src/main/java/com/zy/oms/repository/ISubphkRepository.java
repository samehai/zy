package com.zy.oms.repository;

import com.zy.oms.pojo.entity.Subphk;
import com.zy.oms.pojo.entity.SubphkId;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ISubphkRepository extends IBaseRepository<Subphk, SubphkId>{
    //@PersistenceContext
    //private EntityManager entityManager;//放在调用处
    /**
     * 自定义查询
     * @param sql    例："select new pers.zpw.domain.CityHohel(t1.name AS cityName,t2.name AS hotelName) from  TCity t1 left  join THotel t2 on t1.id=t2.city where t2.name ='酒店'"
     * @param entityManager
     * @return
     */
    default List customQuery(@NotNull String sql, @NotNull EntityManager entityManager) {
        return entityManager.createQuery(sql).getResultList();
    }

    @Modifying
    @Transactional(rollbackFor = Exception.class)
    @Query(nativeQuery = true, value = "update subphk set xq = :xq where hh = :hh")
    int update1(@Param("xq") String xq, @Param("hh") String hh);

    /***
     * 通过门店编码和货号取库存，这里用到了组合外键的部分字段做为条件，其使用格式是 组合外键字段名_字段名
     * @param subbh 门店编码
     * @param hh 货号
     * @param sl 数量
     * @return
     */
    List<Subphk> findAllById_SubbhAndHhAndSlGreaterThan(String subbh, String hh, int sl);
}
