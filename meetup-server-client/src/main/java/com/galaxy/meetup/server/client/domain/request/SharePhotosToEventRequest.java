/**
 * galaxy inc.
 * meetup client for android
 */
package com.galaxy.meetup.server.client.domain.request;

import java.util.List;

import com.galaxy.meetup.server.client.domain.ApiaryFields;
import com.galaxy.meetup.server.client.v2.request.Request;

/**
 * 
 * @author sihai
 * 
 */
public class SharePhotosToEventRequest extends Request {

	public ApiaryFields commonFields;
	public Boolean enableTracing;
	public String eventId;
	public List photoId;

	public ApiaryFields getCommonFields() {
		return commonFields;
	}

	public void setCommonFields(ApiaryFields commonFields) {
		this.commonFields = commonFields;
	}

	public Boolean getEnableTracing() {
		return enableTracing;
	}

	public void setEnableTracing(Boolean enableTracing) {
		this.enableTracing = enableTracing;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public List getPhotoId() {
		return photoId;
	}

	public void setPhotoId(List photoId) {
		this.photoId = photoId;
	}
}
