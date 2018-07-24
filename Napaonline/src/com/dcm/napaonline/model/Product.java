package com.dcm.napaonline.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="product_Id")
	 private long id;
	@Column(name="filename")
	 private String fileName;
	@Lob
	@Column(name="images")
	 private byte[] image;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	
	 
	 

}
