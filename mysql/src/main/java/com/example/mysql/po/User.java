/**
 * Project Name:mysql
 * File Name:User.java
 * Package Name:com.example.mysql.po
 * Date:2017年7月8日上午10:20:52
 * Copyright (c) 2017, WangLZ All Rights Reserved.
 *
*/

package com.example.mysql.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

/**
 * ClassName:User <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年7月8日 上午10:20:52 <br/>
 * 
 * @author WangLZ
 * @version
 * @since JDK 1.6
 * @see
 */
@Getter
@Setter
@Entity
@Table(name = "ccp_sms_user")
public class User {

	private String id;
	private String info;

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 32)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	public String getId() {
		return id;
	}

}
