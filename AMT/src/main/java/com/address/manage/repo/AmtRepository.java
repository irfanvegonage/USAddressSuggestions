package com.address.manage.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.address.manage.dto.AddressBean;


/*
 * Indicatescthat an annotated class is a "Repositroy", originally defned
 * by Domain-Driven Design
 */

@Repository
public interface AmtRepository extends JpaRepository<AddressBean , Integer>{
    @Query("from AddressBean")
    List<AddressBean> getAllReportnames();

    @Transactional
    @Modifying
    @Query(
            value = "DROP TABLE IF EXISTS address_info",
            nativeQuery = true)
    void dropTableIfExists();

    @Transactional
    @Modifying			
    @Query(
            value = "CREATE TABLE address_info AS SELECT building_number,"
                       + "street_name,state,pin,country "
                            + "FROM CSVREAD('classpath:data/testData.csv')",
            nativeQuery = true)
    void generateTestData();

	

}
