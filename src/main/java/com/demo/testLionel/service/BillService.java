package com.demo.testLionel.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.testLionel.bean.Bill;
import com.demo.testLionel.bean.BillDetails;

@Service
public interface BillService {
	List<Bill> getAll();
	
	List<BillDetails> getDetails(int bid);
}
