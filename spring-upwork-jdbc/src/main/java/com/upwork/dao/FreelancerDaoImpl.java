package com.upwork.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.upwork.model.Freelancer;
import com.upwork.utility.FreelancerMapper;
import com.upwork.utility.Queries;
@Repository
public class FreelancerDaoImpl implements IFreelancerDao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	/**
	 * @param freelancer
	 */
	@Override
	public void addFreelancer(Freelancer freelancer) {
		// TODO Auto-generated method stub
		Object[] objectArray= {freelancer.getFreelancerId(),
				freelancer.getFreelancerName(),
				freelancer.getCategory(),
				freelancer.getSkill(),
				freelancer.getExperience(),
				freelancer.getCost(),
				freelancer.getType(),
				freelancer.getLocation()
		};
		jdbcTemplate.update(Queries.QUERYADD,objectArray);
	}

	/**
	 * @param freelancerId
	 * @return
	 */
	@Override
	public int deleteFreelancer(int freelancerId) {
		// TODO Auto-generated method stub
		int result=jdbcTemplate.update(Queries.QUERYDELETE, freelancerId);
		return result;
	}

	/**
	 * @param freelancerId
	 * @param cost
	 * @return
	 */
	@Override
	public int updateFreelancer(int freelancerId, double cost) {
		// TODO Auto-generated method stub
		int result=jdbcTemplate.update(Queries.QUERYUPDATECOST, cost,freelancerId);
		return result;
	}

	/**
	 * @param freelancerId
	 * @param skill
	 * @return
	 */
	@Override
	public int updateFreelancer(int freelancerId, String skill) {
		// TODO Auto-generated method stub
		int result=jdbcTemplate.update(Queries.QUERYUPDATESKILL,skill,freelancerId);
		return result;
	}

	/**
	 * @param freelancerId
	 * @param experience
	 * @return
	 */
	@Override
	public int updateFreelancer(int freelancerId, int experience) {
		// TODO Auto-generated method stub
		int result=jdbcTemplate.update(Queries.QUERYUPDATEEXPERIENCE,experience,freelancerId);
		return result;
	}

	/**
	 * @param freelancerId
	 * @return
	 */
	@Override
	public Freelancer findById(int freelancerId) {
		// TODO Auto-generated method student
		Freelancer freelancer=jdbcTemplate.queryForObject(Queries.QUERYBYID, new FreelancerMapper(), freelancerId);
		return freelancer;
	}

	/**
	 * @param category
	 * @return
	 */
	@Override
	public List<Freelancer> findByCategoryContain(String category) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(Queries.QUERYBYCAT, new FreelancerMapper(), category);
	}

	/**
	 * @param skill
	 * @return
	 */
	@Override
	public List<Freelancer> findBySkillContain(String skill) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(Queries.QUERYBYSKILL, new FreelancerMapper(),skill);
	}

	/**
	 * @param name
	 * @return
	 */
	@Override
	public List<Freelancer> findByName(String name) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(Queries.QUERYBYNAME, new FreelancerMapper(),name);
	}

	/**
	 * @param category
	 * @param skill
	 * @return
	 */
	@Override
	public List<Freelancer> findByCatSkillContain(String category, String skill) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(Queries.QUERYBYCATSKILL, new FreelancerMapper(),category,skill);
	}

	/**
	 * @param category
	 * @param skill
	 * @param type
	 * @return
	 */
	@Override
	public List<Freelancer> findByCatSkillTypeContain(String category, String skill, String type) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(Queries.QUERYBYCATSKILLTYPE, new FreelancerMapper(),skill,type);
	}

	/**
	 * @param category
	 * @param experience
	 * @return
	 */
	@Override
	public List<Freelancer> findByCatExpContain(String category, int experience) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(Queries.QUERYBYCATEXP, new FreelancerMapper(),category,experience);
	}

	/**
	 * @param category
	 * @param skill
	 * @param cost
	 * @return
	 */
	@Override
	public List<Freelancer> findByCatSkillCostContain(String category, String skill, double cost) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(Queries.QUERYBYCATSKILLCOST, new FreelancerMapper(),category,skill,cost);
	}

	/**
	 * @param category
	 * @param skill
	 * @param experience
	 * @return
	 */
	@Override
	public List<Freelancer> findByCatSkillExpContain(String category, String skill, int experience) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(Queries.QUERYBYCATSKILLEXP, new FreelancerMapper(),category,skill,experience);
	}

	/**
	 * @param category
	 * @param location
	 * @return
	 */
	@Override
	public List<Freelancer> findByCatLocationContain(String category, String location) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(Queries.QUERYBYCATLOCATION,new FreelancerMapper(),category,location);
	}
	
}
