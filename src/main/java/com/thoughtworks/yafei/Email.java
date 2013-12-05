package com.thoughtworks.yafei;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Email implements InitializingBean, DisposableBean {
    private String body;


    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("The destroy message is called now " + body);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("The properties have been set now " + body);
    }
}
