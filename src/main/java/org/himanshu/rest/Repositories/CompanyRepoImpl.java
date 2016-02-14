/**
 * 
 */
package org.himanshu.rest.Repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.himanshu.rest.Entities.Company;
import org.himanshu.rest.Utils.CompanyCustomException;

/**
 * @author Himanshu
 *
 */
public class CompanyRepoImpl implements CompanyRepo{

	static Map<String,Company>  companiesMap = new HashMap<>();
	
	@Override
	public String addNewCompany(Company company) {
		if (companiesMap.containsKey(company.getName().toLowerCase())) {
			
			return company.getName()+" already present!";
		}
		company.setCompanyId(company.getName().toLowerCase());
		companiesMap.put(company.getName().toLowerCase(), company);
		return company.getName()+" added !";
	}

	
	
	@Override
	public List<Company> getAllcompanies() {
		//List<Company>  companies = new ArrayList<>();

		if (companiesMap.isEmpty()){ 
			addDefaultCompany();
		}
		return new ArrayList<Company>( companiesMap.values() );
	}

	private void addDefaultCompany() {
		Company company = new Company("Apple", "Apple", "Silicon Valley", "California", "USA");
		List<String>  beneficialOwners = new ArrayList<>();
		beneficialOwners.add("Jobs");
		beneficialOwners.add("TinCook");
		company.setBeneficialOwners(beneficialOwners);
		companiesMap.put(company.getName().toLowerCase(), company);
	}

	@Override
	public Company getCompanyDetails(String id) {

		return companiesMap.get(id.toLowerCase());
	}



	@Override
	public String updateCompany(Company company) throws CompanyCustomException {
		companiesMap.put(company.getName().toLowerCase(), company);
		return company.getName() + " updated";
	}



	@Override
	public boolean addOwner(String companyName, String owner) throws CompanyCustomException {
		return  companiesMap.get(companyName.toLowerCase()).getBeneficialOwners().add(owner);
	}

	

}
