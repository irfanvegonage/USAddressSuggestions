package com.address.manage.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.address.manage.dto.AddressBean;
import com.address.manage.services.AmtServices;

@RestController
@RequestMapping("/rest")
public class AMTController {
	
	/*
	 * @RestController annotation is a combination of spring @Controller
	 */
	
	
	@Autowired
	private AmtServices amtServices;

	@GetMapping("/getAddrs")
	public List<AddressBean> getReportNames(){
	         return amtServices.getReportNames();
	}

	@GetMapping("/submit")
	public String onSubmit(@RequestParam(name= "myCountry") String addr)
	{
	return addr;
	}
	

}
