package com.bilingual.services;


import com.bilingual.services.pojo.Employee;
import com.bilingual.services.pojo.Employees;
import com.bilingual.services.pojo.IEmployeeService;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

@Path("/employeeservice/")
@Produces("application/json")
public class EmployeeService implements IEmployeeService {

  private static final Map<Long, Employee> EMPLOYEE_MAP = new HashMap<Long, Employee>();
  private static long index = 3L; 
  static { 
    EMPLOYEE_MAP.put(1L, new Employee(1L, "First Name 1", "Last Name 1")); 
    EMPLOYEE_MAP.put(2L, new Employee(2L, "First Name 2", "Last Name 2")); 
  } 
  @GET
  @Path("/get/{id}") 
  public Employee get(@PathParam("id") Long id) {
    return EMPLOYEE_MAP.get(id); 
  } 
  @GET 
  @Path("/getall/") 
  public Employees getAll() {
    return new Employees(EMPLOYEE_MAP.values());
  } 
  @POST
  @Path("/add/") 
  @Consumes("application/json") 
  public Response add(Employee employee) {
    System.out.println("Adding :" + employee); 
    employee.setId(index++); 
    update(employee); 
    return Response.status(Response.Status.OK).build(); 
  } 
  @PUT 
  @Path("/update/") 
  @Consumes("application/json") 
  public Response update(Employee employee) { 
    System.out.println("Updating :" + employee); 
    EMPLOYEE_MAP.put(employee.getId(), employee); 
    return Response.status(Response.Status.OK).build(); 
  } 
  @DELETE 
  @Path("/delete/{id}/") 
  public Response delete(@PathParam("id") Long id) { 
    Employee e = EMPLOYEE_MAP.remove(id); 
    System.out.println("Deleted :" + e); 
    return Response.status(Response.Status.OK).build(); 
  } 
} 