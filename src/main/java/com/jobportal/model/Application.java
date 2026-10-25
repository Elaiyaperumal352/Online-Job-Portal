package com.jobportal.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="applications")
public class Application {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private Long jobId;
 private Long userId;
 private String applicantName;
 private String email;
 private String status="Applied";
 private LocalDate appliedDate=LocalDate.now();

 public Application(){}
 public Long getId(){return id;} public void setId(Long id){this.id=id;}
 public Long getJobId(){return jobId;} public void setJobId(Long jobId){this.jobId=jobId;}
 public Long getUserId(){return userId;} public void setUserId(Long userId){this.userId=userId;}
 public String getApplicantName(){return applicantName;} public void setApplicantName(String applicantName){this.applicantName=applicantName;}
 public String getEmail(){return email;} public void setEmail(String email){this.email=email;}
 public String getStatus(){return status;} public void setStatus(String status){this.status=status;}
 public LocalDate getAppliedDate(){return appliedDate;}
}