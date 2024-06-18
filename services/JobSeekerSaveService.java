package com.caz.jobportal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.caz.jobportal.entity.JobPostActivity;
import com.caz.jobportal.entity.JobSeekerProfile;
import com.caz.jobportal.entity.JobSeekerSave;
import com.caz.jobportal.repository.JobSeekerSaveRepository;

@Service
public class JobSeekerSaveService {

    private final JobSeekerSaveRepository jobSeekerSaveRepository;

    public JobSeekerSaveService(JobSeekerSaveRepository jobSeekerSaveRepository) {
        this.jobSeekerSaveRepository = jobSeekerSaveRepository;
    }

    public List<JobSeekerSave> getCandidatesJob(JobSeekerProfile userAccountId){
        return jobSeekerSaveRepository.findByUserId(userAccountId);
    }

    public List<JobSeekerSave> getJobCadidates(JobPostActivity job){
        return jobSeekerSaveRepository.findByJob(job);
    }

    public void addNew(JobSeekerSave jobSeekerSave) {
        jobSeekerSaveRepository.save(jobSeekerSave);
    }
}
