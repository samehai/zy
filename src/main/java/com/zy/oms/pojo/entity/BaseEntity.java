package com.zy.oms.pojo.entity;

import io.swagger.annotations.ApiModelProperty;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.sql.Timestamp;

/**
 * @author Administrator
 */
@EntityListeners(value = AuditingEntityListener.class)
@MappedSuperclass
public class BaseEntity {
    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 乐观锁
     */
    @Version
    private Long version;

    /**
     * 创建记录人员主键
     */
    @Column
    @CreatedBy
    private Long cOperatorID;

    /**
     * 创建记录日期时间
     */
    @Column
    @CreatedDate
    private Timestamp cTime;

    /**
     * 更改记录人员主键
     */
    @Column
    @LastModifiedBy
    private Long uOperatorID;

    /**
     * 更改记录日期时间
     */
    @Column
    @LastModifiedDate
    private Timestamp uTime;

    /**
     * 删除记录人员主键
     */
    @Column
    private Long dOperatorID;

    /**
     * 删除记录日期时间
     */
    @Column
    private Timestamp dTime;
}