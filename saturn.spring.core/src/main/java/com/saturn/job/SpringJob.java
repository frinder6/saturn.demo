package com.saturn.job;

import com.saturn.service.JobService;
import com.saturn.spring.SaturnBeanFactory;
import com.vip.saturn.job.SaturnJobExecutionContext;
import com.vip.saturn.job.SaturnJobReturn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by frinder6 on 2017/2/22.
 */
@Component
public class SpringJob extends BaseJob {

    @Autowired
    private JobService jobService;

    @Override
    public SaturnJobReturn handleJavaJob(String jobName,
                                         Integer shardItem,
                                         String shardParam,
                                         SaturnJobExecutionContext saturnJobExecutionContext) throws InterruptedException {
        // JobService jobService = SaturnBeanFactory.getApplicationContext().getBean(JobService.class);
        if (0 == shardItem) {
            jobService.job();
        } else {
            System.out.println("==================================");
            System.out.println("I am the first piece called !");
            System.out.println("==================================");
        }
        StringBuilder msg = new StringBuilder();
        msg.append("job : " + jobName + ", ");
        msg.append("shardItem : " + shardItem + ", ");
        msg.append("shardParam : " + shardParam);
        return new SaturnJobReturn(msg.toString());
    }


    /**
     * 使用此方式保证 spring 注解注入
     *
     * @return
     */
    public static Object getObject() {
        return SaturnBeanFactory.getApplicationContext().getBean(SpringJob.class);
    }
}
