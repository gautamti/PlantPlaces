package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PlantPlacesController {
	@RequestMapping(value="/start", method=RequestMethod.GET)
	public String read() {
		return "start";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, headers= {"content-type=text/json"})
	public String readJSON() {
		return "start";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"royalty=blue"})
	public String readBlue() {
		return "start";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, params= {"royalty=silver"})
	public String readSilver() {
		return "start";
	}
	
	@PostMapping("/start")
	public String create() {
		return "start";
	}
	
	/**
	 * * GHandle the / endpoint
	 * @return
	 */
	@RequestMapping("/")
	public String index() {
		return "start";
	}

}
