package com.zy;

import com.zy.oms.pojo.entity.YwKck;
import com.zy.oms.service.ISubphkService;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
//@AutoConfigureMockMvc
class WebAPITest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() throws Exception{
        System.out.println("看看是否被执行");
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();//建议使用这种
    }

    @Test
    public void testHello() throws Exception {
        /**
         * 1、mockMvc.perform执行一个请求。
         * 2、MockMvcRequestBuilders.get("XXX")构造一个请求。
         * 3、ResultActions.param添加请求传值
         * 4、ResultActions.accept(MediaType.TEXT_HTML_VALUE))设置返回类型
         * 5、ResultActions.andExpect添加执行完成后的断言。
         * 6、ResultActions.andDo添加一个结果处理器，表示要对结果做点什么事情
         *   比如此处使用MockMvcResultHandlers.print()输出整个响应结果信息。
         * 5、ResultActions.andReturn表示执行完成后返回相应的结果。
         */
        try {
            MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders.get("ywkck/all");
            MvcResult mvcResult = mockMvc.perform(mockHttpServletRequestBuilder
                            //.param("name","lvgang")
                            .contentType(MediaType.APPLICATION_JSON_VALUE))
                    .andExpect(MockMvcResultMatchers.status().isOk())             //等同于Assert.assertEquals(200,status);
                    .andExpect(MockMvcResultMatchers.content().string("hello zhangzhe"))    //等同于 Assert.assertEquals("hello zhangzhe",content);
                    .andDo(MockMvcResultHandlers.print())
                    .andReturn();
            int status = mvcResult.getResponse().getStatus();                 //得到返回代码
            String content = mvcResult.getResponse().getContentAsString();    //得到返回结果

            Assert.assertEquals(200, status);                        //断言，判断返回代码是否正确
            //Assert.assertEquals("hello lvgang",content);            //断言，判断返回的值是否正确
            System.out.println("WEB测试返回[" + content + "]:");
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test
    public HashMap<String, Object> testJava(){
        RestTemplate restTemplate = new RestTemplate();
        YwKck ywKck=new YwKck();
        HashMap<String, Object> ret = restTemplate.postForObject("http://localhost:8080/ywkck",ywKck, HashMap.class); //最后一个参数是http://localhost:8080/ywkck返回的类型
        System.out.println(ret);
        return ret;
    }

    @Test
    public void getmdkc(){
        return ;
    }
}
