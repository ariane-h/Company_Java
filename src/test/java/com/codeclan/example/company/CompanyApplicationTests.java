package com.codeclan.example.company;

import com.codeclan.example.company.models.Department;
import com.codeclan.example.company.models.Employee;
import com.codeclan.example.company.models.Project;
import com.codeclan.example.company.respositories.DepartmentRepository;
import com.codeclan.example.company.respositories.EmployeeRepository;
import com.codeclan.example.company.respositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompanyApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateEmployeeAndDepartmentAndProject(){
		Project project1 = new Project("VIP Project", 100);
		projectRepository.save(project1);

		Department department1 = new Department("Sales");
		departmentRepository.save(department1);

		Employee employee1 = new Employee("Donald","Trump",1, department1);
		employeeRepository.save(employee1);

		employee1.addProject(project1);
		employeeRepository.save(employee1);

		project1.addEmployee(employee1);
		projectRepository.save(project1);

	}

}
