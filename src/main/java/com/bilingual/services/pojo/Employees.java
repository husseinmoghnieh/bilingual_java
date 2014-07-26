package com.bilingual.services.pojo;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Collection;

@XmlType(
        name = "EmployeesType",
        namespace = "com.papers.backend.service.pojo")
@XmlRootElement(
        name = "Employees",
        namespace = "com.papers.backend.service.pojo")
public class Employees {
  private Collection<Employee> employees;
  public Employees() { 
  } 
  public Employees(Collection<Employee> employees) { 
    setEmployees(employees); 
  } 
  @XmlElement(name = "employee",required = true)
  @XmlElementWrapper(name = "employees")
  public Collection<Employee> getEmployees() { 
    return employees; 
  } 
  public void setEmployees(Collection<Employee> employees) { 
    this.employees = employees; 
  } 
} 