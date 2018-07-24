package com.dcm.napaonline;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dcm.napaonline.model.Break;
import com.dcm.napaonline.service.BreakService;

@Controller
public class BreakController {
	@Autowired
	private BreakService service;
	
	@RequestMapping(value="/break", method=RequestMethod.GET)
	public ModelAndView welcome(){
		ModelAndView model=new ModelAndView("break");
		model.addObject("message", "welcome to Breaks");
		return model;
	}
	@RequestMapping(value="/addBreakDetails", method=RequestMethod.POST)
	public ModelAndView addBreaks(@Valid Break breaks){
		service.addBreaks(breaks);
		ModelAndView model=new ModelAndView("breakSearch");
		model.addObject("message", "welcome to Breaks");
		return model;
	}
	@RequestMapping(value = "/doSearch", method = RequestMethod.POST)
	   public ModelAndView search(@RequestParam("search")String searchText) throws Exception{
		List<Break> breaks=service.searchForBreak(searchText);
		List<Break> list=new ArrayList<Break>();
		Break bk=new Break();
		for (Break break1 : breaks) {
			bk.setPart(break1.getPart());
			bk.setDescription(break1.getDescription());
			bk.setPrice(break1.getPrice());
			list.add(bk);
			
		}
		ModelAndView model=new ModelAndView("foundBreaks");
		/*model.addObject("break",bk);*/
		model.addObject("breaksList",breaks);
		return model;
		
	}

}
