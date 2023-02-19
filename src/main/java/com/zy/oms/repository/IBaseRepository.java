package com.zy.oms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.QueryByExampleExecutor;

/**
 * @author ZhangZhe
 * JPA数据方问公共基类
 */
@NoRepositoryBean
public interface IBaseRepository<T,ID> extends JpaRepository<T, ID> //1.实现分页排序和CRUD
        , QueryByExampleExecutor<T>                  // 2.实现动态条件：快速精确匹配（查）
        , JpaSpecificationExecutor<T>                // 3.实现动态条件：Specification（查）
{
}
