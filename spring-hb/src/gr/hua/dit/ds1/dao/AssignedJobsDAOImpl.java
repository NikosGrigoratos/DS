package gr.hua.dit.ds1.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds1.entity.AssignedJobs;

@Repository
public class AssignedJobsDAOImpl implements AssignedJobsDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public AssignedJobs getAssignedJobByStudentId(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<AssignedJobs> query = currentSession.createQuery("from AssignedJobs A where A.studentIt= :it", AssignedJobs.class);
		query.setParameter("it", id);
		return query.getSingleResult();
	}
	
	@Override
	@Transactional
	public String addToAssignedJobs(AssignedJobs job) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(job);
		return null;
	}

}
