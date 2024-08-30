package in.raghu.entity;


import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	@Lob
	private byte[] imageData;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getImageData() {
		return imageData;
	}
	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", imageData=" + Arrays.toString(imageData) + "]";
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer id, String name, byte[] imageData) {
		super();
		this.id = id;
		this.name = name;
		this.imageData = imageData;
	}
	
	
	
	
}
