package com.soch.uam.request;

import javax.validation.Valid;

import com.soch.uam.dto.UserDTO;

public class UserSVCReq {
	
	@Valid
	private UserDTO user;

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}
	
	

}
