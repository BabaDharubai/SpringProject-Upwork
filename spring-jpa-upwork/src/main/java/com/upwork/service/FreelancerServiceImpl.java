package com.upwork.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.upwork.model.Freelancer;
import com.upwork.repository.IFreelancerRepository;

/**
 * @author BabaFakruddinDharubai
 *
 */
@Service
public class FreelancerServiceImpl implements IFreelancerService{

	private IFreelancerRepository freelancerRepository;
	@Autowired
	public void setFreelancerRepository(IFreelancerRepository freelancerRepository) {
		this.freelancerRepository = freelancerRepository;
	}

	@Override
	public void addFreelancer(Freelancer freelancer) {
		freelancerRepository.save(freelancer);
	}

	@Override
	public void deleteFreelancer(int freelancerId) {
		freelancerRepository.deleteById(freelancerId);
	}
	
	@Override
	public void updateFreelancer(Freelancer freelancer) {
		freelancerRepository.save(freelancer);
	}

	@Override
	public Freelancer getById(int freelancerId) {
		return freelancerRepository.findById(freelancerId).get();
	}

	public List<Freelancer> getAll() {
		return freelancerRepository.findAll();
	}

	@Override
	public List<Freelancer> getByCategoryContain(String category) {
		return freelancerRepository.findByCategoryContaining(category);
	}

	@Override
	public List<Freelancer> getBySkillContain(String skill) {
		return freelancerRepository.readBySkillContaining(skill);
	}

	@Override
	public List<Freelancer> getByName(String name) {
		return freelancerRepository.getByFreelancerNameContaining(name);
	}

	@Override
	public List<Freelancer> getByCatSkillContain(String category, String skill) {
		return freelancerRepository.findByCategoryContainingAndSkillContaining(category, skill);
	}

	@Override
	public List<Freelancer> getByCatSkillTypContain(String category, String skill, String type) {
		return freelancerRepository.findByCategoryContainingAndSkillContainingAndTypeContaining(category, skill, type);
	}

	@Override
	public List<Freelancer> getByCatExpContain(String category, int experience) {
		return freelancerRepository.findByCategoryContainingAndExperienceGreaterThanEqual(category, experience);
	}

	@Override
	public List<Freelancer> getByCatSkillCostContain(String category, String skill, double cost) {
		return freelancerRepository.findByCategoryContainingAndSkillContainingAndCostLessThanEqual(category, skill, cost);
	}

	@Override
	public List<Freelancer> getByCatSkillExpContain(String category, String skill, int experience) {
		return freelancerRepository.findByCategoryContainingAndSkillContainingAndExperienceGreaterThanEqual(category, skill, experience);
	}

	@Override
	public List<Freelancer> getByCatLocationContain(String category, String Location) {
		return freelancerRepository.findByCategoryContainingAndLocationContaining(category, Location);
	}

}
