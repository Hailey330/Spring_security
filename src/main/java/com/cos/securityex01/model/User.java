package com.cos.securityex01.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

// ORM(Object Relation Mapping) 기술 : JPA

@Data
@Entity // JPA가 밑의 속성을 토대로 테이블을 생성해주는 어노테이션
public class User {
	@Id // Primary Key를 걸어줌
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	private String username;
	private String password;
	private String email;
	private String role; // ROLE_USER, ROLE_ADMIN
	@CreationTimestamp
	private Timestamp createDate;
}
