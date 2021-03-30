package java_1;

public class salary {
	class Employee{
	    String number;
	    String name;
	    float salary;
	    float time;

	    public void inctell(){
	        System.out.println("增长额="+"工作年限*"+200);
	        System.out.println("增长额为"+time*200);
	    }
	    public void total(){
	        System.out.println("工资总数=基本工资+增长额");
	        System.out.println(salary+time*200);
	        }
	}

	public class fiveDemo02{
	    public static void main(String args[]){
	        Employee emp=null;
	        emp=new Employee();
	        emp.number="001";
	        emp.name="李军";
	        emp.salary=2000;
	        emp.time=5;
	        emp.inctell();
	        emp.total();

	    }
	}

}
