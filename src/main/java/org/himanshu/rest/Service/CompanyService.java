/**
 * 
 */
package org.himanshu.rest.Service;

import java.util.List;

import org.himanshu.rest.Entities.Company;
import org.himanshu.rest.Utils.CompanyCustomException;

/**
 * @author Himanshu
 *
 */
public interface CompanyService {

	
	public String addNewCompany( Company Company ) throws CompanyCustomException;
	public List<Company> getAllcompanies() throws CompanyCustomException;
	public Company getCompanyDetails(String id) throws CompanyCustomException;
	public String updateCompany( Company Company  ) throws CompanyCustomException;
	public String addOwner( String companyName, String owner ) throws CompanyCustomException;
	
	
}
