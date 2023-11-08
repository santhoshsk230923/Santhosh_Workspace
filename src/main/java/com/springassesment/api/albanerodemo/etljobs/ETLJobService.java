package com.springassesment.api.albanerodemo.etljobs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ETLJobService {
    @Autowired
    private ETLJobRepository etlJobRepository;

   // @Value("${nifi.api.url}")
    //private String nifiApiUrl;

    public void initiateEtlJob() {
        // Implement NiFi integration to start an ETL job
    }

    public List<ETLJobs> getAllEtlJobStatuses() {
        return Collections.emptyList();
    }
}
