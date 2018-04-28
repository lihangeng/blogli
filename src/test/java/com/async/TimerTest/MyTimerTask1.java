package com.async.TimerTest;

import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask1 extends TimerTask {

	@Override
	public void run() {
		System.out.println("爆炸!!!");
	}
	
	public static void main(String args[]) {
		Timer timer = new Timer();
		timer.schedule(new MyTimerTask1(), 2000);
	}

}
