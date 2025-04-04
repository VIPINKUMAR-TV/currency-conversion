package com.vipin.microservices.currencyconversion;

public class pattern {
	public static void main(String args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==0)
				System.out.print("*");
				if(i!=0&&i!=4&&j==2&&j==3&&j==4)
					System.out.print(" ");	
			}
			System.out.println();
		}
	}

}
