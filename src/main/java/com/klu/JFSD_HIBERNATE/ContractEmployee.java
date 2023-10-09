package com.klu.JFSD_HIBERNATE;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
//@Table(name="cont_emp")
@Table(name="cont_emp1")
//@DiscriminatorValue("child-1")
public class ContractEmployee extends Employee{
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//int ce_id;
//	public int getCe_id() {
	//	return ce_id;
	//}
	//public void setCe_id(int ce_id) {
		//this.ce_id = ce_id;
	//}
	int month;
	String dept;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
		
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
