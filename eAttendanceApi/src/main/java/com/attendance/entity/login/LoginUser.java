package com.attendance.entity.login;

import lombok.Data;

@Data
public class LoginUser {
	private String mail;
	private String password;
	private Integer status;
}
