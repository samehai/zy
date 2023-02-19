package com.zy.oms.dto.MT;

import java.math.BigDecimal;

/**
 * @author 张哲
 * @version 1.0
 * @since
 * @Date 2022-08-07
 * @URL https://waimaiopen.meituan.com/api/v1/medicine/batchupdate
 * @Notes 多个药品数据集合的json格式数组：(1)可传参数及逻辑与单个接口【medicine/update 更新药品】中各参数规则一致，请查看单个接口文档的详细描述。
 *        (2)可传药品数据限定不能超过200组。(3)支持药品部分同步成功，部分同步失败。
 */
//public class MedicineListDto {
//    //APP方药品id，即商家中台系统里药品的编码（spu_code值）。
//    private String app_medicine_code;
//    //药品价格,最大允许30000.00
//    private BigDecimal price;
//    //药品库存，最大允许9999999
//    private int stock;
//    //分类code：(1)此字段信息需传入门店内存在的末级分类的分类code。(2)一次调用可以传多个分类，最多不超过5个分类，用英文逗号隔开。(3)商家未传递分类code时，根据分类名称查询或操作分类
//    private String category_code;
//    //分类名称：(1)此字段信息需传入门店内已存在的末级分类的分类名称。(2)一次调用可以传多个分类，最多不超过5个分类，用英文逗号隔开。(3)商家未传递分类code时，根据分类名称查询或操作分类
//    private String category_name;
//    //一级分类在当前门店内的排序序号，数字越小，前端排位越靠前。
//    private int sequence;
//    //限售条件，例：{\"limitSale\":true,\"type\":1,\"begin\":\"20200216\",\"count\":10.6,\"end\":\"20200221\"}
//    private String limit_sale_info;
//    //药品最近有效期，格式: 年-月-日
//    private String expiry_date;
//
//    public MedicineListDto(String app_medicine_code, BigDecimal price, int stock, String category_code, String category_name, int sequence, String limit_sale_info, String expiry_date) {
//        this.app_medicine_code = app_medicine_code;
//        this.price = price;
//        this.stock = stock;
//        this.category_code = category_code;
//        this.category_name = category_name;
//        this.sequence = sequence;
//        this.limit_sale_info = limit_sale_info;
//        this.expiry_date = expiry_date;
//    }
//
//    public void setApp_medicine_code(String app_medicine_code) {
//        this.app_medicine_code = app_medicine_code;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }
//
//    public void setStock(int stock) {
//        this.stock = stock;
//    }
//
//    public void setCategory_code(String category_code) {
//        this.category_code = category_code;
//    }
//
//    public void setCategory_name(String category_name) {
//        this.category_name = category_name;
//    }
//
//    public void setSequence(int sequence) {
//        this.sequence = sequence;
//    }
//
//    public void setLimit_sale_info(String limit_sale_info) {
//        this.limit_sale_info = limit_sale_info;
//    }
//
//    public void setExpiry_date(String expiry_date) {
//        this.expiry_date = expiry_date;
//    }
//
//    public String getApp_medicine_code() {
//        return app_medicine_code;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public int getStock() {
//        return stock;
//    }
//
//    public String getCategory_code() {
//        return category_code;
//    }
//
//    public String getCategory_name() {
//        return category_name;
//    }
//
//    public int getSequence() {
//        return sequence;
//    }
//
//    public String getLimit_sale_info() {
//        return limit_sale_info;
//    }
//
//    public String getExpiry_date() {
//        return expiry_date;
//    }
//
//    public MedicineListDto() {
//        super();
//    }
//
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//}

public record MedicineListDto(String app_medicine_code,BigDecimal price,int stock,String category_code,String category_name,int sequence,String limit_sale_info,String expiry_date)
{}