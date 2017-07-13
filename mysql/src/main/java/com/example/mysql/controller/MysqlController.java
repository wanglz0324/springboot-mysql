/**
 * Project Name:mysql
 * File Name:MysqlController.java
 * Package Name:com.example.mysql.controller
 * Date:2017年7月8日上午10:19:30
 * Copyright (c) 2017, WangLZ All Rights Reserved.
 *
*/

package com.example.mysql.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysql.po.User;
import com.example.mysql.service.JdbcService;
import com.example.mysql.service.UserService;

/**
 * ClassName:MysqlController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年7月8日 上午10:19:30 <br/>
 * 
 * @author WangLZ
 * @version
 * @since JDK 1.6
 * @see
 */
@RestController
@RequestMapping("/user/")
public class MysqlController {
	@Resource
	UserService userService;
	
	@Resource
	JdbcService jdbcService;

	@RequestMapping("index")
	@ResponseBody
	String index() {
		return "hello";
	}

	@RequestMapping("add")
	@ResponseBody
	String addUser() {
		Long b = System.currentTimeMillis();
		List<User> userList = new ArrayList<User>();
		for (int i = 0; i < 20000; i++) {
			User user = new User();
			user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
			user.setInfo(UUID.randomUUID().toString());
			userList.add(user);
			if (i % 1000 == 0) {
				userService.save(userList);
//				jdbcService.addBatchUsers(userList);
				userList.clear();
			}
		}
		Long e = System.currentTimeMillis();
		return (e - b) + "ms";
	}

}
