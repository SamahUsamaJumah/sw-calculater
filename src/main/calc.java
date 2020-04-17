package main;

import java.io.IOException;
import java.util.Scanner;

public class calc {

	public static int add(int x,int y) {
		return x+y;
	}
	
	public void negtivetst(int x,int y) {
		if((x+y)<0) throw new ArithmeticException();
	}
	
	public static void main(String [] args) throws IOException{
		int a,b,c;
		Scanner newinput  = new Scanner(System.in);
		b= newinput.nextInt();
		c= newinput.nextInt();
		if(b>0 && c>0) {
			a= add(b,c);
			System.out.print(a);
			
		}
		else {
			System.out.println("c<0 or b<0");
		}
	}
}
