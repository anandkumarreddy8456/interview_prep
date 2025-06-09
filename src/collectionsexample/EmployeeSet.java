package collectionsexample;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EmployeeSet {

	public static void main(String[] args) {
        // Create a set of employees
        Set<Employee> employeeSet = new HashSet<>();

        // Add employees to the set
        employeeSet.add(new Employee(1, "Alice", "HR"));
        employeeSet.add(new Employee(2, "Bob", "Finance"));
        employeeSet.add(new Employee(3, "Charlie", "Engineering"));

        // Check if the set contains a specific employee
        Employee emp = new Employee(1, "Alice", "HR");
        System.out.println("Set contains Alice: " + employeeSet.contains(emp));
        
//        Set<String> str=new HashSet<>(Arrays.asList("Anand","Raju","kumar"));
        Set<String> str1=Set.of("Anand","Raju","Kumar");
        str1.forEach(System.out::println);

        // Print all employees in the set
        
    }

}



 class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String department;

    // Constructor
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters and Setters
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Override equals and hashCode methods
   @Override
   public boolean equals(Object o) {
	   if(this == o) return true;
	   if(o== null ||getClass() !=o.getClass() ) return false;
	   Employee e=(Employee)o;
	   return e.id ==this.getId() && e.name.equals(this.getName()) &&e.department.equals(this.department);
   }

//    @Override
    public int hashCode() {
        return Objects.hash(id, name, department);
    }
    

    // Override toString method
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "'}";
    }
    
    //sorting algo 

	@Override
	public int compareTo(Employee o) {
		
		return Integer.compare(this.getId(),o.id);
	}
}
