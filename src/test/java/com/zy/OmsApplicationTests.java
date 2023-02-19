//package com.zy;
//
//import com.sankuai.meituan.shangou.open.sdk.domain.SystemParam;
//import com.sankuai.meituan.shangou.open.sdk.dto.MedicineInfoDto;
//import com.sankuai.meituan.shangou.open.sdk.exception.SgOpenException;
//import com.sankuai.meituan.shangou.open.sdk.request.MedicineBatchUpdateRequest;
//import com.sankuai.meituan.shangou.open.sdk.request.MedicineListRequest;
//import com.sankuai.meituan.shangou.open.sdk.request.MedicineUpdateRequest;
//import com.sankuai.meituan.shangou.open.sdk.response.SgOpenResponse;
//import org.assertj.core.util.Lists;
//import org.junit.Assert;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import java.io.IOException;
//import java.time.LocalDateTime;
//import java.time.ZoneId;
//import java.time.ZoneOffset;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Stream;
//
//@SpringBootTest
//@SpringBootConfiguration
//@RunWith(SpringJUnit4ClassRunner.class)
////@AutoConfigureMockMvc
//class OmsApplicationTests {
//
//    //@Autowired
//    //RestTemplate restTemplate;
//
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//
//    private MockMvc mockMvc;
//
//    @BeforeEach
//    public void setUp() throws Exception{
//        System.out.println("看看是否被执行");
//        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();//建议使用这种
//    }
//
//    @Test
//    void contextLoads() {
//        System.out.println("zhangzhe");
//    }
///*
//    @Test
//    public List<Operator> testRestTemplate() throws IOException, JSONException {
//        HashMap<String,Object> map = new HashMap<>();
//        map.put("typeId",1);
//        ResponseEntity<String> responseEntity=restTemplate.getForEntity("接口地址", String.class, map);
//        String boby=responseEntity.getBody();
//        JSONObject jsonObject = JSONObject.parseObject(boby);
//        List<Operator> alertInfoByTypeIdList= (List<Operator>) jsonObject.get("data");
//        System.out.println("*****************************************************");
//        System.out.println("当前时间："+ LocalTime.now());
//        System.out.println(responseEntity);
//        System.out.println(boby);
//        System.out.println(alertInfoByTypeIdList);
//        return alertInfoByTypeIdList;
//    }*/
//
//    @Test
//    public void testHello() throws Exception {
//        /**
//         * 1、mockMvc.perform执行一个请求。
//         * 2、MockMvcRequestBuilders.get("XXX")构造一个请求。
//         * 3、ResultActions.param添加请求传值
//         * 4、ResultActions.accept(MediaType.TEXT_HTML_VALUE))设置返回类型
//         * 5、ResultActions.andExpect添加执行完成后的断言。
//         * 6、ResultActions.andDo添加一个结果处理器，表示要对结果做点什么事情
//         *   比如此处使用MockMvcResultHandlers.print()输出整个响应结果信息。
//         * 5、ResultActions.andReturn表示执行完成后返回相应的结果。
//         */
//
//        MvcResult mvcResult= mockMvc.perform(MockMvcRequestBuilders.get("/ywkck/all")
//                        //.param("name","lvgang")
//                        .accept(MediaType.APPLICATION_JSON_VALUE))
//                // .andExpect(MockMvcResultMatchers.status().isOk())             //等同于Assert.assertEquals(200,status);
//                // .andExpect(MockMvcResultMatchers.content().string("hello lvgang"))    //等同于 Assert.assertEquals("hello lvgang",content);
//                .andDo(MockMvcResultHandlers.print())
//                .andReturn();
//        int status=mvcResult.getResponse().getStatus();                 //得到返回代码
//        String content=mvcResult.getResponse().getContentAsString();    //得到返回结果
//
//        Assert.assertEquals(200,status);                        //断言，判断返回代码是否正确
//        //Assert.assertEquals("hello lvgang",content);            //断言，判断返回的值是否正确
//    }
//
//    @Test
//    public void testJava(){
//        List<Integer> list = Lists.newArrayList(1, 2, 32, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0);
//        // 删除列表中大于5的数
//        list.removeIf(item -> item > 5);
//        System.out.println(list);
//        Stream st= Arrays.asList(1,2,3,4,5).stream().filter(x->{
//            System.out.print(x);
//            return  x>2;
//        });
//
//        st.forEach(t-> System.out.print(t));
//    }
//    //https://github.com/arbboter/springboot-demo
//    //https://www.cnblogs.com/wfy680/p/15009839.html
//    //https://typescript.bootcss.com/
//
//    @Test
//    public void testJava2()
//    {
//        LocalDateTime ldt = LocalDateTime.now(ZoneId.of("Asia/Shanghai"));
//        long l = ldt.toEpochSecond(ZoneOffset.ofHours(8));
//        System.out.println(l);
//    }
//
//    @Test
//    public void testMedicineList()
//    {
//        SystemParam systemParam = new SystemParam("119174", "2e175144d8d9471d969d230858dffdfe","119174_2701539");
//        MedicineListRequest medicineListRequest = new MedicineListRequest(systemParam);
//        medicineListRequest.setApp_poi_code("119174_2701539");
//        medicineListRequest.setOffset(1);
//        medicineListRequest.setLimit(99999);
//        //发起请求
////        SgOpenResponse sgOpenResponse;
////        try {
//////            sgOpenResponse = medicineListRequest.doRequest();
//////            JSONObject jsonObject = JSON.parseObject(sgOpenResponse.getRequestResult());
//////            //取门店商品数量
//////            System.out.println(Integer.parseInt(JSON.parseObject(jsonObject.get("extra_info").toString()).get("total_count").toString()));
////
////            //获取门店商品信息
////            //JSONArray jsonArray = JSONArray.parseArray(JSONObject.toJSONString(jsonObject.get("data")));
////            //JSON.parseObject(JSONObject.toJSONString(jsonObject.get("data")),MedicineList.class);
//////            val medicineListRequests = jsonArray.toList(MedicineList.class);
//////            for (MedicineList listRequest : medicineListRequests) {
//////                System.out.println(listRequest);
//////            }
////        } catch (SgOpenException e) {
////            e.printStackTrace();
////            return;
////        } catch (IOException e) {
////            e.printStackTrace();
////            return;
////        }
////        //发起请求时的sig，用来联系美团员工排查问题时使用
////        String requestSig = sgOpenResponse.getRequestSig();
////        //请求返回的结果，按照官网的接口文档自行解析即可
////        String requestResult = sgOpenResponse.getRequestResult();
//    }
//
//    @Test
//    public void testMedicineUpdate(){
//        SystemParam systemParam = new SystemParam("119174", "2e175144d8d9471d969d230858dffdfe","119174_2701539");
//
//        MedicineUpdateRequest medicineUpdateRequest = new MedicineUpdateRequest(systemParam);
//        medicineUpdateRequest.setApp_poi_code("119174_2701539");
//        MedicineInfoDto medicineInfoDto = new MedicineInfoDto();
//        medicineInfoDto.setApp_poi_code("119174_2701539");
//        medicineInfoDto.setApp_medicine_code("14072");
//        medicineInfoDto.setStock("100");
//        medicineUpdateRequest.setMedicine(medicineInfoDto);
//        //发起请求
//        SgOpenResponse sgOpenResponse;
//        try {
//            sgOpenResponse = medicineUpdateRequest.doRequest();
//        } catch (SgOpenException e) {
//            e.printStackTrace();
//            return;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return;
//        }
////发起请求时的sig，用来联系美团员工排查问题时使用
//        String requestSig = sgOpenResponse.getRequestSig();
////请求返回的结果，按照官网的接口文档自行解析即可
//        String requestResult = sgOpenResponse.getRequestResult();
//    }
//
//    @Test
//    public void testMedicineBatchUpdate(){
//        SystemParam systemParam = new SystemParam("119174", "2e175144d8d9471d969d230858dffdfe","119174_2701539");
//
//        MedicineUpdateRequest medicineUpdateRequest = new MedicineUpdateRequest(systemParam);
//        MedicineBatchUpdateRequest medicineBatchUpdateRequest = new MedicineBatchUpdateRequest(systemParam);
//        medicineBatchUpdateRequest.setApp_poi_code("119174_2701539");
////        medicineBatchUpdateRequest.setMedicine_data("[{\"app_medicine_code\":\"14072\",\"price\":9.9,\"stock\":101,\"category_code\":\"090100\",\"is_sold_out\":0,\"sequence\":3,\"limit_sale_info\":\"{\\\"limitSale\\\":true,\\\"type\\\":1,\\\"begin\\\":\\\"20200216\\\",\\\"count\\\":10.6,\\\"end\\\":\\\"20200221\\\"}\"}," +
////                "{\"app_medicine_code\":\"00880\",\"price\":19.9,\"stock\":102,\"category_code\":\"090100\",\"is_sold_out\":0,\"sequence\":3,\"limit_sale_info\":\"{\\\"limitSale\\\":true,\\\"type\\\":1,\\\"begin\\\":\\\"20200216\\\",\\\"count\\\":10.6,\\\"end\\\":\\\"20200221\\\"}\"},"+
////                "{\"app_medicine_code\":\"30672\",\"price\":10.1,\"stock\":15,\"category_code\":\"090100\",\"is_sold_out\":0,\"sequence\":3,\"limit_sale_info\":\"{\\\"limitSale\\\":true,\\\"type\\\":1,\\\"begin\\\":\\\"20200216\\\",\\\"count\\\":10.6,\\\"end\\\":\\\"20200221\\\"}\"}]");
//        medicineBatchUpdateRequest.setMedicine_data("[{\"app_medicine_code\":\"000006\",\"price\":9.9,\"stock\":101}," +
//                "{\"app_medicine_code\":\"00880\",\"price\":19.9,\"stock\":102},"+
//                "{\"app_medicine_code\":\"30672\",\"price\":10.1,\"stock\":16}]");
//
//        //发起请求
//        SgOpenResponse sgOpenResponse;
//        try {
//            sgOpenResponse = medicineBatchUpdateRequest.doRequest();
//        } catch (SgOpenException e) {
//            e.printStackTrace();
//            return;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return;
//        }
////发起请求时的sig，用来联系美团员工排查问题时使用
//        String requestSig = sgOpenResponse.getRequestSig();
////请求返回的结果，按照官网的接口文档自行解析即可
//        String requestResult = sgOpenResponse.getRequestResult();
//    }
//}
