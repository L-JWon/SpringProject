package com.sist.vo;
import java.util.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
/*
 *   ID        NOT NULL VARCHAR2(20)  
	PWD       NOT NULL VARCHAR2(100) 
	NAME      NOT NULL VARCHAR2(34)  
	SEX                VARCHAR2(10)  
	BIRTHDAY  NOT NULL VARCHAR2(30)  
	EMAIL              VARCHAR2(100) 
	POST      NOT NULL VARCHAR2(10)  
	ADDR1     NOT NULL VARCHAR2(200) 
	ADDR2              VARCHAR2(100) 
	TEL                VARCHAR2(20)  
	CONTENT            CLOB          
	SESSIONID          VARCHAR2(100) 
	LIMITED            DATE          
	ROLE               VARCHAR2(10)  

 */
@Getter
@Setter
public class MemberVO {
  @NotNull
  private String id;
  @NotNull
  @Size(min = 1 , max = 10)
  private String pwd;
  @NotNull
  private String name;
  @NotNull
  private String sex;
  @NotNull
  private String birthday;
  private String email;
  @NotNull
  private String post;
  @NotNull
  private String addr1;
  private String addr2;
  private String tel;
  private String content;
  private String sessionId;
  private Date limited;
  private String role;
  private String tel1;
  private String tel2;
}
