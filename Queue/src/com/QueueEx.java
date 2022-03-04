package com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class QueueEx {
	
	Scanner scan;
	Queue<Integer> queue;
	
	int n;
	
	void insert() {
		
		scan = new Scanner(System.in);
		queue = new LinkedList<Integer>();
		
		System.out.println("Integer Queue - Insert & Delete");
		
		System.out.println("\nEnter 'n' value :");
		n = scan.nextInt();
		
		System.out.println("Enter the elements");
		
		for(int i=0; i<n; i++) {
			
			queue.add(scan.nextInt());
		}		
	}
	
	void delete() {
		
		System.out.println("\nThe Queue");
		
		while(!queue.isEmpty()) {
			
			System.out.println(queue.poll());
		}
	}
}
 
class MainClass {
	
	public static void main(String args[]) {
		
		QueueEx obj = new QueueEx();
		
		obj.insert();
		obj.delete();;
	}
}
