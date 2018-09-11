package br.com.camaroti.alex.viplist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.camaroti.alex.emailSender.emailSender.service.EmailSenderService;
import br.com.camaroti.alex.viplist.model.Guest;
import br.com.camaroti.alex.viplist.service.GuestService;

@Controller
public class GuestController {

	@Autowired
	private GuestService service;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/viplist")
	public String viplist(Model model) {
		
		findAll(model);
		return "viplist";
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@RequestParam("name")String name, @RequestParam("email")String email, 
			@RequestParam("phone")String phone, Model model) {
		
		Guest newGuest = new Guest(name, email, phone);
		service.save(newGuest);
		new EmailSenderService().emailSender(name, email);
		
		
		
		findAll(model);		
		return "viplist";
	}

	private void findAll(Model model) {
		Iterable<Guest> guests = service.findAll();
		model.addAttribute("guests", guests);
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id")Long id, Model model) {
		
		service.deleteById(id);
		findAll(model);
		return "redirect:/viplist";
	}
	
}
