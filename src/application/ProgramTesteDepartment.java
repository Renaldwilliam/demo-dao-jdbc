package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;



public class ProgramTesteDepartment {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	
	DepartmentDao departmentDao  = DaoFactory.createDepartmentDao();
	
	System.out.println("\n=== TEST 1: department insert ====");
	Department dep = new Department(null, "Figures");
	
	departmentDao.insert(dep);
	
	System.out.println("Inserted! New id = " + dep.getId());
	
	System.out.println("\n=== TEST 2: department findById ====");
	Department department = departmentDao.findById(1);
	
	System.out.println(department);	
	//System.out.println("Inserted! New id = " + dep.getId());
	
	System.out.println("\n=== TEST 3: department update ====");
	department = departmentDao.findById(1);
	department.setName("Food");
	departmentDao.update(department);
	System.out.println("Update completed");
	
	System.out.println("\n=== TEST 4: department delete ====");
	
	/*System.out.print("Enter id for delete test:");
	int id = sc.nextInt();
	departmentDao.deleteById(id);
	System.out.println("Delete completed");
	*/
	sc.close();

	System.out.println("\n=== TEST 5: seller findAll ====");
	List<Department> list = departmentDao.findAll();
	for (Department d : list) {
		System.out.println(d);
	}
	
	
	}
}
