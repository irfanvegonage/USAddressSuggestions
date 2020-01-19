package com.address.manage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;

import com.address.manage.services.AmtServices;

/*
 * Indicate that a annotated class is a "component. Such classes
 * are considered as candidates for auto-detection
 */
@Component
public class AmtDBLoader implements CommandLineRunner {
	
	@Autowired
	public AmtServices amtServices;
	
	@Override
	public void run(String...args) throws Exception {
		System.out.println("Hello");
		amtServices.dropTableIfExists();
		amtServices.generateTestDataViaCSV();
	}
	
	static void print(Object text) {
		System.out.println(text);
	}

}
