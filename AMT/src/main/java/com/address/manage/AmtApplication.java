package com.address.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.address.manage.dto.AddressBean;
import com.address.manage.repo.AmtRepository;
import com.address.manage.services.AmtServices;
import com.address.manage.web.AMTController;


@SpringBootApplication
@ComponentScan(basePackageClasses= {AmtApplication.class, AddressBean.class, AmtRepository.class, AMTController.class, AmtServices.class})
public class AmtApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmtApplication.class, args);
	}
	
	// http://localhost:8090/h2-console/login.do  --> H2 DB
	// INSERT INTO address_info VALUES (1, 'Ramesh',  'Ahmedabad', 2000, 'US'); 
	// http://localhost:8090/index.html   -->server url

}
