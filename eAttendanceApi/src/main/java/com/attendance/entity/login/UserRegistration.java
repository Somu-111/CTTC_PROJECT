package com.attendance.entity.login;


import java.time.LocalDate;

import jakarta.persistence.Embedded; 
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 
import jakarta.persistence.Id; 
import jakarta.persistence.Table; 
import lombok.Data; 
@Entity 
@Data 
@Table(name = "USER_REGISTRATION") 
public class UserRegistration { 
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY) 
private Long regdId; 
private String userId; 
private String firstname; 
private String lastName; 
private String mail; 
private String mobile; 
private LocalDate dob; 
private String gender; 
@Embedded 
private UserInfo userInfo; 
}