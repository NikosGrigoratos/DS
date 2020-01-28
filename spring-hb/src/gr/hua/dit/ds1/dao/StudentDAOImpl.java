package gr.hua.dit.ds1.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds1.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public Student getStudentCrids(String it) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Student> query = currentSession.createQuery("from Student S where S.it= :it", Student.class);
		query.setParameter("it", it);
		return query.getSingleResult();
		
	}

}
