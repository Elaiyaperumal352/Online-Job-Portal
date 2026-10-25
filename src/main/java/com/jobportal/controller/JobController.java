package com.jobportal.controller;
import com.jobportal.model.Job;
import com.jobportal.repository.JobRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
 private final JobRepository repo;
 public JobController(JobRepository repo){this.repo=repo;}

 @GetMapping
 public List<Job> all(@RequestParam(required=false) String keyword){
   if(keyword==null||keyword.isBlank()) return repo.findAll();
   return repo.findByTitleContainingIgnoreCaseOrLocationContainingIgnoreCase(keyword,keyword);
 }
 @GetMapping("/{id}")
 public ResponseEntity<Job> one(@PathVariable Long id){
   return repo.findById(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
 }
 @PostMapping public Job create(@RequestBody Job job){return repo.save(job);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){repo.deleteById(id);}
}