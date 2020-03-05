package com.liyg.test_springboot.comm;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author liyg
 */
@Component
@ConfigurationProperties(prefix = "more")
@PropertySource("classpath:application.yaml")

public class MoreProps {
    private String sex;
    private String  title;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
