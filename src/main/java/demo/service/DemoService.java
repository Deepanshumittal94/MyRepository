package demo.service;



import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import demo.demodto.DemoDto;
import demo.demodto.DemoDtoMail;
import demo.model.DemoModel;

@Component
public interface DemoService {
	Object create(DemoDto demoDto);
	Object update(DemoDto demoDto);
	Object delete(DemoDto demoDto);
	Object find(HttpHeaders httpHeder);
	Object updateAll(DemoDtoMail demoDtoMail);
	Object findAll(); 
	void deleteAll();
}
