/**
 * 
 */
package com.upwork.collectors;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.upwork.model.Freelancer;
import com.upwork.service.IFreelancerService;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Controller
public class FreelancerCollector {
	
	
	private IFreelancerService freelancerService;
	
	
	/**
	 * @param freelancerService
	 */
	public FreelancerCollector(IFreelancerService freelancerService) {
		super();
		this.freelancerService = freelancerService;
	}


	@RequestMapping("add-freelancer")
	public String addFreelancer(Freelancer freelancerone) {
		freelancerService.addFreelancer(freelancerone);
		return "admin";
	}
	@RequestMapping("/")
	public String getAll(Model model) {
		List<Freelancer> freelancers=freelancerService.getAll();
		model.addAttribute("freelancers", freelancers);
		return "home";
	}
	
	
	@RequestMapping("search")
	public String getByChoice(
			@RequestParam("choice")String category,
			Model model) {
		List<Freelancer> freelancers=freelancerService.getBySkillContain(category);
		model.addAttribute("freelancers", freelancers);
		return "home";
	}
	
	@RequestMapping("get-by-id")
	public String getById(@RequestParam("id")Integer freelancerId,
			Model model) {
		Freelancer freelancer=freelancerService.getById(freelancerId);
		model.addAttribute("freelancer",freelancer);
		return "updateFreelancerForm";
	}
	
	@RequestMapping("delete-freelancer")
	public String deleteFreelancer(@RequestParam("id")Integer freelancerId,
			Model model) {
		freelancerService.deleteFreelancer(freelancerId);
		model.addAttribute("message","Deleted freelancer");
		return "admin";
	}
	
	@RequestMapping("update-cost")
	public String updateFreelancer(
			@RequestParam("id") Integer freelancerId,
			@RequestParam("cost")double cost,
			Model model) {
		freelancerService.updateFreelancer(freelancerId, cost);
		model.addAttribute("message","Freelancer fees is updated");
		return "admin";
	}
	
}
