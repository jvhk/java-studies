package models.dao;

import java.util.List;

import models.entities.Department;

public interface DepartmentDAO {
	void insert(Department obj);
	void update(Department obj);
	void delete(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
