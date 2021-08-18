package com.demo.testLionel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.testLionel.bean.Bill;
import com.demo.testLionel.bean.BillDetails;
import com.demo.testLionel.dao.BillMapper;
import com.demo.testLionel.service.BillService;
@Service
public class BillServiceImpl implements BillService {
	@Autowired
	private BillMapper billMapper;
	
	@Override
	public List<Bill> getAll() {
		// TODO Auto-generated method stub
		return billMapper.getAll();
	}

	@Override
	public List<BillDetails> getDetails(int bid) {
		// TODO Auto-generated method stub
		return billMapper.getDetails(bid);
	}

}
