package com.caz.jobportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caz.jobportal.entity.JobPostActivity;
import com.caz.jobportal.entity.JobSeekerProfile;
import com.caz.jobportal.entity.JobSeekerSave;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer>{

    List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);
    

}
