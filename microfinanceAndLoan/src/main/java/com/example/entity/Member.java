package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "member")
@SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 100)

public class Member {

	@Id
	@GeneratedValue
	 Long memberId;
	
	@Column(name = "member_type")
	private String membertype;
	@Column(name = "member_groupName")
	private String memberGroupName;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id")
	@JsonBackReference
    private Customer customer;

	public void member() { 
	
	}
	
	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getMembertype() {
		return membertype;
	}

	public void setMembertype(String membertype) {
		this.membertype = membertype;
	}

	public String getMemberGroupName() {
		return memberGroupName;
	}

	public void setMemberGroupName(String memberGroupName) {
		this.memberGroupName = memberGroupName;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
	
}
