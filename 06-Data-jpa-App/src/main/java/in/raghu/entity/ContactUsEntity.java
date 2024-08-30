package in.raghu.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="contact_us_leads")
public class ContactUsEntity {
	
	@Id
	private Integer id;
	private String name;
	private String phoneNo;
	private String email;
	
	@CreationTimestamp
	@Column(name="created_date", updatable=false)
	private LocalDateTime createdDate;
	
	@UpdateTimestamp
	@Column(name="updated_date", insertable = false)
	private LocalDateTime updatedDate;

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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDateTime getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDateTime updatedDate) {
		this.updatedDate = updatedDate;
	}

	public ContactUsEntity(Integer id, String name, String phoneNo, String email, LocalDateTime createdDate,
			LocalDateTime updatedDate) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public ContactUsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
