package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
	      System.out.println("Nhap vao mot so nguyen:");
	      Scanner sc = new Scanner(System.in);

	      n = sc.nextInt();

	      if (n >= 0){
	         System.out.println("Đây là một số nguyên dương");
	      } 
	      else {
	         System.out.println("Đây là số nguyên âm");
	         float a, b, c;
	         System.out.println("Nhập vào 3 số:");
	         Scanner sc1 = new Scanner(System.in);

	         a = sc1.nextFloat();
	         b = sc1.nextFloat();
	         c = sc1.nextFloat();

	         if(a+b>c && b+c>a && c+a>b)
	            System.out.println("Ba số đúng là 3 cạnh của 1 tam giác");
	         else
	            System.out.println("Ba số không phải là 3 cạnh của 1 tam giác");
	         
		


	}

	

	}

}
