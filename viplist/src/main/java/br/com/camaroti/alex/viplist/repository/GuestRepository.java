package br.com.camaroti.alex.viplist.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.camaroti.alex.viplist.model.Guest;

public interface GuestRepository extends CrudRepository<Guest, Long>{
	
	List<Guest> findByName(String name);

}
