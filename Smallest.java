package com.cognizant.shapes;
import java.util.*;
public class Smallest {
	public static void main(String args[])
	{
	int a,b,c;
	System.out.println("Enter the 3 number:");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a<b && a<c)
	{
	System.out.println(a);
	}
	else if(b<c && b<a)
	{
	System.out.println(b);
	}
	else
	{
	System.out.println(c);
	}}}

