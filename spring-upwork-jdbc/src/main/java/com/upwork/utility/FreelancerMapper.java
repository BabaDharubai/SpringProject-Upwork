package com.upwork.utility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.upwork.model.Freelancer;

public class FreelancerMapper implements RowMapper<Freelancer> {

	/**
	 * @param rs
	 * @param rowNum
	 * @return
	 * @throws SQLException
	 */
	@Override
	public Freelancer mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Freelancer freelancer=new Freelancer();
		freelancer.setFreelancerId(rs.getInt("freelancerId"));
		freelancer.setFreelancerName(rs.getString("freelancerName"));
		freelancer.setCategory(rs.getString("category"));
		freelancer.setSkill(rs.getString("skill"));
		freelancer.setExperience(rs.getInt("experience"));
		freelancer.setType(rs.getString("type"));
		freelancer.setLocation(rs.getString("location"));
		freelancer.setCost(rs.getDouble("cost"));
		return freelancer;
	}
}
