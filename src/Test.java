import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
		/*
		 * int status=dao.saveEmployee(new Employee(999,"Abhi","Engineering"));
		 * System.out.println(status);
		 */
	   // int status=dao.updateEmployee(new Employee(999,"Srini","ECE")); 
	   // System.out.println(status); 
	     
	          
	   Employee e=new Employee(); 
	    e.setEid(999); 
	    int status=dao.deleteEmployee(e); 
	    System.out.println(status);
	}

}
