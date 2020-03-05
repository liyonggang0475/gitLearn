package com.liyg.test_springboot.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig  {

    @Bean
    public FilterRegistrationBean getFilertConfig(){
        FilterRegistrationBean config1 = new FilterRegistrationBean();
        config1.setFilter(new MyFilter());
        config1.setName("myfilter");
        config1.setOrder(1);
        config1.addUrlPatterns("/*");
        return config1;
    }

    @Bean
    public FilterRegistrationBean getFilertConfig2(){
        FilterRegistrationBean config1 = new FilterRegistrationBean();
        config1.setFilter(new MyFilter1());
        config1.setName("myfilter1");
        config1.setOrder(6);
        config1.addUrlPatterns("/*");
        return config1;
    }
}
