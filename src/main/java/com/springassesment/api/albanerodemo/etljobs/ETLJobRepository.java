package com.springassesment.api.albanerodemo.etljobs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ETLJobRepository extends JpaRepository<ETLJobs, Long> {
}
