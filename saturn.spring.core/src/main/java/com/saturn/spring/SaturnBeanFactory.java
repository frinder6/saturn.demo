package com.saturn.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by frinder6 on 2017/2/22.
 */
public class SaturnBeanFactory {

    private SaturnBeanFactory() {
    }

    private static AnnotationConfigApplicationContext applicationContext;


    /**
     * 初始化 spring bean factory
     *
     * @return
     */
    public static void loadApplicationContext() {
        if (null == applicationContext) {
            synchronized (SaturnBeanFactory.class) {
                applicationContext = new AnnotationConfigApplicationContext("com.saturn");
            }
        }
    }


    /**
     * 返回 application context
     *
     * @return
     */
    public static AnnotationConfigApplicationContext getApplicationContext() {
        loadApplicationContext();
        return applicationContext;
    }

}
