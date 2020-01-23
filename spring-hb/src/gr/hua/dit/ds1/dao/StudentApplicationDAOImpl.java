package gr.hua.dit.ds1.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds1.entity.CompanyApplication;
import gr.hua.dit.ds1.entity.StudentApplication;
import gr.hua.dit.ds1.entity.User;

@Repository
public class StudentApplicationDAOImpl implements StudentApplicationDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<StudentApplication> getStudentApps() {
		// get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        
        // create a query
        Query<StudentApplication> query = currentSession.createQuery("from StudentApplication", StudentApplication.class);
        
        
        // execute the query and get the results list
        List<StudentApplication> studentApps = query.getResultList();
                        
        //return the results
        return studentApps;
	}

	@Override
	@Transactional
	public String addStudentApp(String id) {
		//need to do queries here
		return null;
	}

	@Override
	@Transactional
	public String deleteStudentApp(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		StudentApplication stapp = currentSession.get(StudentApplication.class, id);
		currentSession.delete(stapp);
        return null;
	}

}
