package com.zy.oms.controller;

//import com.ejlchina.searcher.SearchResult;
import com.sankuai.meituan.shangou.open.sdk.dto.MedicineInfoDto;
import com.zy.oms.dto.LbCountSum;
import com.zy.oms.pojo.entity.YwKck;
//import com.zy.oms.vo.Mdkc;
import com.zy.oms.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * 商品档案的增删改查相关接口
 * @author Administrator
 */
@Api(tags = "商品档案管理api")
@RequestMapping("api/v1/ywkck")
public interface IYwKckController {
    /**
     * 创建商品档案
     * @param ywkck
     */
    @PostMapping
    @ApiOperation(value = "创建单个商品档案")
    HashMap<String, Object> createYwKck(@RequestBody YwKck ywkck);

    /**
     * 创建多个商品档案
     * @param ywKcks
     */
    @PostMapping("cl")
    @ApiOperation(value = "批量创建多个商品档案")
    HashMap<String, Object> createYwKckLists(@RequestBody List<YwKck> ywKcks);

    /**
     * 通过ID获取商品档案
     * @param id
     * @param ywkck
     */
    @PutMapping("{id}")
    @ApiOperation(value = "修改单个商品档案")
    void updateYwKck(@PathVariable Long id, @RequestBody YwKck ywkck);

    /**
     * 删除商品档案
     */
    @DeleteMapping("{id}")
    @ApiOperation(value = "删除单个商品档案")
    void deleteYwKck(@PathVariable("id") Long id);

    /**
     * 查询指定商品档案
     */
    @GetMapping("one/{hh}")
    @ApiOperation(value = "通过货号获得商品档案")
    Result<MedicineInfoDto> getOneYwKck(@PathVariable String hh);

    /**
     * 查询所有商品档案，支持分页,例：http://127.0.0.1:8080/ywkck/all?pageNum=5&pageSize=8
     * @return
     */
//    @GetMapping({"all","allin"})
//    @ApiOperation(value = "获得所有商品档案，分页")
//    List<Mdkc> getAllYwKck(@RequestParam(required = false) Integer pageNum,
//                           @RequestParam(required = false) Integer pageSize);

    /**
     * 查询所有商品档案，支持分页,例：http://127.0.0.1:8080/ywkck/all?pageNum=5&pageSize=8
     * @return
     */
    @GetMapping({"test"})
    @ApiOperation(value = "测试")
    String testYwKck();

    /**
     * 获取商品档案数量
     */
    @GetMapping("getAllYwKckCount")
    long getYwKckCount();

    /**
     * 获取所有商品档案
     */
    @GetMapping("getAllYwKck")
    List<YwKck> getAllYwKck();

    /**
     * 获取商品档案按类别汇总商品数量
     */
    @GetMapping("getLbCountSumLsj")
    List<LbCountSum> getLbCountSumLsj();

//    @GetMapping("/index")
//    SearchResult<Map<String, Object>> index(HttpServletRequest request);
}