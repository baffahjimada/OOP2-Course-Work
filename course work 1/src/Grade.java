import java.util.Scanner;

public class GradingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.println("Name :");
		name = scan.nextLine();
		
		Double CSE1,CSE2,CSE3,CSE4,CSE5, SUM,AVG;
		System.out.println("ENTER FIRST COURSE");
		CSE1= scan.nextDouble();
		System.out.println("ENTER SECOND COURSE");
		CSE2= scan.nextDouble();
		System.out.println("ENTER THIRD COURSE");
		CSE3= scan.nextDouble();
		System.out.println("ENTER FOURTH COURSE");
		CSE4= scan.nextDouble();
		System.out.println("ENTER FIFTH COURSE");
		CSE5= scan.nextDouble();
		SUM=CSE1+CSE2+CSE3+CSE4+CSE5;
		System.out.println("SUM= "+SUM);
		AVG=SUM/5;
		System.out.println("AVERAGE= "+AVG);
		
		if(AVG>=80){
			System.out.println("GRADE = A");
		}else {
			if(AVG>=70){
				System.out.println("GRADE = B");
			}else {
				if(AVG>=60){
					System.out.println("GRADE = C");
				}else {
					if(AVG>=50){
						System.out.println("GRADE = D");
					}else {
						if(AVG<=49){
							System.out.println("GRADE = F");
				
			}
		}

	}
			}
			}
		}
	}
