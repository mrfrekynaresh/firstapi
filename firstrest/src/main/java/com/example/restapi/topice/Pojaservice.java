package com.example.restapi.topice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Pojaservice {

	List<Poja> tr = new ArrayList<Poja>(Arrays.asList(new Poja("spring", "spring boot", "spring boot des"),
			new Poja("java", "core java", "core java des"), new Poja("js", "javascript", "javascript des")));

	List<Poja> alltopice() {
		return tr;
	}

	Poja gettopice(String id) {
		return tr.stream().filter(s -> s.getId().equals(id)).findFirst().get();
	}

	void posttopice(Poja a) {
		tr.add(a);
	}
	void putmethod(Poja poja,String id) {
		for(int i=0;i<tr.size();i++) {
			Poja vr = tr.get(i);
			if(vr.getId().equals(id)) {
				tr.set(i, poja);
				return;
			}
			
		}
	}
	public void deletemathod(String id) {
		tr.removeIf(a -> a.getId().equals(id));
		
	}
}
