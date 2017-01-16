package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.backend.dao.SupplierDao;
import com.backend.model.Supplier;
@Controller
public class SupplierController {
	@Autowired
	SupplierDao supplierDao;
	@RequestMapping("/test3")
	public String Test3()
	{
		 Supplier supplier=new Supplier();
	        supplier.setsName("Moto");
	        supplier.setsAddress("TPTY");
	        supplierDao.addSupplier(supplier);
	       
	        return "login";
	}

}
