package com.saturn.job;

import com.vip.saturn.job.AbstractSaturnJavaJob;
import com.vip.saturn.job.SaturnJobExecutionContext;
import com.vip.saturn.job.SaturnJobReturn;

/**
 * Created by frinder6 on 2017/2/22.
 */
public class FirstJob extends AbstractSaturnJavaJob {

    static {
        System.setProperty("namespace","saturn.com");
        System.setProperty("exeutorName","exeutor_002");
        System.setProperty("VIP_SATURN_ZK_CONNECTION","10.199.195.228:2181,10.199.195.228:2182,10.199.195.228:2183");
    }

    @Override
    public SaturnJobReturn handleJavaJob(final String jobName,
                                         final Integer shardItem,
                                         final String shardParam,
                                         final SaturnJobExecutionContext context) throws InterruptedException {
        System.out.println("我会出现在运行日志里.running handleJavaJob:" + jobName + "; " + shardItem + ";" + shardParam);
        return new SaturnJobReturn("我是分片" + shardItem + "的处理结果");
    }


    public static Object getObject() {
        System.out.println("**********************************");
        System.out.println("static init...");
        System.out.println("**********************************");
        return null;
    }

}
