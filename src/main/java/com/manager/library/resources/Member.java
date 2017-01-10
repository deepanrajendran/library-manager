package com.manager.library.resources;



import java.math.BigInteger;

import org.joda.time.DateTime;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Member {
	@Id
	private BigInteger memberId;

	private char memberType;
	private String memberName;
	private String memberAddress;
	
	@CreatedDate
	private DateTime joiningDate;
	
	private String emailId;

	public BigInteger getMemberId() {
		return memberId;
	}

	public void setMemberId(BigInteger memberId) {
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
