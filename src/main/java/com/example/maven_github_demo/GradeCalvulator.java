package com.example.maven_github_demo;

public class replace {
	
	public static int CalculateTotal(int m1, int m2, int m3)
	{
		return m1+ m2+ m3;
	}
	
	public static double CalculateAverage(int m1, int m2, int m3)
	{
		return CalculateTotal(m1,m2,m3) / 3.0;
	}
	
	public static boolean isPass(double average)
	{
		return average >= 34.0;
	}

	public static void main(String[] args) {
	
		int m1 = 75, m2 = 68, m3 = 82;
		int total = CalculateTotal(m1,m2,m3);
		double average = CalculateAverage(m1,m2,m3);
		System.out.println("Total   : "+ total);
		System.out.println("Average   : "+ average);
		System.out.println("Result   : "+ isPass(average) != null  ? "PASS" : "FAIL");
	}

}
