package com.saturn.job;

import com.saturn.spring.SaturnBeanFactory;
import com.vip.saturn.job.AbstractSaturnJavaJob;
import com.vip.saturn.job.SaturnJobExecutionContext;
import com.vip.saturn.job.SaturnJobReturn;

/**
 * Created by frinder6 on 2017/2/23.
 */
public abstract class BaseJob extends AbstractSaturnJavaJob {

    static {
        /**
         * 初始化 spring容器
         */
        SaturnBeanFactory.loadApplicationContext();
    }

    @Override
    public abstract SaturnJobReturn handleJavaJob(
            String jobName,
            Integer shardItem,
            String shardParam,
            SaturnJobExecutionContext saturnJobExecutionContext
    ) throws InterruptedException;
}
