package com.upwork.utility;

public class Queries {
	
	public static final String QUERYADD="insert into freelancer values(?,?,?,?,?,?,?,?)";
	
	public static final String QUERYDELETE="delete from freelancer where freelancerId=?";
	
	public static final String QUERYUPDATECOST="update freelancer set cost=? where freelancerId=?";
	
	public static final String QUERYUPDATESKILL="update freelancer set skill=? where freelancerId=?";
	
	public static final String QUERYUPDATEEXPERIENCE="update freelancer set experience=? where freelancerId=?";
	
	public static final String QUERYBYID="select * from freelancer where freelancerId=?";
	
	public static final String QUERYBYCAT="select * from freelancer where category like concat('%',?,'%')";
	
	public static final String QUERYBYSKILL="select * from freelancer where skill like concat ('%',?,'%')";
	
	public static final String QUERYBYNAME="select * from freelancer where freelancerName like concat('%',?,'%')";
	
	public static final String QUERYBYCATSKILL="select * from freelancer where category like concat('%',?,'%') and skill like concat('%',?,'%')";
	
	public static final String QUERYBYCATSKILLTYPE="select * from freelancer where category like concat('%',?,'%') and skill like concat('%',?,'%') and type concat('%',?,'%')";
	
	public static final String QUERYBYCATEXP="select * from freelancer where category like concat('%',?,'%') and experience>=?";
	
	public static final String QUERYBYCATSKILLCOST="select * from freelancer where category like concat('%',?,'%') and skill like concat('%',?,'%') and cost<=?";
	
	
	public static final String QUERYBYCATLOCATION="select * from freelancer where  category like concat('%',?,'%') and location like concat('%',?,'%')";

	public static final String QUERYALL="select * from freelancer";

	public static final String QUERYBYCATSKILLEXP="select * from freelancer where category like concat('%',?,'%') and skill like concat('%',?,'%') and experience>=?";
	
	
}
