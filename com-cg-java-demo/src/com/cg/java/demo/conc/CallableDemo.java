package com.cg.java.demo.conc;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.cg.demo.method.Employee;

//public class CallableDemo implements Callable<Integer> {
public class CallableDemo implements Callable<Employee> {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CallableDemo obj = new CallableDemo();

		ExecutorService service = Executors.newSingleThreadExecutor();

		Future<Employee> future = service.submit(obj); // A Future represents the result of an asynchronous computation.

		Employee num = future.get();

		System.out.println(num);
		service.shutdown();
	}

	@Override
	//public Integer call() throws Exception {
	public Employee call() throws Exception {
		//int num = 0;
		//for (int i = 0; i <= 10; i++) {
		//	num += i;
		//}
		Employee em = new Employee();
		em.toString();
		return null;
	}
}