package com.sample.demo.rpc.provider.export;

import com.sample.demo.rpc.provider.export.domain.Hi;

/**
 * @description:
 * @author: sample
 * @date: 2023/6/14
 */
public interface HelloService {

    String hi();

    String say(String str);

    String sayHi(Hi hi);

}