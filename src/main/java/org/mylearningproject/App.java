package org.mylearningproject;

import org.mylearningproject.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App
{
    public static void main( String[] args )
    {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Users user = context.getBean("users",Users.class);
      //  Users user1 = context.getBean("user1",Users.class);
              user.getBranch();












        // This is XML way configuration //
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
////        Users user = (Users) context.getBean("users");
//        Users user =  context.getBean("users",Users.class);
//        System.out.print("Output " + user.getBranch() +user.mobile +user.name);
    }
}
