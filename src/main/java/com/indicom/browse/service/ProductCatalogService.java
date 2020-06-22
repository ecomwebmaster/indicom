package com.indicom.browse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.indicom.browse.model.CatalogDAO;
import com.indicom.browse.repository.ProductCatalogRepository;




@Service
public class ProductCatalogService {
	
	@Autowired
	private ProductCatalogRepository lProductCatalogRepository;

	
	public List<String> getAllRootCategoriesService(String pCatalogId){
		System.out.println("ProductCatalogService.getAllRootCategoriesService "+pCatalogId);
		return lProductCatalogRepository.findCatalogById(pCatalogId);
	}
	
	
}
