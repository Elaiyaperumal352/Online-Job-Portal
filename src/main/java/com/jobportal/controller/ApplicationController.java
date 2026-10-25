package com.jobportal.controller;
import com.jobportal.model.Application;
import com.jobportal.repository.ApplicationRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {
 private final ApplicationRepository repo;
 public ApplicationController(ApplicationRepository repo){this.repo=repo;}

 @PostMapping public Application apply(@RequestBody Application a){return repo.save(a);}
 @GetMapping("/user/{id}") public List<Application> user(@PathVariable Long id){return repo.findByUserId(id);}
 @GetMapping("/job/{id}") public List<Application> job(@PathVariable Long id){return repo.findByJobId(id);}
 @PutMapping("/{id}/status")
 public Application status(@PathVariable Long id,@RequestParam String value){
   Application a=repo.findById(id).orElseThrow(); a.setStatus(value); return repo.save(a);
 }
}