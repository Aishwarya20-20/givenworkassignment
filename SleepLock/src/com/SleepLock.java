package com;

public class SleepLock {
	{
	    @SuppressWarnings("unused")
		Object SleepLock = new Object();
	}
	    @SuppressWarnings("null")
		public static void main(String args[]) throws InterruptedException
	    {
	        Thread.sleep(1000);
	        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
	        Object LOCK = null;
			//synchronized (LOCK) 
	        
	            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 1 second");
	        }
	    
	}


