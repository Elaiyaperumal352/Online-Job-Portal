function loadJobs(target,keyword=""){
 const el=document.getElementById(target);
 fetch(keyword?"/api/jobs?keyword="+encodeURIComponent(keyword):"/api/jobs").then(r=>r.json()).then(jobs=>{
 if(!jobs.length){el.innerHTML="<div class='card'><h3>No jobs found</h3><p>Try another search.</p></div>";return;}
 el.innerHTML=jobs.map(j=>`<div class="card"><span class="badge">${j.jobType}</span><h3>${j.title}</h3><b>${j.company}</b><p>📍 ${j.location}</p><p>💰 ${j.salary||"Not specified"}</p><p class="skills">${j.skills||""}</p><a class="button" href="job.html?id=${j.id}">View Details</a></div>`).join("");
 }).catch(()=>el.innerHTML="<div class='card'><h3>Server error</h3><p>Start the Spring Boot application.</p></div>");
}