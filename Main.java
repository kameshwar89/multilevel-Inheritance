package com.secondhand2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String detail;
		System.out.println("Enter account Detail:");
		Scanner s=new Scanner(System.in);
		detail =s.nextLine();
		AccountBO acc=new AccountBO();
		acc.getAccoundDetail(detail);
		

	}

}
