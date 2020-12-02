package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import demo.demodto.DemoDto;
import demo.demodto.DemoDtoMail;
import demo.service.DemoService;

@RequestMapping("/demo")
@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@GetMapping("get")
	public Object find(@RequestHeader HttpHeaders httpHeader ) {
		return demoService.find(httpHeader);
	}

	@PostMapping("/create")
	public Object create(@RequestBody DemoDto demoDto) {
		return demoService.create(demoDto);
	}
	
	@PostMapping("update")
	public Object update(@RequestBody DemoDto demoDto)
	{
		return demoService.update(demoDto);
	}
	
	@DeleteMapping("delete")
	public Object delete(@RequestBody DemoDto demoDto)
	{
		return demoService.delete(demoDto);
	}
	
	
	@PostMapping("updateall")
	public Object updateAll(@RequestBody DemoDtoMail demoDtoMail)
	{
		return demoService.updateAll(demoDtoMail);
	}
	
	@GetMapping("findall")
	public Object findAll() {
		return demoService.findAll();
	}
	
	@DeleteMapping("deleteall")
	public void deleteAll() {
		demoService.deleteAll();
	}
}

