/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.core.command.framework;

import com.galaxy.meetup.server.client.v2.response.Response;


/**
 * 
 * @author sihai
 *
 */
public class Result {

	/**
	 * 
	 */
	private boolean isSucceed;
	
	/**
	 * 
	 */
	private String errorMsg;
	
	/**
	 * 
	 */
	private Response response;

	public boolean isSucceed() {
		return isSucceed;
	}

	public void setSucceed(boolean isSucceed) {
		this.isSucceed = isSucceed;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Response getResponse() {
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}
}
