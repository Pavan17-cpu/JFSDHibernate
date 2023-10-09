package com.klu.JFSD_HIBERNATE;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="reg_emp")
@Table(name="reg_emp1")
//@DiscriminatorValue("child-2")
public class RegularEmployee extends Employee{
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	
	//int re_id;
	String institute;
	String dept;
	
	//public int getRe_id() {
		//return re_id;
	//}
	//public void setRe_id(int re_id) {
		//this.re_id = re_id;
	//}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
