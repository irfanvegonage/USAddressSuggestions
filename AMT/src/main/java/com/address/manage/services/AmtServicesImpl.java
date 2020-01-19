package com.address.manage.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.stereotype.Services;

import com.address.manage.dto.AddressBean;
import com.address.manage.repo.AmtRepository;

@Service
public class AmtServicesImpl implements AmtServices {
	
	@Autowired
	private AmtRepository amtRepository;
	

	@Override
	public List<AddressBean> getReportNames()
	{
      return amtRepository.getAllReportnames();
	}

	public void generateTestDataViaCSV()
	{
    amtRepository.generateTestData();
	}

	@Override
	public void dropTableIfExists()
	{
     amtRepository.dropTableIfExists();
	}

}
