package com.demo.testLionel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.demo.testLionel.bean.Bill;
import com.demo.testLionel.bean.BillDetails;

@Mapper
public interface BillMapper {
	@Select("SELECT COUNT(*) as totalPage FROM till_Glenfield_bills")
	Integer getTotalPage();
	
	@Select("SELECT * FROM till_Glenfield_bills ORDER BY id DESC")
	List<Bill> getAll();
	
	@Select("SELECT * FROM till_Glenfield_bills_details WHERE bill_id=#{billId}")
	List<BillDetails> getDetails(@Param("billId") int billId);
}
