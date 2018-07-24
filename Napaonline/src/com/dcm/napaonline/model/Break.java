package com.dcm.napaonline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Store;

@Entity
@Indexed
@Table(name="break")
public class Break {
	
	@Id
	@Column(name="part_Id")
	private String part;
	
	@Column(name = "title", nullable= false, length = 128)
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	private String description;
	
	@Column(name = "price", nullable= false, length = 128)
	@Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
	private String price;
	
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
	

}
