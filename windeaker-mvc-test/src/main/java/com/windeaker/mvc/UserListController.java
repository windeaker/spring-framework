package com.windeaker.mvc;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO:
 *
 * @author windeaker
 * @date 2022/7/2
 */
public class UserListController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List<User> userList=new ArrayList<>();
		userList.add(new User("张三",19));
		userList.add(new User("李四",17));
		userList.add(new User("王五",13));
		return new ModelAndView("userlist","users",userList);
	}
}
