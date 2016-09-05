package com.soch.uam.response;


import com.soch.uam.dto.UserDTO;

public class UserSVCResp extends UAMUIResponse{
	
		private UserDTO user;

		public UserDTO getUser() {
			return user;
		}

		public void setUser(UserDTO user) {
			this.user = user;
		}
		
		
}
