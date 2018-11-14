package fr.orsys.asynch;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsynchComponent {
	@Async
	public void asynchMethod() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Execute method asynchronously" + Thread.currentThread().getName());
	}
}
