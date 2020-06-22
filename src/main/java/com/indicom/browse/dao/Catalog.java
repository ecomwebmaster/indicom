package com.indicom.browse.dao;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
	
	private List<String> rootCategoryIds= new ArrayList<String>();

	public List<String> getRootCategoryIds() {
		return rootCategoryIds;
	}

	public void setRootCategoryIds(List<String> rootCategoryIds) {
		this.rootCategoryIds = rootCategoryIds;
	}

}
