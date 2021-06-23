package com.cg.java.demo.conc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CoolableDemo implements Callable<Integer> {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CoolableDemo obj = new CoolableDemo();

		ExecutorService service = Executors.newSingleThreadExecutor();

		Future<Integer> future = service.submit(obj);
		Integer num = future.get();
		System.out.println(num);
		service.shutdown();

	}

	@Override
	public Integer call() throws Exception {
		int num = 0;
		for (int i = 0; i <= 10; i++) {
			num += i;
		}
		return num;
	}

}