package Assignment4;

public class Employee1 {
	
	
	   private String name;
	   private int age;
	   private String designation;
	   Float salary;

	   
	   public String getName()
	   {
	      return name;
	   }
	   public int getAge()
	   {
	      return age;
	   }
	   public String getDesignation()
	   {
	       return designation;
	   }
	   public Float getSalary()
	   {
		   return salary;
	   }
	   
	   public void setName(String name)
	   {
	      this.name = name;
	   }
	   public void setAge( int age)
	   {
	      this.age = age;
	   }
	   public void setDesignation(String designation)
	   {
	       this.designation = designation;
	   }
	   public void setSalary(Float salary)
	   {
		   this.salary = salary;
	   }
	   public void increaseSalary (float salary) 
	   {
		   this.salary+=salary;}
	   

}


