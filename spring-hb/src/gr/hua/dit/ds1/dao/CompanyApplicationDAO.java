package gr.hua.dit.ds1.dao;

import java.util.List;

import gr.hua.dit.ds1.entity.CompanyApplication;

public interface CompanyApplicationDAO {
	public List<CompanyApplication> getCompanyApps();
	public CompanyApplication addCompanyApp(CompanyApplication id);
	public CompanyApplication getCompanyAppById(int id);
	public String deleteCompanyApp(int id);
}
