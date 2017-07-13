/**
 * Project Name:mysql
 * File Name:JdbcService.java
 * Package Name:com.example.mysql.service
 * Date:2017年7月10日下午3:17:13
 * Copyright (c) 2017, WangLZ All Rights Reserved.
 *
*/

package com.example.mysql.service;

import java.util.List;

import com.example.mysql.po.User;

/**
 * ClassName:JdbcService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年7月10日 下午3:17:13 <br/>
 * @author   WangLZ
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public interface JdbcService {
	
	
	public void addBatchUsers(List<User> userList);

}

