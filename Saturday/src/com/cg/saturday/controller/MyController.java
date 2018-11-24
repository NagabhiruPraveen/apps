package com.cg.saturday.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.saturday.dto.Doctor;
import com.cg.saturday.service.IDoctorService;



@Controller
public class MyController {
	int id=0;
	@Autowired
	IDoctorService doctorservice;

	@RequestMapping(value = "all", method = RequestMethod.GET)
	public String getHome() {
		return "home";
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String addDoctor(@ModelAttribute("my") Doctor doc,
			Map<String, Object> model) {
		List<String> myDeg = new ArrayList<>();
		myDeg.add("surgeon");
		myDeg.add("cardiologist");
		myDeg.add("eye specialist");
		model.put("deg", myDeg);
		return "adddoctor";
	}

	@RequestMapping(value = "insertdata", method = RequestMethod.POST)
	public ModelAndView insertDoctor(@Valid @ModelAttribute("my") Doctor doc,
			BindingResult result, Map<String, Object> model) {
		System.out.println("Name is " + doc.getdName());
		int id = 0;
		if (result.hasErrors()) {
			List<String> myDeg = new ArrayList<>();
			myDeg.add("surgeon");
			myDeg.add("cardiologist");
			myDeg.add("eye specialist");
			model.put("deg", myDeg);
			return new ModelAndView("adddoctor");
		} else {
			id = doctorservice.addDoctorData(doc);
			return new ModelAndView("success");
		}

	}

	@RequestMapping(value = "show", method = RequestMethod.GET)
	public ModelAndView showAllDoctors() {
		List<Doctor> myAllData = doctorservice.showAllDoctors();
		return new ModelAndView("showall", "temp", myAllData);
	}
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public String deleteEmployee(){
		
		return "deleteemployee";
		
	}
	@RequestMapping(value="dodelete",method=RequestMethod.GET)
	public String employeeDelete(@RequestParam("did") int id){
		//System.out.println("Id is ..."+id);
		doctorservice.deleteDoctor(id);
		return "deletesuccess";
		
	}
	@RequestMapping(value="update",method=RequestMethod.GET)
	public String employeeUpdate(){
		
		return "update";
		
	}
	
	@RequestMapping(value="doUpdate",method=RequestMethod.GET)
	public String employeeUpdate(@RequestParam("did") int id, @ModelAttribute("data") Doctor doc,Map<String,Object> model){
		List<Doctor> list=doctorservice.showAllDoctors();
		Doctor employeeBean=null;
		//String str;
		this.id=id;
		for (Doctor doctor : list) {
			if(doctor.getdId()==id)
			{
				employeeBean=doctor;
				break;
			}
		}
		if(employeeBean==null)
			return "update";
		else
		{
			List<String> myDeg=new ArrayList<>();
			myDeg.add("SoftWare Engg");
			myDeg.add("Sr Consoltant");
			myDeg.add("Manager");
			model.put("deg",myDeg);
			return "updateemployee";
		}
	}
	 
	@RequestMapping(value="doAddUpdate")
	public ModelAndView employeeDoUpdate(@Valid @ModelAttribute("data") 
	Doctor doc,BindingResult result,Map<String,Object> model){
		if(result.hasErrors()){
			List<String> myDeg=new ArrayList<>();
		myDeg.add("SoftWare Engg");
		myDeg.add("Sr Consoltant");
		myDeg.add("Manager");
		model.put("deg",myDeg);
			return new ModelAndView("updateemployee");
			}
		else
		{
			doc.setdId(id);
			doctorservice.updateDoctor(doc);
			return new ModelAndView("updatesuccess");
		}
	}
	@RequestMapping(value="search",method=RequestMethod.GET)
	public String employeeSearch(){
		
		return "search";
		
	}
	
	@RequestMapping(value="doSearch",method=RequestMethod.GET)
	public ModelAndView employeeDoSearch(@RequestParam("did") int id){
		Doctor doc=null;
		doc=doctorservice.searchDoctor(id);
		if(doc==null)
			return new ModelAndView("search");
		else
			return new ModelAndView("searchDone","data",doc);
					
	}
}
