package com.thoughtworks.yafei;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSpringEleven.xml");
        Email email = (Email) context.getBean("email");
        context.close();
    }
}
