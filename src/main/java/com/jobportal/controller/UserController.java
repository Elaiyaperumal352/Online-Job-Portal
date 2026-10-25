package com.jobportal.controller;
import com.jobportal.model.User;
import com.jobportal.repository.UserRepository;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
 private final UserRepository repo;
 public UserController(UserRepository repo){this.repo=repo;}

 @PostMapping("/register")
 public ResponseEntity<?> register(@RequestBody User u){
   if(repo.findByEmail(u.getEmail()).isPresent()) return ResponseEntity.badRequest().body("Email already registered");
   if(u.getRole()==null||u.getRole().isBlank()) u.setRole("JOB_SEEKER");
   return ResponseEntity.ok(repo.save(u));
 }

 @PostMapping("/login")
 public ResponseEntity<?> login(@RequestBody User u){
   return repo.findByEmail(u.getEmail())
     .filter(x->x.getPassword().equals(u.getPassword()))
     .<ResponseEntity<?>>map(ResponseEntity::ok)
     .orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password"));
 }
}