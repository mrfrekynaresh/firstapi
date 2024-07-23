package com.example.restapi.topice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Firsttopice {

	@Autowired
	Pojaservice pojaservice;
	Poja poja;

	@RequestMapping("/api/topice")
	List<Poja> da() {
		return pojaservice.alltopice();
	}

	@RequestMapping("/api/topice/{id}")
	Poja gettopice(@PathVariable String id) {
		return pojaservice.gettopice(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = ("/api/topice"))
	void posttopice(@RequestBody Poja a) {
		pojaservice.posttopice(a);
	}

	@PostMapping("/api/useradd")
	void useradd(@RequestBody Poja poja) {
		System.err.println(poja.getName());
	}

	@RequestMapping(method = RequestMethod.PUT, value = ("/api/topice/{id}"))
	public void putMethodName(@PathVariable String id, @RequestBody Poja poja) {
		pojaservice.putmethod(poja, id);
	}
	@RequestMapping(method= RequestMethod.DELETE, value=("/api/topice/{id}"))
	void deletmethod(@PathVariable String id) {
		pojaservice.deletemathod(id);
	}
}
