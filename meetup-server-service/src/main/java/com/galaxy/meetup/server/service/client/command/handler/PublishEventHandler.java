/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.service.client.command.handler;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.galaxy.meetup.server.client.exception.MeetupException;
import com.galaxy.meetup.server.client.v2.domain.Event;
import com.galaxy.meetup.server.client.v2.request.PublishEventRequest;
import com.galaxy.meetup.server.client.v2.response.PublishEventResponse;
import com.galaxy.meetup.server.core.command.framework.AbstractHandler;
import com.galaxy.meetup.server.core.command.framework.Command;
import com.galaxy.meetup.server.core.command.framework.ExecutionController;
import com.galaxy.meetup.server.core.command.framework.Handle;
import com.galaxy.meetup.server.core.command.framework.Result;
import com.galaxy.meetup.server.service.EventService;

/**
 * 
 * @author sihai
 *
 */
@Service
@Handle(value = "publish_event", index = 0)
public class PublishEventHandler extends AbstractHandler {

	@Resource
	private EventService eventService;
	
	@Override
	public void handle(Command command, Result result, ExecutionController controller) {
		PublishEventRequest request = command.getRequest(PublishEventRequest.class);
		PublishEventResponse response = new PublishEventResponse();
		try {
			Event event = request.getEvent();
			eventService.publish(event);
			response.setEvent(event);
			response.setSucceed(true);
		} catch (MeetupException e) {
			response.setSucceed(false);
			response.setErrorMsg(e.getMessage());
		}
		result.setResponse(response);
	}
	
}
