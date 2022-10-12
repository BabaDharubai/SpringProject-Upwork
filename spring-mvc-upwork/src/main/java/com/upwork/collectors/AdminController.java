/**
 * 
 */
package com.upwork.collectors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Controller
public class AdminController {

	@RequestMapping("admin")
	public String admin() {
		return "admin";

	}
	
	@RequestMapping("add-freelancer-form")
	public String addDoctor() {
		return "addFreelancerForm";
	}
	
	@RequestMapping("update-freelancer-form")
	public String getById() {
		return "editFreelancerForm";
	}
	
	@RequestMapping("delete-freelancer-form")
	public String deleteFreelancer() {
		return "editFreelancerForm";
	}
}
