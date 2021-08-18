package com.demo.testLionel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.testLionel.bean.Bill;
import com.demo.testLionel.bean.BillDetails;
import com.demo.testLionel.service.BillService;
import com.demo.testLionel.util.DetailsUtil;
import com.demo.testLionel.util.PageHelperUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@ComponentScan("com.demo.testLionel.service.*")
public class IndexController {
	@Autowired
	BillService billService;

	@GetMapping("/index/{pageNum}/{pageSize}")
	public PageHelperUtil<Bill> getPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize){
		//Page
		PageHelper.startPage(pageNum,pageSize);
		List<Bill> list = billService.getAll();
		PageInfo pageInfo = new PageInfo(list);
		PageHelperUtil<Bill> pageHelperUtil = new PageHelperUtil<>();
		pageHelperUtil.setCurrentPage(pageNum);
		pageHelperUtil.setPageSize(pageInfo.getPageSize());
		pageHelperUtil.setList(list);
		pageHelperUtil.setTotal(pageInfo.getTotal());
		pageHelperUtil.setPageTotal(pageInfo.getPages());
		return pageHelperUtil;
	}
	@GetMapping("/details/{bid}")
	public DetailsUtil<BillDetails> getDetails(@PathVariable Integer bid){
		List<BillDetails> list = billService.getDetails(bid);
		DetailsUtil<BillDetails> detailsUtil = new DetailsUtil();
		detailsUtil.setList(list);
		return detailsUtil;
	}
}
