package com.address.manage.services;

import java.util.List;

import com.address.manage.dto.AddressBean;

public interface AmtServices {
	List<AddressBean> getReportNames();
	void generateTestDataViaCSV();
	void dropTableIfExists();
	

}
