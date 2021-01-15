package demo.serviceimpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import demo.demodto.DemoDto;
import demo.demodto.DemoDtoMail;
import demo.model.DemoModel;
import demo.repo.DemoRepo;
import demo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	DemoRepo demoRepo;
	
	@Override
	public Object create(DemoDto demoDto) {
		DemoModel demo = new DemoModel(demoDto);
		demoRepo.save(demo);
		return demo;
	}

	@Override
	public Object update(DemoDto demoDto) {
		Optional<DemoModel> demoOptional =  demoRepo.findByEmailId(demoDto.getEmailId());
		if(demoOptional.isPresent()) {
			DemoModel demo = demoOptional.get();
			demo.setName(demoDto.getName());
			demo.setMobile(demoDto.getMobile());
			demo.setEmailId(demoDto.getEmailId());
			demoRepo.save(demo);
			return demoOptional.get();
		}
		else
			return "Object Not Found";
	}

	@Override
	public Object delete(DemoDto demoDto) {
		/*
		Optional<DemoModel> demoOptional =  demoRepo.findById(id);
		if(demoOptional.isPresent())
		demoRepo.delete(demoOptional.get());
			return demoOptional.get();
			*/
		Optional<DemoModel> demoOptional =  demoRepo.findByEmailId(demoDto.getEmailId());
		demoRepo.delete(demoOptional.get());
		return "success";
	}
/*
	@Override
	public Object find(HttpHeaders httpHeader) {
		Optional<DemoModel> demoOptional =  demoRepo.findByEmailId(httpHeader.getFirst("emailId"));
		if(demoOptional.isPresent())
			return demoOptional.get();
		else
			return "Not Found";
		
	}
*/
	
	@Override
	public Object find(HttpHeaders httpHeader) {
		List<String> abc = new ArrayList<>();
		
		abc.add("abc");
		abc.add("xyz");
		
		Integer i = 1;
		List<DemoModel> demoOptional =  demoRepo.findByCheckListInAndCheckField(abc, i);
		
		return demoOptional;
		//if(demoOptional.isPresent())
			//return demoOptional.get();
		//else
			//return "Not Found";
			
	}

	
	@Override
	public Object updateAll(DemoDtoMail demoDtoMail) {
		// TODO Auto-generated method stub
		List<String> mails = new LinkedList<>();
		demoDtoMail.getMaillist().forEach(x -> {
			mails.add(x.getEmailId());
		});
			List<DemoModel> demoOptional =  demoRepo.findByEmailIdIn(mails);
			List<DemoModel> demoModelList = new LinkedList<>();
			demoDtoMail.getMaillist().forEach(x -> {
				System.out.println(x.toString());
			Optional<DemoModel> demoModel =  demoOptional.stream().findFirst().filter(p -> p.getEmailId().equals(x.getEmailId()));
			System.out.println(demoModel.toString());
			
			//
			if(demoModel.isPresent())
			{
				DemoModel demoModelTest = demoModel.get();
				demoModelTest.setMobile(x.getMobile());
				demoModelTest.setName(x.getName());
				demoModelList.add(demoModelTest);
			}
			
			});
			
			demoRepo.saveAll(demoModelList);
			/*
			if(demoOptional.isPresent())
			{
				DemoModel demo = demoOptional.get();
				System.out.println(x.getEmailId());
				demo.setName(x.getName());
				demo.setMobile(x.getMobile());
				demoRepo.save(demo);
			}
		*/
		return "Success";
	}

	@Override
	public Object findAll() {
		return demoRepo.findAll();
	
	}

	@Override
	public void deleteAll() {
	 demoRepo.deleteAll();
		
	}
	
	

}
