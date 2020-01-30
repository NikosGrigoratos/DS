package gr.hua.dit.ds1.dao;

import gr.hua.dit.ds1.entity.AssignedJobs;

public interface AssignedJobsDAO {
	public AssignedJobs getAssignedJobByStudentId(String id);
	public String addToAssignedJobs(AssignedJobs job);
}
