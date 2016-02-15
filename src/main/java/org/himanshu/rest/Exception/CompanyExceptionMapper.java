/**
 * 
 */
package org.himanshu.rest.Exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 * @author Himanshu
 *
 */
@Provider
public class CompanyExceptionMapper implements ExceptionMapper<CompanyCustomException>{

	@Override
	public Response toResponse(CompanyCustomException ex) {

		Message errorMessage = new Message(ex.getMessage(),"MyerrorCode");
		return Response.status(Status.BAD_REQUEST).entity(errorMessage).build();
	}

}
