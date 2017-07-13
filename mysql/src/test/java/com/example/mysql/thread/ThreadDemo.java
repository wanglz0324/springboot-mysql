/**
 * Project Name:mysql
 * File Name:ThreadDemo.java
 * Package Name:com.example.mysql.thread
 * Date:2017年7月13日上午9:49:23
 * Copyright (c) 2017, WangLZ All Rights Reserved.
 *
*/

package com.example.mysql.thread;

/**
 * ClassName:ThreadDemo <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年7月13日 上午9:49:23 <br/>
 * 
 * @author WangLZ
 * @version
 * @since JDK 1.6
 * @see
 */
public class ThreadDemo {

	public static void main(String[] args) {
//		java.util.concurrent.ExecutorService executors = Executors.newFixedThreadPool(5);
//		executors.execute(new Init());
		
		
		

		
		
		
		Thread t1 = new Thread(new Init());
		t1.start();
	}

	

}
class Init implements Runnable {

	@Override
	public void run() {

		System.err.println("hello");

	}

}