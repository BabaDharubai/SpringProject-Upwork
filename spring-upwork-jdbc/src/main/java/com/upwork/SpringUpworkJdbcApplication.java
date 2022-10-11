package com.upwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.upwork.model.Category;
import com.upwork.model.Type;
import com.upwork.service.IFreelancerService;

@SpringBootApplication
public class SpringUpworkJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringUpworkJdbcApplication.class, args);
	}

	@Autowired
	IFreelancerService freelancerService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		freelancerService.getByCategoryContain(Category.IT.type).forEach(System.out::println);
		System.out.println();
		freelancerService.getByCatExpContain("Design & Creative", 1).forEach(System.out::println);
		System.out.println();
		freelancerService.getByCatLocationContain("Design & Creative", "India").forEach(System.out::println);
		System.out.println();
		freelancerService.getByCatSkillContain("Design & Creative", "3d Design").forEach(System.out::println);
		System.out.println();
		freelancerService.getByCatSkillCostContain(Category.IT.type, "Developer", 1000).forEach(System.out::println);
		System.out.println();
		freelancerService.getByCatSkillExpContain(Category.IT.type,"Developer", 1).forEach(System.out::println);
		System.out.println();
		freelancerService.getByCatSkillTypContain(Category.IT.type, "Developer",Type.FULLTIME.type).forEach(System.out::println);
		System.out.println();
		freelancerService.getByName("Harish").forEach(System.out::println);
		System.out.println();
		freelancerService.getBySkillContain("Developer").forEach(System.out::println);
		
	}

}
