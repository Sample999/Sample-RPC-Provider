package com.sample.demo.rpc.provider.web;

import com.sample.demo.rpc.provider.export.HelloService;
import com.sample.demo.rpc.provider.export.domain.Hi;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: sample
 * @date: 2023/6/14
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String hi() {
        return "hi sample rpc!";
    }

    @Override
    public String say(String str) {
        return str;
    }

    @Override
    public String sayHi(Hi hi) {
        return hi.getUserName() + " say: " + hi.getSayMsg();
    }
}
