/**
 * 
 */
package com.upwork.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.upwork.model.Freelancer;

/**
 * @author BabaFakruddinDharubai
 *
 */
@Repository
public interface IFreelancerRepository extends JpaRepository<Freelancer, Integer> {
	
	List<Freelancer> findByCategoryContaining(String category);
	
	List<Freelancer> readBySkillContaining(String skill);
	
	List<Freelancer> getByFreelancerNameContaining(String name);
	
	List<Freelancer> findByCategoryContainingAndSkillContaining(String category,String skill);
	
	List<Freelancer> findByCategoryContainingAndSkillContainingAndTypeContaining(String category,String skill,String type);
	
	List<Freelancer> findByCategoryContainingAndExperienceGreaterThanEqual(String category,int experience);
	
	List<Freelancer> findByCategoryContainingAndSkillContainingAndCostLessThanEqual(String category,String skill,double cost);
	
	List<Freelancer> findByCategoryContainingAndSkillContainingAndExperienceGreaterThanEqual(String category,String skill,int experience);
	
	List<Freelancer> findByCategoryContainingAndLocationContaining(String category,String location);

}
