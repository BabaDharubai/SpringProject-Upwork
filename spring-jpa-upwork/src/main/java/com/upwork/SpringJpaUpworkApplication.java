package com.upwork;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.upwork.service.IFreelancerService;

@SpringBootApplication
public class SpringJpaUpworkApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaUpworkApplication.class, args);
	}
	
	private IFreelancerService freelancerService;
	@Autowired
	public void setFreelancerService(IFreelancerService freelancerService) {
		this.freelancerService = freelancerService;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Freelancer freelancer=new Freelancer(4,"Rolex","Sales","SoftSkills",3,499,"Full-Time","Banglore");
//		freelancerService.addFreelancer(freelancer);
//		freelancerService.updateFreelancer(freelancer);
		freelancerService.getByCategoryContain("Development").forEach(System.out::println);
		System.out.println();
		freelancerService.getByName("Harish").forEach(System.out::println);
		System.out.println();
		freelancerService.getBySkillContain("SoftSkills").forEach(System.out::println);
		System.out.println();
		freelancerService.getByCatSkillContain("Development", "FullStack").forEach(System.out::println);
		System.out.println();
		freelancerService.getAll().forEach(System.out::println);
		System.out.println();
		freelancerService.getByCatExpContain("Design", 1).forEach(System.out::println);
		System.out.println();
		freelancerService.getByCatSkillCostContain("Embedded", "C",2500).forEach(System.out::println);
		System.out.println();
		freelancerService.getByCatSkillExpContain("Sales", "SoftSkills", 2).forEach(System.out::println);
		System.out.println();
		freelancerService.getByCatLocationContain("Sales", "Bang").forEach(System.out::println);
		System.out.println();
		System.out.println(freelancerService.getById(3));
		
	}
	

}
