package com.jobportal.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="jobs")
public class Job {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String title;
 private String company;
 private String location;
 private String jobType;
 private String salary;
 private String skills;
 @Column(length=3000) private String description;
 private LocalDate postedDate;

 public Job(){postedDate=LocalDate.now();}
 public Long getId(){return id;} public void setId(Long id){this.id=id;}
 public String getTitle(){return title;} public void setTitle(String title){this.title=title;}
 public String getCompany(){return company;} public void setCompany(String company){this.company=company;}
 public String getLocation(){return location;} public void setLocation(String location){this.location=location;}
 public String getJobType(){return jobType;} public void setJobType(String jobType){this.jobType=jobType;}
 public String getSalary(){return salary;} public void setSalary(String salary){this.salary=salary;}
 public String getSkills(){return skills;} public void setSkills(String skills){this.skills=skills;}
 public String getDescription(){return description;} public void setDescription(String description){this.description=description;}
 public LocalDate getPostedDate(){return postedDate;} public void setPostedDate(LocalDate postedDate){this.postedDate=postedDate;}
}