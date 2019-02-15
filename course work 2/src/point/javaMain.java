package cswk;

import java.util.ArrayList;

public class javaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names =  new ArrayList<String>();
		ArrayList<String> cses =  new ArrayList<String>();
		ArrayList<Double> marks =  new ArrayList<Double>();
		int n= 1;
		double SUM = 0;
		double av = 0;
		while(true) {
			System.out.print("Enter student "+n+" name:");
			String name = new java.util.Scanner(System.in).nextLine();
			int z=0;
			while(z<5) {
				System.out.print("Enter course Unit "+(z+1)+":");
				String cse = new java.util.Scanner(System.in).nextLine();
				System.out.print("Enter marks :");
				Double mark = new java.util.Scanner(System.in).nextDouble();
				SUM = SUM + mark;
				if(name.equals("exit"))
						break;
				else
					names.add(name);
					marks.add(mark);
					cses.add(cse);		
			z++;
			}
			
			System.out.println("name : " + names.get(0));
			System.out.println("cdfg : " + cses.get(0));

			System.out.println("total = "+SUM);
			av = SUM/5;
			System.out.println(" The average is : "+av);

			n++;
		}
	}
}
