/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.response;

import com.galaxy.meetup.server.client.domain.GenericJson;
import com.galaxy.meetup.server.client.domain.PlusEvent;
import com.galaxy.meetup.server.client.domain.TraceRecords;

/**
 * 
 * @author sihai
 * 
 */
public class UpdateEventResponse extends GenericJson {

	public TraceRecords backendTrace;
	public PlusEvent event;

	public TraceRecords getBackendTrace() {
		return backendTrace;
	}

	public void setBackendTrace(TraceRecords backendTrace) {
		this.backendTrace = backendTrace;
	}

	public PlusEvent getEvent() {
		return event;
	}

	public void setEvent(PlusEvent event) {
		this.event = event;
	}
}
