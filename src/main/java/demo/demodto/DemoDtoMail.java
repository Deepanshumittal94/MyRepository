package demo.demodto;

import java.util.List;

public class DemoDtoMail {
	
	List<DemoDto> maillist;

	public List<DemoDto> getMaillist() {
		return maillist;
	}

	public void setMaillist(List<DemoDto> maillist) {
		this.maillist = maillist;
	}

	public DemoDtoMail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemoDtoMail(List<DemoDto> maillist) {
		super();
		this.maillist = maillist;
	}

}
