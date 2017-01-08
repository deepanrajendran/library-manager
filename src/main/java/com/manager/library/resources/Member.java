package com.manager.library.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;

@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int memberId;

	private char memberType;
	private String memberName;
	private String memberAddress;
	
	@CreatedDate
	private DateTime joiningDate;
	
	private String emailId;

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public char getMemberType() {
		return memberType;
	}

	public void setMemberType(char memberType) {
		this.memberType = memberType;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public DateTime getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(DateTime joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
