package com.bilingual.services.pojo;

import javax.ws.rs.core.Response;

public interface IEmployeeService {
  Employee get(Long id);
  Employees getAll();
  Response add(Employee employee);
  Response update(Employee employee);
  Response delete(Long id);
} 