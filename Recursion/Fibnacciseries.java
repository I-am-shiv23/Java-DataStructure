package Recursion;
// Fibonacci Series using Recursion
import java.io.*;
class fibonacci {
	static int fib(int n)
	{
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String args[])
	{
		int n = 8;
		System.out.println(
			n + "th Fibonacci Number: " + fib(n));
	}
}
/* This code is contributed by Rajat Mishra */
