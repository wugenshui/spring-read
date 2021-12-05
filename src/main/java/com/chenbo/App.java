package com.chenbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : chenbo
 * @date : 2021-12-05
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("a.xml");
        System.out.println("app = " + app);
    }
}
