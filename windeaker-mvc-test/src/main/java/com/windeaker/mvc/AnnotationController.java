package com.windeaker.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO:
 *
 * @author windeaker
 * @date 2022/7/4
 */
@RestController
public class AnnotationController {

	@GetMapping("userlistOfAnnotation")
	public ModelAndView userlistOfAnnotation() throws Exception {
		List<User> userList=new ArrayList<>();
		userList.add(new User("张三",19));
		userList.add(new User("李四",17));
		userList.add(new User("王五",13));
		return new ModelAndView("userlist","users",userList);
	}

//	@GetMapping("userlistNoneView")
//	public ModelAndView userlistNoneView() throws Exception {
//		List<User> userList=new ArrayList<>();
//		userList.add(new User("张三",19));
//		userList.add(new User("李四",17));
//		userList.add(new User("王五",13));
//		return new ModelAndView(userList);
//	}
}
