package com.greatlearning.crm.CRMProject;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.crm.CRMProject.service.CustomerService;
import com.greatlearning.crm.CRMProject.service.CustomerServiceImpl;

public class CRMApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

		CustomerService service = ctx.getBean("userDetailService", CustomerServiceImpl.class);

		List<Customer> userDetails = service.getAllCustomers();
		System.out.println("All User Details:");
		for (UserDetail userDetail : userDetails) {
			System.out.println(userDetail);
		}

		System.out.println();

		UserDetail userDetail = service.getUserDetail(7);
		System.out.println("User Detail: " + userDetail);

		ctx.close();

	}

}