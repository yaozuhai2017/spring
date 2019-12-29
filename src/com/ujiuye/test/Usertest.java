package com.ujiuye.test;

import com.ujiuye.controller.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Usertest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController userController =(UserController) applicationContext.getBean("controller");
        userController.getUserService().sayHello();
    }
}
