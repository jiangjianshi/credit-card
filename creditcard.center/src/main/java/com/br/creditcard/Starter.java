package com.br.creditcard;

import com.br.rpc.provider.server.RpcServer;
import com.br.rpc.provider.server.SpringRpcServerImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * center 启动类
 */
public class Starter {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:center-context.xml");
        RpcServer centerServer = context.getBean("centerServer", SpringRpcServerImpl.class);
        centerServer.serve();
        System.out.println("=====================================");
        System.out.println("creditcard center started");
        System.out.println("=====================================");
    }

}
