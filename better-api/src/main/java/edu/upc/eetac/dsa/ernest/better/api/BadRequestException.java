package edu.upc.eetac.dsa.ernest.better.api;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import edu.upc.eetac.dsa.ernest.better.api.model.BeeterError;

public class BadRequestException extends WebApplicationException {

	private static final long serialVersionUID = -3770862164392622526L;

	public BadRequestException(String message) {
		super(Response.status(Response.Status.BAD_REQUEST).entity(new BeeterError(Response.Status.BAD_REQUEST.getStatusCode(), message))
				.type(MediaType.BEETER_API_ERROR).build());
	}
}
