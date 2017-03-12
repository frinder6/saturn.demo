package com.saturn.spring;

import com.saturn.service.JobService;
import com.saturn.service.JobServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by frinder6 on 2017/2/23.
 */
//@Configuration
public class SaturnApplicationContext {

//    @Bean
    public JobService jobService() {
        return new JobServiceImpl();
    }

}
