package com.interview.aquariustest.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DatabaseUpdateScheduler {
	@Scheduled(fixedRateString = "${app.scheduling.update-rate}")
    public void updateDatabase() {
        log.info("Starting scheduled database update");
        try {
            // Your database update logic goes here
            // For example:
            // repository.updateSomeData();
            log.info("Database update completed successfully");
        } catch (Exception e) {
            log.error("Error during scheduled database update", e);
        }
    }
}
