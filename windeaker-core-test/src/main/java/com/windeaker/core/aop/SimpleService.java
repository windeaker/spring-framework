package com.windeaker.core.aop;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;

@Component
public class SimpleService {

    /**
     *
     */
    public int plus(int a, int b) {
        System.out.println("正在执行simple方法");
        return a / b;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public int plusCallProxyInnerClass(int a, int b) {
        return ((SimpleService) AopContext.currentProxy()).plus(a, b);
    }

}
