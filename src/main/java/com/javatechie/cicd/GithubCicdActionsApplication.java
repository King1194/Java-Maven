package com.javatechie.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {

	@GetMapping("/welcome")
	public String welcome(){
		String str
		    = "<html><body><font color=\"green\">"
		      + "<h1>WELCOME To java-maven</h1>"
		      + "</font></body></html>";
		return str;
	}
	
	@RequestMapping(
		method = { RequestMethod.GET },
		value = { "/info" })

	public String info()
	{
		String str2
		    = "<html><body><font color=\"green\">"
		      + "<h2>Java-maven is a project"
		      + " showing basic ci/cd pipeline development."
		      + "This project has been "
		      + "created by using gitHub actions, "
		      + "& Docker hub."
		      + "</h2></font></body></html>";
		return str2;
	}

//	echo "# github-actions-example" >> README.md
//	git init
//	git add README.md
//	git commit -m "first commit"
//	git branch -M main
//	git remote add origin https://github.com/Java-Techie-jt/github-actions-example.git
//	git push -u origin main
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}

}
