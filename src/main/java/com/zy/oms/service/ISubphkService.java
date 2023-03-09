package com.zy.oms.service;

import com.zy.oms.pojo.entity.Subphk;

import java.util.List;

public interface ISubphkService {
    /**
     * @param subbh 门店编码
     * @param hh 货号
     * @return 库存集合
     */
    List<Subphk> getSubphkByHh(String subbh,String hh);
}
