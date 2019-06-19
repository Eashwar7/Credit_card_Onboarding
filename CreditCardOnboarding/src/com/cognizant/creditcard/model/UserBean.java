package com.cognizant.creditcard.model;
public class UserBean
{
			    private String fname;
			    private String lname;
                private int age;
                private String gender;
                private String contactno;
                private char status;
                private String uid;
                private  String password;
                
                public String getFname() {
                                return fname;
                }
                public void setFname(String fname) {
                                this.fname = fname;
                }                               
                public String getLname() {
                                return lname;
                }
                public void setLname(String lname) {
                                this.lname = lname;
                }                               
                public int getAge() {
                                return age;
                }
                public void setAge(int age) {
                                this.age = age;
                }

                public String getGender() {
                                return gender;
                }
                public void setGender(String gender) {
                                this.gender = gender;
                }

                public String getContactno() {
                                return contactno;
                }
                public void setContactno(String contactno) {
                                this.contactno = contactno;
                }                                
                public char getStatus() {
                                return status;
                }
                public void setStatus(char status) {
                                this.status = status;
                }  
                public String getUid() {
                                return uid;
                }
                public void setUid(String uid) {
                                this.uid = uid;
                }                             
                public String getPassword() {
                                return password;
                }
                public void setPassword(String password) {
                                this.password = password;
                }
                public UserBean()
                {
                                
                }
                //user
                public UserBean(String fname, String lname,String gender, int age , String contactno, String uid, String password) {
                                super();
                                this.fname = fname;
                                this.lname = lname;
                                this.age = age;
                                this.gender = gender;
                                this.contactno = contactno;
                                this.uid = uid;
                                this.password = password;
                                                            
                }                             
}

