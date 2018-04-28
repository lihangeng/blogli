package com.async;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest{
	
	public static void main(String args[]) {
		Callable<Object> myCallable = new SomeCallable();
		FutureTask<Object> task = new FutureTask<Object>(myCallable);
		Thread myThread = new Thread(task);
		myThread.start();
	}

}

 class SomeCallable implements Callable{

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	 
 }
