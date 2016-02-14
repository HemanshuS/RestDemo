/**
 * 
 */
package org.himanshu.rest.Repositories;

import java.util.List;

import org.himanshu.rest.Entities.Company;
import org.himanshu.rest.Utils.CompanyCustomException;

/**
 * @author Himanshu
 *
 */
public interface CompanyRepo {

	public String addNewCompany( Company Company ) throws CompanyCustomException;
	public List<Company> getAllcompanies() throws CompanyCustomException;
	public Company getCompanyDetails(String id) throws CompanyCustomException;
	public String updateCompany( Company Company  ) throws CompanyCustomException;
	public boolean addOwner( String companyName, String owner ) throws CompanyCustomException;
	
	
}
