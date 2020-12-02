package demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import demo.demodto.DemoDto;

@Entity
@Table(name = "MyTable")
public class DemoModel {
	
	
	public DemoModel(Integer id, String name, Long mobile, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.emailId = emailId;
	}
	
	
	
	

	public DemoModel() {
		super();
		// TODO Auto-generated constructor stub
	}





	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private Long mobile;
	@Override
	public String toString() {
		return "DemoModel [id=" + id + ", name=" + name + ", mobile=" + mobile + ", emailId=" + emailId + "]";
	}





	@Column(unique=true)
	private String emailId;
	
	public DemoModel(DemoDto demoDto) {
		this.name = demoDto.getName();
		this.mobile = demoDto.getMobile();
		this.emailId = demoDto.getEmailId();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
}

