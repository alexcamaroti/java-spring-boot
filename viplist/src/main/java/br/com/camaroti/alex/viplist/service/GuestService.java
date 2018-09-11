package br.com.camaroti.alex.viplist.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.camaroti.alex.viplist.model.Guest;
import br.com.camaroti.alex.viplist.repository.GuestRepository;

@Service
public class GuestService {

	@Autowired
	private GuestRepository repository;
	
	public void save(Guest newGuest) {
		repository.save(newGuest);
	}

	public Iterable<Guest> findAll() {
		return repository.findAll();
	}

	public void deleteById(Long id) {
		repository.deleteById(id);
	}

}
