/**
 * Project Name:mysql
 * File Name:UserServiceImpl.java
 * Package Name:com.example.mysql.service.impl
 * Date:2017年7月10日下午3:15:36
 * Copyright (c) 2017, WangLZ All Rights Reserved.
 *
*/

package com.example.mysql.service.impl;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.mysql.po.User;
import com.example.mysql.service.JdbcService;

/**
 * ClassName:UserServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年7月10日 下午3:15:36 <br/>
 * 
 * @author WangLZ
 * @version
 * @since JDK 1.6
 * @see
 */
@Service
@Transactional(readOnly = true)
public class JdbcServiceImpl implements JdbcService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	@Transactional
	public void addBatchUsers(final List<User> userList) {
		String sql = "insert into ccp_sms_user(id,info) values (?,?)";

		jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public int getBatchSize() {
				return userList.size();
			}

			@Override
			public void setValues(java.sql.PreparedStatement ps, int i) throws SQLException {

				ps.setString(1, userList.get(i).getId());
				ps.setString(2, userList.get(i).getInfo());
			}
		});
	}
}
