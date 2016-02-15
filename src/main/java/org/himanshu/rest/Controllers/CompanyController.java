/**
 * 
 */
package org.himanshu.rest.Controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.himanshu.rest.Entities.Company;
import org.himanshu.rest.Exception.CompanyCustomException;
import org.himanshu.rest.Exception.Message;
import org.himanshu.rest.Service.CompanyService;
import org.himanshu.rest.Service.CompanyServiceImpl;

import javassist.NotFoundException;

/**
 * @author Himanshu
 *
 */
@Path("/companies")
@Produces(MediaType.APPLICATION_JSON )
@Consumes( MediaType.APPLICATION_JSON  )
public class CompanyController {
	
	CompanyService  companyService = new CompanyServiceImpl();
	
	
	@GET
	public List<Company> getAllCompanies(){
		
			List<Company> companies = companyService.getAllcompanies();;
			
			if (companies == null ) {
				throw new CompanyCustomException(" No Companies currently exist.");
			}
			return companies;
	}
	// it was for angular rest client.
/*	@GET
	public Response getAllCompanies(){
		
		//return	
		List<Company> companies = companyService.getAllcompanies();
		
	return	Response.ok().entity(new GenericEntity<List<Company>> (companies){})
			                 .header("Access-Control-Allow-Origin", "*")
			                 .header("Access-Control-Allow-Methods", "GET, POST, PUT").build();
	}*/
	
	@GET
	@Path("/{companyName}")
	public Company getCompanyDetails(@PathParam("companyName")String companyName){
		
				Company company = companyService.getCompanyDetails(companyName);
				if (company == null ) {
					throw new CompanyCustomException("This Company does not exist.");
				}
				return company;
	}
	

	@POST
	public Message createCompany( Company company){
		
		Message message  = new Message();
		message.setMessage(companyService.addNewCompany(company));
		return	message;
	}
	
	@PUT
	@Path("/update")
	public Message updateCompany( Company company){
		Message message  = new Message();
		message.setMessage(companyService.updateCompany(company));
		return	message;
	}

	@PUT
	@Path("/addOwner")
	public Message addCompanyOwner( Company company ,@MatrixParam( "owner" ) String owner){
		//java.util.logging.Logger logger = java.util.logging.Logger.getLogger("addCompanyOwner", this.getClass().getName());
		//logger.info("in addCompanyOwner ");
		Message message  = new Message();
		message.setMessage(companyService.addOwner(company.getName(), owner));
		return	message;
	}
}
