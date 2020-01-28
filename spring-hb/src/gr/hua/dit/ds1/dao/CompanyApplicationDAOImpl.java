package gr.hua.dit.ds1.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import gr.hua.dit.ds1.entity.CompanyApplication;
import gr.hua.dit.ds1.entity.User;

@Repository
public class CompanyApplicationDAOImpl implements CompanyApplicationDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<CompanyApplication> getCompanyApps() {
		// get current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();
        
        // create a query
        Query<CompanyApplication> query = currentSession.createQuery("from CompanyApplication", CompanyApplication.class);
        
        
        // execute the query and get the results list
        List<CompanyApplication> companyApps = query.getResultList();
                        
        //return the results
        return companyApps;
	}

	@Override
	@Transactional
	public CompanyApplication addCompanyApp(CompanyApplication id) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(id);
		return null;
	}

	@Override
	@Transactional
	public String deleteCompanyApp(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		CompanyApplication cpapp = currentSession.get(CompanyApplication.class, id);
		currentSession.delete(cpapp);
		return null;
	}

}
