package com.caz.jobportal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.caz.jobportal.entity.JobPostActivity;
import com.caz.jobportal.entity.JobSeekerApply;
import com.caz.jobportal.entity.JobSeekerProfile;
import com.caz.jobportal.repository.JobSeekerApplyRepository;

@Service
public class JobSeekerApplyService {

    private final JobSeekerApplyRepository jobSeekerApplyRepository;

    public JobSeekerApplyService(JobSeekerApplyRepository jobSeekerApplyRepository) {
        this.jobSeekerApplyRepository = jobSeekerApplyRepository;
    }

    public List<JobSeekerApply> getCadidatesJobs(JobSeekerProfile userAccoutId){
        return jobSeekerApplyRepository.findByUserId(userAccoutId);
    }

    public List<JobSeekerApply> getJobCandidates(JobPostActivity job){
        return jobSeekerApplyRepository.findByJob(job);
    }

    public void addNew(JobSeekerApply jobSeekerApply) {
        jobSeekerApplyRepository.save(jobSeekerApply);
    }

}
