package com.zy.oms.service.impl;

import com.zy.oms.pojo.entity.Subphk;
import com.zy.oms.repository.ISubphkRepository;
import com.zy.oms.service.ISubphkService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubphkServiceImpl implements ISubphkService {
    private final ISubphkRepository iSubphkRepository;

    public SubphkServiceImpl(ISubphkRepository iSubphkRepository) {
        this.iSubphkRepository = iSubphkRepository;
    }

    /**
     * @param subbh 门店编码
     * @param hh    货号
     * @return
     */
    @Override
    public List<Subphk> getSubphkByHh(String subbh, String hh) {
        return iSubphkRepository.findAllById_SubbhAndHhAndSlGreaterThan(subbh,hh,0);
    }
}
