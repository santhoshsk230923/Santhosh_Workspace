package com.springassesment.api.albanerodemo.etljobs;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auth/etl-jobs")
@SecurityRequirement(name = "bearerAuth")
public class ETLJobController {

    @Autowired
    private ETLJobService etlJobService;
    @PostMapping
    public ResponseEntity<String> initiateETLJob() {
        etlJobService.initiateEtlJob();
        return ResponseEntity.ok("ETL job initiated");
    }

    @GetMapping
    public List<ETLJobs> getAllETLJobs() {
        // Fetch and return a list of all ETL jobs
        return etlJobService.getAllEtlJobStatuses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ETLJobs> getETLJobById(@PathVariable Long id) {
        // Fetch and return a specific ETL job by ID
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateETLJob(@PathVariable Long id, @RequestBody ETLJobs updatedJob) {
        // Implement updating an ETL job
        // Return a response
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteETLJob(@PathVariable Long id) {
        // Implement deleting an ETL job
        // Return a response
        return null;
    }
}
