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
public class PhotosCreateCommentResponse extends GenericJson {

	public TraceRecords backendTrace;
	public java.util.List comment;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public java.util.List getComment() {
		return comment;
	}

	public void setComment(java.util.List comment) {
		this.comment = comment;
	}
}
