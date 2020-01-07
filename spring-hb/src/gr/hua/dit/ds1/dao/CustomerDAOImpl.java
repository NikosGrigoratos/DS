package gr.hua.dit.ds1.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds1.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        
        // create a query
        Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);
        
        
        // execute the query and get the results list
        List<Customer> customers = query.getResultList();
                        
        //return the results
        return customers;
	}

}
