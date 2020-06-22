package com.indicom.browse.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.indicom.browse.dao.Catalog;
import com.indicom.browse.model.CatalogDAO;
import com.indicom.browse.service.ProductCatalogService;

@RestController
@RequestMapping("/rest/v1/browse")
public class ProductCatalogController {
	
	@Autowired
	private ProductCatalogService lProductCatalogService;
	
	@RequestMapping(path="/categories",method = RequestMethod.GET)
	public Catalog getAllRootCategories(@RequestParam(required = true) final String catalogid){
		System.out.println("ProductCatalogController.getAllRootCategories "+catalogid);
		Catalog catalog = new Catalog();
		catalog.getRootCategoryIds().addAll(lProductCatalogService.getAllRootCategoriesService(catalogid));
		return catalog;
	}
	
	
	
}
