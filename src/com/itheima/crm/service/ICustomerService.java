package com.itheima.crm.service;

import java.util.List;

import javax.jws.WebService;

import com.itheima.crm.domain.Customer;
@WebService
public interface ICustomerService {
	public List<Customer> findAll();
}
