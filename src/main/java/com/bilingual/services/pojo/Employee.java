package com.bilingual.services.pojo;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlType(
        name = "EmployeeType",
        namespace = "com.papers.backend.service.pojo",
        propOrder = {"id", "firstName", "lastName"})
@XmlRootElement(
        name = "Employee",
        namespace = "com.papers.backend.service.pojo")
public class Employee implements Serializable {
  private Long id; 
  private String firstName; 
  private String lastName; 
  public Employee() { 
  } 
  public Employee(Long id, String firstName, String lastName) { 
    this.id = id; 
    this.firstName = firstName; 
    this.lastName = lastName; 
  } 
  public Long getId() { 
    return id; 
  } 
  public void setId(Long id) { 
    this.id = id; 
  } 
  public String getFirstName() { 
    return firstName; 
  } 
  public void setFirstName(String firstName) { 
    this.firstName = firstName; 
  } 
  public String getLastName() { 
    return lastName; 
  } 
  public void setLastName(String lastName) { 
    this.lastName = lastName; 
  } 
  public boolean equals(Object o) { 
    if (this == o) return true; 
    if (!(o instanceof Employee)) return false; 
    Employee employee = (Employee) o; 
    return !(firstName != null ? !firstName.equals(employee.firstName) : employee.firstName != null) && 
        !(id != null ? !id.equals(employee.id) : employee.id != null) && 
        !(lastName != null ? !lastName.equals(employee.lastName) : employee.lastName != null); 
  } 
  public int hashCode() { 
    int result = id != null ? id.hashCode() : 0; 
    result = 31 * result + (firstName != null ? firstName.hashCode() : 0); 
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0); 
    return result; 
  } 
  @Override 
  public String toString() { 
    return "Employee{" + 
        "id=" + id + 
        ", firstName='" + firstName + '\'' + 
        ", lastName='" + lastName + '\'' + 
        '}'; 
  } 
} 