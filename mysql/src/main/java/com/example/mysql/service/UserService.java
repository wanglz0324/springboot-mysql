/**
 * Project Name:mysql
 * File Name:UserService.java
 * Package Name:com.example.mysql.service
 * Date:2017年7月8日上午10:20:29
 * Copyright (c) 2017, WangLZ All Rights Reserved.
 *
*/

package com.example.mysql.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.po.User;

/**
 * ClassName:UserService <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年7月8日 上午10:20:29 <br/>
 * 
 * @author WangLZ
 * @version
 * @since JDK 1.6
 * @see
 */
public interface UserService extends JpaRepository<User, String> {

}
