package com.liyg.test_springboot;


import com.liyg.test_springboot.comm.MoreProps;
import com.liyg.test_springboot.comm.OtherProp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertTest {
//    @Value("${my.name}")
    private  String name;

//    @Value("$[user.age]")
//    private int age;

    @Resource
    private MoreProps moreProps;
    @Test
    public void testsingle(){
//        Assert.assertEquals("liyg", name);
        System.out.println(name);
    }
    @Resource
    private OtherProp otherProp;
    @Test
    public void testmore(){
        System.out.println(moreProps.getSex());
        System.out.println(moreProps.getTitle());

    }

    @Test
    public void testother(){

        System.out.println(otherProp.getSex());
        System.out.println(otherProp.getTitle());
    }
}
