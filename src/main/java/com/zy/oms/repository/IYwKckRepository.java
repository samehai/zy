package com.zy.oms.repository;

import com.zy.oms.pojo.entity.YwKck;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhangzhe
 * @Classname IYwKCK
 * @Description 商品档案实体类仓库
 * @Date 2022/1/13 15:12
 * @Created by zhangzhe
 */
@Repository
public interface IYwKckRepository extends IBaseRepository<YwKck, Long>
{

    /**
     * 5.还可以根据规定方法名进行快速定制持久化操作（查删），通过品名查找商品
     * @param name 品名
     * @return 商品档案列表
     */
    List<YwKck> findByPmLike(String name);

    // 如果你想自定义语句查询，依然提供：

    /**
     * 6.通过JPQL进行持久化操作（增删改查），通过货号查找商品
     * @param hh 商品货号
     * @return 商品档案列表
     */
    List<YwKck> findByHh(String hh);

    /**
     * 7.通过原生SQL进行持久化操作（增删改查），通过条形码查找商品
     * @param tm 商品条形码
     * @return 商品档案列表
     */
    @Query(value="select * FROM yw_kck where tm=:tm ",countQuery = "select count(*) FROM yw_kck where tm=:tm",nativeQuery = true)
    List<YwKck> findYwKckByTmBySql(@Param("tm") String tm);

    /**
     * 8.查找所有商品档案
     * @return 所有商品档案
     */
    @Query("FROM YwKck AS A")
    List<YwKck> findAll();
}