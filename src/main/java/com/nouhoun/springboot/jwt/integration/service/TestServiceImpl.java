package com.nouhoun.springboot.jwt.integration.service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.nouhoun.springboot.jwt.job.TestService;

@Service
public class TestServiceImpl implements TestService {
    private final Log logger = LogFactory.getLog(getClass());

    private final Random random = new Random();

    public void run(String id) throws Exception {
        logger.info("Running job on supervisor, job id " + id);
        if (random.nextInt(3) == 1) {
            throw new Exception("Randomly generated test exception on supervisor");
        }
        try {
            Thread.sleep(TimeUnit.MINUTES.toMillis(1));
        } catch (InterruptedException e) {
            logger.error("Error", e);
        }
        logger.info("Completed job on supervisor, job id " + id);
    }
}
