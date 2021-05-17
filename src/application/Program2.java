package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {
	
	public static void main(String[] args) {
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findByID ===");
		Department dep = depDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> depList = depDao.findAll();
		depList.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: department insert ===");
		dep = new Department(null, "Keyboards");
		depDao.insert(dep);
		depList = depDao.findAll();
		depList.forEach(System.out::println);
		
		System.out.println("\n=== TEST 4: department update ===");
		dep = depDao.findById(4);
		dep.setName("Monitors");
		depDao.update(dep);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 5: department delete ===");
		depDao.deleteById(8);

	}
}
