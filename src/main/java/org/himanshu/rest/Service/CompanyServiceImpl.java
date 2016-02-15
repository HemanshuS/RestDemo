/**
 * 
 */
package org.himanshu.rest.Service;

import java.util.List;

import org.himanshu.rest.Entities.Company;
import org.himanshu.rest.Exception.CompanyCustomException;
import org.himanshu.rest.Repositories.CompanyRepo;
import org.himanshu.rest.Repositories.CompanyRepoImpl;

/**
 * @author Himanshu
 *
 */
public class CompanyServiceImpl implements CompanyService {
	
// TO-Do use Spring injection to create repo and service classes.
	CompanyRepo companyRepo = new CompanyRepoImpl();

	@Override
	public String addNewCompany(Company Company ) {
		return companyRepo.addNewCompany(Company);
	}

	@Override
	public Company getCompanyDetails(String id) {
		return companyRepo.getCompanyDetails(id);
	}

	@Override
	public List<Company> getAllcompanies() {
		return companyRepo.getAllcompanies();
	}

	@Override
	public String updateCompany(Company company) throws CompanyCustomException {
		return companyRepo.updateCompany(company);
	}

	@Override
	public String addOwner(String companyName, String owner) throws CompanyCustomException {
		
	if ( companyRepo.getCompanyDetails(companyName) != null )
	{
		return companyRepo.addOwner(companyName, owner) ? owner +" Added to " +companyName :"Error adding Owner";
	}
		return " Company Not found to add owner";
	}

}
