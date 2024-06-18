package com.caz.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caz.jobportal.entity.JobPostActivity;
import com.caz.jobportal.entity.JobSeekerApply;
import com.caz.jobportal.entity.JobSeekerProfile;

import java.util.List;


@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply , Integer>{

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);
    List<JobSeekerApply> findByJob(JobPostActivity job);
}
