package com.zy.oms.controller.impl;

//import com.ejlchina.searcher.SearchResult;
import com.sankuai.meituan.shangou.open.sdk.dto.MedicineInfoDto;
import com.zy.oms.controller.IYwKckController;
import com.zy.oms.dto.LbCountSum;
import com.zy.oms.pojo.entity.YwKck;
import com.zy.oms.service.IYwKckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class YwKckControllerImpl implements IYwKckController {
    private final IYwKckService iYwKckService;

    public YwKckControllerImpl(IYwKckService iYwKckService) {
        this.iYwKckService = iYwKckService;
    }

    @Override
    public HashMap<String, Object> createYwKck(YwKck ywkck) {
        HashMap<String, Object> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("code","200");
        stringStringHashMap.put("msg","成功");
        stringStringHashMap.put("data",null);
        return  stringStringHashMap;
    }

    @Override
    public HashMap<String, Object> createYwKckLists(List<YwKck> ywKcks) {return null;}

    @Override
    public void updateYwKck(Long id, YwKck ywkck) {
        System.out.println("id is :"+id+"ywkck is :"+ywkck);
    }

    @Override
    public void deleteYwKck(Long id) {

    }

    @Override
    public String testYwKck() {
        return "test";
    }

    @Override
    public long getYwKckCount() {
        return iYwKckService.getAllYwKckCount();
    }

    @Override
    public List<YwKck> getAllYwKck() {
        return iYwKckService.getAllYwKck();
    }

    @Override
    public List<LbCountSum> getLbCountSumLsj() {
        return iYwKckService.getLbCountSumLsj();
    }

//    @Override
//    public SearchResult<Map<String, Object>> index(HttpServletRequest request) {
//        return iYwKckService.getIndex(request);
//    }

    @Override
    public List<MedicineInfoDto> getOneYwKck(String hh) {
        return iYwKckService.getAllByHh(hh);
    }

//    @Override
//    public List<Mdkc> getAllYwKck(Integer pageNum, Integer pageSize) {
//        List<Mdkc> all = iYwKckService.getAllYwKck();
//        return all;
//    }
}
