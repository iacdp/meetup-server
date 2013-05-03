/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao.mongodb;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;

import com.galaxy.meetup.server.client.v2.domain.Event;
import com.galaxy.meetup.server.client.v2.domain.Location;
import com.galaxy.meetup.server.client.v2.enums.EventStatus;
import com.galaxy.meetup.server.dao.BaseTestCase;
import com.galaxy.meetup.server.dao.EventDAO;

/**
 * 
 * @author sihai
 *
 */
public class EventDAOImplTest extends BaseTestCase {

	@Resource
	private EventDAO eventDAO;
	
	@Test
	public void testInsert() throws Exception {
		Event event = new Event();
		event.setName("��һ��ȸ���");
		event.setPublisher("sihai");
		event.setDescription("С��һ��");
		event.setStartTime(DateUtils.parseDate("2013-05-02 18:30:00", new String[]{"yyyy-MM-dd HH:mm:ss"}));
		event.setStartTime(DateUtils.parseDate("2013-05-02 23:30:00", new String[]{"yyyy-MM-dd HH:mm:ss"}));
		event.setStatus(EventStatus.WAITING.getValue());
		Location location = new Location();
		location.setZip("434000");
		location.setStreet("���Ŵ�3��9�ţ��ؾ���");
		location.setDistrict("ɳ����");
		location.setCity("������");
		location.setProvince("����ʡ");
		location.setCountry("�й�");
		location.setLatitude(32.00D);
		location.setLongitude(123.00D);
		event.setLocation(location);
		eventDAO.insert(event);
	}
	
	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
