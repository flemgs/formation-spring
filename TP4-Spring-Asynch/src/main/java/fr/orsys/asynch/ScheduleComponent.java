package fr.orsys.asynch;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleComponent {

	@Scheduled(fixedDelay=2000, initialDelay=1000) 
	public Future<String> scheduledMethod() {
		System.out.println("execute scheduled method " + Thread.currentThread().getName());
		Future<String> future = new Future<String>() {

			public boolean cancel(boolean mayInterruptIfRunning) {
				// TODO Auto-generated method stub
				return false;
			}

			public String get() throws InterruptedException, ExecutionException {
				// TODO Auto-generated method stub
				return "coucou";
			}

			public String get(long timeout, TimeUnit unit)
					throws InterruptedException, ExecutionException, TimeoutException {
				// TODO Auto-generated method stub
				return null;
			}

			public boolean isCancelled() {
				// TODO Auto-generated method stub
				return false;
			}

			public boolean isDone() {
				// TODO Auto-generated method stub
				return true;
			}
			
		}; 
		return future;
	}
}
