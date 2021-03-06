package demo.demodto;


import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true)
public class DemoDto {

	
	public DemoDto(String name, Long mobile, String emailId, Integer checkField, String checkList) {
		super();
		this.checkField = checkField;
		this.checkList = checkList;
		this.name = name;
		this.mobile = mobile;
		this.emailId = emailId;
	}

	public DemoDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCheckField() {
		return checkField;
	}

	public void setCheckField(Integer checkField) {
		this.checkField = checkField;
	}

	public String getCheckList() {
		return checkList;
	}

	public void setCheckList(String checkList) {
		this.checkList = checkList;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "DemoDto [name=" + name + ", mobile=" + mobile + ", emailId=" + emailId + "]";
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

	
	private Integer checkField;

	private String checkList;
	
	private String name;
	
	private Long mobile;
	
	private String emailId;

}
