package com.cts.grizzly.bean;

import java.io.Serializable; 
import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity(name="Category")
@Table(name="category_table")
public class Category {
	@Id
	@Column(name="id")
	private String id;
	@Column(name="name")
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Category(){}
}
