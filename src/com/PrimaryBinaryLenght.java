package com;

import java.util.Scanner;

public class PrimaryBinaryLenght {

	public static void main(String[] args) {
		int word=new Scanner(System.in).nextInt();
		long max=(long) Math.pow(2, word)-1;
		int a=0,b=0;
		for(int i=0;i<max;i++){
			for(double j=i;j>1;) {
				j/=2;
				if(j>=1)
					a++;
			}
			for(double j=i;j>1;) {
				int o=0;
				for(int k=2,l=2;l>k;l++) { 
					o=k;
					if(k%l==0) {
						continue;
					}
					o=Integer.MAX_VALUE;
				}
				while(j%o==0) {
					j/=o;
					b++;
				}
			}
		}
		System.out.println(a+" "+b);

	}

}
