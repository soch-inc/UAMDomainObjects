package com.soch.uam.dto;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class UserDTO {

	private int id;
	
	@NotNull
	@Pattern(regexp="^[\\w\\.]{6,}$", message="Error.userId.Format")
	private String userId;
	
	
	@Pattern(regexp="((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^A-Za-z0-9])\\S{6,20})", message="Error.password.Format")
	private String password;

	private String SSN;

	private String phoneNumber;
	
	@NotNull(message = "Error.firstName.Missing")
	private String firstName;
	
	@NotNull(message = "Error.lastName.Missing")
	private String lastName;

	private String middleName;

	@Pattern(regexp="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", message="Error.emailAddress.Format")
	private String emailId;

	//private String activeFlag;
	
	private String dateOfBirth;

	private String modifiedTs;

	private String createdBy;

	private String updatedBy;
	
	private String lastLoggedin;
	
	

	@JsonInclude(Include.NON_NULL)
	private Set<AddressDTO> address;
	
	@JsonInclude(Include.NON_NULL)
	private Set<SecurityQADTO> securityQA;
	
	private String token;
	
	private boolean activeFlag;

	private boolean lockFlag;
	
	
	
	
	
	//private AddressDTO address;
	
	
	
	public boolean isActiveFlag() {
		return activeFlag;
	}

	public String getLastLoggedin() {
		return lastLoggedin;
	}

	public void setLastLoggedin(String lastLoggedin) {
		this.lastLoggedin = lastLoggedin;
	}

	public boolean isLockFlag() {
		return lockFlag;
	}

	public void setActiveFlag(boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public void setLockFlag(boolean lockFlag) {
		this.lockFlag = lockFlag;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}



	
	
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassowrd() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/*public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}*/

	/*public String getLockFlag() {
		return lockFlag;
	}

	public void setLockFlag(String lockFlag) {
		this.lockFlag = lockFlag;
	}

	public String getCreatedTs() {
		return createdTs;
	}

	public void setCreatedTs(String createdTs) {
		this.createdTs = createdTs;
	}*/

	public String getModifiedTs() {
		return modifiedTs;
	}

	public void setModifiedTs(String modifiedTs) {
		this.modifiedTs = modifiedTs;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Set<AddressDTO> getAddress() {
		return address;
	}

	public void setAddress(Set<AddressDTO> address) {
		this.address = address;
	}
	
	

	public Set<SecurityQADTO> getSecurityQA() {
		return securityQA;
	}
	
	public void setSecurityQA(Set<SecurityQADTO> securityQA) {
		this.securityQA = securityQA;
	}


}
