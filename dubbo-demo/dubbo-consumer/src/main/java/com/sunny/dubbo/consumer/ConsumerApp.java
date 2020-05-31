package com.sunny.dubbo.consumer;


import com.sunny.dubbo.API.LoginService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * xml的方式调用
 * 服务消费方
 * @author 阳光大男孩！！！
 */
public class ConsumerApp
{
    public static void main(String[] args) {

        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        LoginService loginService = context.getBean(LoginService.class);
        System.out.println("登录的结果为"+loginService.login());

    }

}
