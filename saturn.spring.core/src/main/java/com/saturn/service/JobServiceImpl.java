package com.saturn.service;

import org.springframework.stereotype.Service;

/**
 * Created by frinder6 on 2017/2/22.
 */
@Service
public class JobServiceImpl implements JobService {

    @Override
    public void job() {
        System.out.println("************************");
        System.out.println("job...");
        System.out.println("************************");
    }

}
