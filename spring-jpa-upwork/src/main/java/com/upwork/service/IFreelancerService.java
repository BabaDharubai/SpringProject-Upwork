package com.upwork.service;

import java.util.List;

import com.upwork.model.Freelancer;

/**
 * @author BabaFakruddinDharubai
 *
 */
public interface IFreelancerService {
	
	void addFreelancer(Freelancer freelancer);

	
	void deleteFreelancer(int freelancerId);
	
	void updateFreelancer(Freelancer freelancer);
	
	Freelancer getById(int freelancerId) ;
	
	List<Freelancer> getAll();

	List<Freelancer> getByCategoryContain(String category);

	List<Freelancer> getBySkillContain(String skill) ;

	List<Freelancer> getByName(String name) ;

	List<Freelancer> getByCatSkillContain(String category, String skill) ;

	List<Freelancer> getByCatSkillTypContain(String category, String skill, String type) ;

	List<Freelancer> getByCatExpContain(String category, int experience) ;

	List<Freelancer> getByCatSkillCostContain(String category, String skill, double cost) ;
	
	List<Freelancer> getByCatSkillExpContain(String category, String skill, int experience) ;
	
	List<Freelancer> getByCatLocationContain(String category,String Location) ;

}
