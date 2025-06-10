package linkedinProbleSolving;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Q20SortByEmployeeSalary {

	public static void main(String[] args) {
		 Employee e1 = new Employee(1, "Anand", 50000);
	        Employee e2 = new Employee(2, "Kumar", 60000);
	        Employee e3 = new Employee(3, "Reddy", 75000);
	        Employee e4 = new Employee(4, "Priya", 55000);
	        Employee e5 = new Employee(5, "Rahul", 80000);
	        Employee e6 = new Employee(6, "Sneha", 65000);
	        Employee e7 = new Employee(7, "Vikram", 70000);
	        Employee e8 = new Employee(8, "Neha", 72000);
	        Employee e9 = new Employee(9, "Suresh", 58000);
	        Employee e10 = new Employee(10, "Meera", 90000);
	        Employee[] arrEmp = {e1, e2, e3, e4, e5, e6, e7, e8, e9, e10};
	        List<Employee> listEmp=Arrays.asList(arrEmp);
	        List<Employee> required=listEmp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(2).toList();
	        System.out.println(required);

	}

}
class Employee{
	private int id;
	private String name;
	private long salary;
	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
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
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && salary == other.salary;
	}
	
}
