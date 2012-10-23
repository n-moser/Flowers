package org.flowers.entity;

import javax.persistence.Entity;

/**
 * The flower category.
 * 
 * @author nmoser
 * 
 */
@Entity
public class Category {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
