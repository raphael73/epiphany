import java.util.Scanner;

public class projectDriver {
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		String projectName =scan.next();
		float budget = scan.nextFloat();
		
		String emp1Id = scan.nextLine();
		String emp1Name = scan.next();
		String emp1Dep = scan.nextLine();
		float emp1Bas = scan.nextFloat();
		Employee emp1 =new Employee(emp1Id,emp1Name,emp1Dep,emp1Bas);
		
		String emp2Id = scan.nextLine();
		String emp2Name = scan.next();
		String emp2Dep = scan.nextLine();
		float emp2Bas = scan.nextFloat();
		Employee emp2 =new Employee(emp2Id,emp2Name,emp2Dep,emp2Bas);
		
		project project1 =new project (projectName,budget,emp1,emp2);
		System.out.println(project1.toString());
		
		project1.updateBudget();
		System.out.println("提高预算后：");
		System.out.println("新预算为："+project1.getBudget());
		System.out.println(project1.toString());
	}
}
