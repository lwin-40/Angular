package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="customer")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)

public class Customer {

	@Id
	@GeneratedValue
	@Column(name="customer_id")
	 Long customerId;

	@Column(name = "customer_Name")
	private String customerName;
	@Column(name = "customer_Phone")
	private String customerPhone;
	@Column(name = "customer_NRCNo")
	private String customerNRC;
	@Column(name = "customer_Address")
	private String customerAddress;
	@Column(name = "customer_Occupation")
	private String customerOccupation;
	
	@OneToOne(mappedBy = "customer", 
            cascade = CascadeType.ALL)
	
    private Member member;
	
	public void customer() {
		
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerNRC() {
		return customerNRC;
	}
	public void setCustomerNRC(String customerNRC) {
		this.customerNRC = customerNRC;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerOccupation() {
		return customerOccupation;
	}
	public void setCustomerOccupation(String customerOccupation) {
		this.customerOccupation = customerOccupation;
	
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	
	
	
//	@Override
//    public String toString() {
//        return "Employee [id=" + id + ", name=" + name + ", surname=" + surname
//                + ", title=" + title + ", phones=" + phones + "]";
//    }

}
