package demo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Check {

	@Column
	private Integer checkField;
	
	@Column
	private String checkList;
	
	public Integer isCheckField() {
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
	
		
}
