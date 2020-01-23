package gr.hua.dit.ds1.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds1.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<User> getUsers() {
		// get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        
        // create a query
        Query<User> query = currentSession.createQuery("from User", User.class);
        
        
        // execute the query and get the results list
        List<User> users = query.getResultList();
                        
        //return the results
        return users;
		
	}

	@Override
	@Transactional
	public String addUser(User user) {
		Session currentSession = sessionFactory.getCurrentSession();
        currentSession.save(user);
		return null;
	}

	@Override
	@Transactional
	public String deleteUser(String id) {
		Session currentSession = sessionFactory.getCurrentSession();
		User user = currentSession.get(User.class, id);
		currentSession.delete(user);
		return "User Deleted";
	}
}
