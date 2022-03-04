package com;


	import java.util.Scanner;
	import java.util.Stack;
	 
	public class StackEx {
		
		Scanner scan;
		Stack<String> stack;
		
		int n;
	 
		void push() {
			
			scan = new Scanner(System.in);
			stack = new Stack<String>();
			
			System.out.println("Stack Push & Pop (Delete)");
			
			System.out.println("\nEnter 'n' value :");
			n = scan.nextInt();
			
			System.out.println("Enter the data - PUSH");
	 
			for(int i=0; i<n; i++) {
				
				stack.push(scan.next());
			}
		}
		
		void pop() {
			
			System.out.println("\nThe Stack - POP");
	 
			while(!stack.empty()) {
				
				System.out.println(stack.pop());
			}
		}
	}
	 
	class MainClass {
		
		public static void main(String args[]) {
			
			StackEx obj = new StackEx();
			
			obj.push();
			obj.pop();
		}
	}

