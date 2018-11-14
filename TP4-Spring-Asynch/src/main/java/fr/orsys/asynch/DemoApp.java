package fr.orsys.asynch;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class DemoApp {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AsynchComponent asynch = (AsynchComponent) context.getBean("asynchComponent");
		System.out.println("start " + Thread.currentThread().getName());
		asynch.asynchMethod();
		System.out.println("end " + Thread.currentThread().getName());
		ScheduleComponent schedule = (ScheduleComponent) context.getBean("scheduleComponent");
		Future<String> future = schedule.scheduledMethod();
		while(true) {
			if(future.isDone()) {
				System.out.println(future.get());
				break;
			}
			System.out.println("not finish");
			Thread.sleep(1000);
		}
		
	}

}
