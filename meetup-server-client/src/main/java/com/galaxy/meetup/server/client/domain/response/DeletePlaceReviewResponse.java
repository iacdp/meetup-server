/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.TraceRecords;


/**
 * 
 * @author sihai
 *
 */
public class DeletePlaceReviewResponse extends GenericJson {

	public TraceRecords backendTrace;
	
    public String zipitVersionInfo;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public String getZipitVersionInfo() {
		return zipitVersionInfo;
	}

	public void setZipitVersionInfo(String zipitVersionInfo) {
		this.zipitVersionInfo = zipitVersionInfo;
	}
}
