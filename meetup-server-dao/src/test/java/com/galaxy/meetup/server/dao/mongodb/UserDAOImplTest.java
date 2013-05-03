/**
 * galaxy inc.
 * meetup server
 */
package com.galaxy.meetup.server.dao.mongodb;

import static org.junit.Assert.fail;

import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;

import com.galaxy.meetup.server.client.v2.domain.Location;
import com.galaxy.meetup.server.client.v2.domain.User;
import com.galaxy.meetup.server.client.v2.enums.Gender;
import com.galaxy.meetup.server.dao.BaseTestCase;
import com.galaxy.meetup.server.dao.UserDAO;

/**
 * 
 * @author sihai
 *
 */
public class UserDAOImplTest extends BaseTestCase {

	@Resource
	private UserDAO userDAO;
	
	@Test
	public void testInsertUser() throws Exception {
		User user = new User();
		user.setName("sihai");
		user.setBirthday(DateUtils.parseDate("1987-03-20", new String[]{"yyyy-MM-dd"}));
		user.setGender(Gender.MALE.getValue());
		user.setLogoURL("http://img.meetup.com/sihai.png");
		user.setPassword("123456");
		Location location = new Location();
		location.setZip("434000");
		location.setStreet("���Ŵ�3��9�ţ��ؾ���");
		location.setDistrict("ɳ����");
		location.setCity("������");
		location.setProvince("����ʡ");
		location.setCountry("�й�");
		location.setLatitude(32.00D);
		location.setLongitude(123.00D);
		user.setCurrentLocation(location);
		userDAO.insert(user);
	}

	@Test
	public void testQuery_userName() {
		User user = userDAO.query("sihai");
		System.out.println(user);
	}
	
	@Test
	public void testQuery_nearby() {
		List<User> userList = userDAO.queryNearby(32.00D, 123.00D, 1, 100);
		System.out.println(userList);
	}
	
	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

}
