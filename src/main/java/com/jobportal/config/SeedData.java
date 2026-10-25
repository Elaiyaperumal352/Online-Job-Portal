package com.jobportal.config;
import com.jobportal.model.Job;
import com.jobportal.repository.JobRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.*;

@Configuration
public class SeedData {
 @Bean CommandLineRunner seed(JobRepository repo){
  return args->{
   if(repo.count()==0){
    repo.save(make("Java Full Stack Developer","TechNova Solutions","Chennai","Full Time","₹4-7 LPA","Java, Spring Boot, MySQL, HTML, CSS","Develop and maintain scalable web applications."));
    repo.save(make("Frontend Developer","WebCraft Technologies","Bangalore","Full Time","₹3-6 LPA","HTML, CSS, JavaScript, React","Build responsive and user-friendly web interfaces."));
    repo.save(make("Backend Developer","CodeSphere","Hyderabad","Full Time","₹4-8 LPA","Java, Spring Boot, REST API, SQL","Develop secure backend services and REST APIs."));
   }
  };
 }
 private Job make(String t,String c,String l,String type,String sal,String skills,String d){
  Job j=new Job();j.setTitle(t);j.setCompany(c);j.setLocation(l);j.setJobType(type);j.setSalary(sal);j.setSkills(skills);j.setDescription(d);return j;
 }
}