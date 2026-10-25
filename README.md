# Online Job Portal & Recruitment System - Eclipse

## Technology
Java 17 + Spring Boot + REST API + Spring Data JPA + MySQL + HTML5 + CSS3 + JavaScript.

## Eclipse Setup
1. Install JDK 17.
2. Install Eclipse IDE with Maven support.
3. Install MySQL and make sure MySQL Server is running.
4. Import the ZIP as an Existing Maven Project.
5. Open `src/main/resources/application.properties`.
6. Change username/password if your MySQL credentials are different.
7. Run `JobPortalApplication.java` as `Spring Boot App`.
8. Open `http://localhost:8080/`.

The application creates the `job_portal` database automatically if the MySQL account has permission to create databases. JPA creates the tables automatically.

## Website pages
Home: `/index.html`
Jobs: `/jobs.html`
Job Details: `/job.html?id=1`
Register: `/register.html`
Login: `/login.html`
Recruiter Post Job: `/post-job.html`
Dashboard: `/dashboard.html`

## Important
This is a learning/project version. For production, add Spring Security, BCrypt password hashing, JWT/session authentication, validation, centralized exception handling, CSRF protection, resume upload, pagination and email notifications.
