package com.klu.JFSD_HIBERNATE;

import javax.persistence.*;

@Entity
//@Table(name= "emp_table")
@Table(name= "emp_table1")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)                 //to connect table database wise
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name="discriminator",discriminatorType =DiscriminatorType.STRING) //to tell which value is inserted from which class 
//@DiscriminatorValue("parent")

public class Employee {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
 
  int id;
  String name;
  @Column(name = "emp_sal")
  double salary;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public double getSalary() {
    return salary;
  }
  public void setSalary(double salary) {
    this.salary = salary;
  }
  

}
