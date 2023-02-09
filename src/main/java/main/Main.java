/**
 * 
 */
package main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import bean.Employee;

/**
 * @author: Boqiang Cui
 * @date: Feb 9, 2023
 */
@Configuration
@ComponentScan("bean")
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext cac = new AnnotationConfigApplicationContext(Main.class);
		Employee employee = cac.getBean(Employee.class);
		
		System.out.println("Before put value to employee: " + employee.toString());
		
		employee.setEmpId(1001);
		employee.setEmpName("I'm an employee");
		employee.setEmpSal(12345);
		
		System.out.println("After put value to employee: " + employee.toString());
	}

}
