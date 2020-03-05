package com.liyg.test_springboot;


import com.liyg.test_springboot.web.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest
public class ControllerTest {

    private  MockMvc mockMvc;
    @Test
    public  void getUser() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new TestController()).build();
        mockMvc.perform(MockMvcRequestBuilders.post("/getUser")).andDo((MockMvcResultHandlers.print()));
    }

    @Test
    public void hello() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new TestController()).build();
       MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/hello?name=liyg")).andReturn();
       System.out.println(result.getHandler().toString());
    }

    @Test
    public void saveUser() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(new TestController()).build();
        mockMvc.perform(MockMvcRequestBuilders.post("/saveUser").param("name", "li")
                .param("age", "199").param("password", "125"));
    }

}
