package com.async;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

	private final Lock queueLock = new ReentrantLock();

	private void doWork() {
		queueLock.lock();
		try {
			String name = Thread.currentThread().getName();
			Long duration = (long) (Math.random() * 10000);
			System.out.println(name + "sleep" + duration / 1000 + "seconds");
			Thread.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			queueLock.unlock();
		}
	}

	public static class MyJob implements Runnable {
		private ReentrantLockTest test = null;

		public MyJob(ReentrantLockTest test) {
			this.test = test;
		}

		@Override
		public void run() {
			test.doWork();
		}

	}

	public static void main(String[] args) {
		ReentrantLockTest test = new ReentrantLockTest();
		MyJob job = new MyJob(test);
		for(int i=0;i<10;i++) {
			Thread thr = new Thread(job);
			thr.setName("job"+i);
			thr.start();
		}
	}

}
