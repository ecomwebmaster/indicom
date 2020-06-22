package com.indicom.browse.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="dcs_root_cats")
public class CatalogDAO {
	
	@Id
	@Column(name = "CATALOG_ID")
	private String catalogId;
	
	@Column(name="ROOT_CAT_ID")
	private String rootCategories;

	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public String getRootCategories() {
		return rootCategories;
	}

	public void setRootCategories(String rootCategories) {
		this.rootCategories = rootCategories;
	}

}
