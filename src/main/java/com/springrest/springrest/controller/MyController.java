package com.springrest.springrest.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Company;
import com.springrest.springrest.services.CompanyService;

@RestController
public class MyController
{
	@Autowired
	
	private CompanyService companyService;
	
	

	@GetMapping("/home")
	public String home()
	{
		return "Wlcome to Company Management System";
	}
	
	//Get the Companies
	
	@GetMapping("/Companies")
	public List<Company> getCompanies()
	{
//		return null;
		return this.companyService.getCompanies();
		
	}
	
	//Get Single Company
	
	@GetMapping ("/Companies/{CompanyID}")
	public Company getCompany(@PathVariable String CompanyID)
	{
		return this.companyService.getCompany(Long.parseLong(CompanyID));
	}
	
	
	// Add Company
	@PostMapping("/Companies")
	public Company addCompany(@RequestBody Company company)
	{
		return this.companyService.addCompany(company);
		
	}
	
	@PutMapping("/Companies")
	public Company updateCompany(@RequestBody Company company)
	{
		return this.companyService.updateCompany(company);
		
	}

	
}









