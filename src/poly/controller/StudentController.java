package poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student-mgr")
public class StudentController {	
	@RequestMapping()
	public String index(ModelMap model)
	{
		model.addAttribute("message","ban goi index");		
		return "student-mgr";
	}
	@RequestMapping(params = "btnInsert")
	public String insert(ModelMap model,
			@RequestParam("name") String name,
			@RequestParam("mark") Double mark,
			@RequestParam("major") String major)
	{
		model.addAttribute("message","ban goi Insert()");
		model.addAttribute("name",name);
		model.addAttribute("mark", mark);
		model.addAttribute("major",major);
		return "success";
	}
	@RequestMapping(params = "btnDelete")
	public String delete(ModelMap model) {
		model.addAttribute("message","ban goi delete()");
		return "student-mgr";
	}
	@RequestMapping(params = "btnUpdate")
	public String update(ModelMap model , Student student) {
		model.addAttribute("student",student);
		model.addAttribute("message","ban goi Update()");
		return "success2";
	}
	@RequestMapping(params = "btnReset")
	public String Reset(ModelMap model) {
		model.addAttribute("message","ban goi edit()");
		return "student-mgr";
	}
	
	@RequestMapping(params = "lnkedit")
	public String reset(ModelMap model) {
		model.addAttribute("message","ban goi edit()");
		return "student-mgr";
	}
}
