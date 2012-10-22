package org.flowers.entity;

import javax.persistence.Entity;

/**
 * A buyable flower.
 * 
 * @author Nicolas Moser <nico@moser-home.de>
 * 
 */
@Entity
public class Flower {

	private String name;

	private String description;

	private Category category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
