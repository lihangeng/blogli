package com.async.Ssynchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TraditionalThreadSynchronized {

	public static void main(String[] args) {
		final Outputter outputter = new Outputter();
		new Thread() {
			@Override
			public void run() {
				outputter.output("zhansan");
			}
		}.start();
		new Thread() {
			@Override
			public void run() {
				outputter.output("lisi");
			}
		}.start();
	}
}

class Outputter {
	private Lock lock = new ReentrantLock();

	public void output(String name) {
		lock.lock();
		try {

			for (int i = 0; i < name.length(); i++) {
				System.out.print(name.charAt(i));
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} finally {
			lock.unlock();
		}
	}
}
