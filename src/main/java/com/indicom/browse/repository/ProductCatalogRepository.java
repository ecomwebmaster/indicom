package com.indicom.browse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.indicom.browse.model.CatalogDAO;



@Repository
public interface ProductCatalogRepository extends JpaRepository<CatalogDAO, String>{

	//@Query("select ROOT_CAT_ID from dcs_root_cats where catalog_id=?1")	
	
	
	public static final String FIND_ROOT_CATS = "select ROOT_CAT_ID from dcs_root_cats where catalog_id=?1";

	@Query(value = FIND_ROOT_CATS, nativeQuery = true)
	public List<String> findCatalogById(String catalogId);
	
	
}
