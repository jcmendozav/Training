package desing.pattern.singleton;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

import javax.sql.PooledConnection;

import org.junit.jupiter.api.Test;

class SingletonTest {

	@Test
	void test() {
		SMPPConn c1=SMPPConn.getInstance();
		SMPPConn c2=SMPPConn.getInstance();
		assertEquals("Comparing singletons", c1, c2);
		
	}
	
	@Test
	void test2() {

		ScheduledExecutorService service =  Executors.newScheduledThreadPool(10);
		
		List<SMPPConn> conns = new ArrayList<SMPPConn>();
		
		int maxRuns=10000;
		
		List<CompletableFuture<SMPPConn>> futuresSMPP = new ArrayList<CompletableFuture<SMPPConn>>();
		
		for (int i = 0; i < maxRuns; i++) {
//			CompletableFuture<SMPPConn> futureSMPP = CompletableFuture.
//					supplyAsync(()->{return SMPPConn.getInstance();},service);
//			
//			futureSMPP.thenAccept(conns::add);
			
			CompletableFuture.supplyAsync(()->{return SMPPConn.getInstance();}).thenAccept(conns::add).join();
		}
		
		System.out.println("End threads. Conns size: "+conns.size());
		assertTrue(allElementsAreTheSame(conns));
		
	
	}
	
	boolean allElementsAreTheSame(List list) {
		boolean result=true;
		Object first = list.get(0);
		for (Object object : list) {
			if(object!=first) {
				System.out.println("Diffetent objects!, first:"+first+", current: "+object);
				return false;
			}
		}
		return result;
	}

}
