package java_1;

public class salary {
	class Employee{
	    String number;
	    String name;
	    float salary;
	    float time;

	    public void inctell(){
	        System.out.println("������="+"��������*"+200);
	        System.out.println("������Ϊ"+time*200);
	    }
	    public void total(){
	        System.out.println("��������=��������+������");
	        System.out.println(salary+time*200);
	        }
	}

	public class fiveDemo02{
	    public static void main(String args[]){
	        Employee emp=null;
	        emp=new Employee();
	        emp.number="001";
	        emp.name="���";
	        emp.salary=2000;
	        emp.time=5;
	        emp.inctell();
	        emp.total();

	    }
	}

}
