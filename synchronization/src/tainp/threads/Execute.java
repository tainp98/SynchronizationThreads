package tainp.threads;

public class Execute {

	public static void main(String[] args) throws InterruptedException {
		//ResourcesExploiter resource = new ResourcesExploiter(0);
		//ThreadedWorkerWithoutSync worker1 = new ThreadedWorkerWithoutSync(resource,"worker1");
		//ThreadedWorkerWithoutSync worker2 = new ThreadedWorkerWithoutSync(resource, "worker2");
		//ThreadedWorkerWithoutSync worker3 = new ThreadedWorkerWithoutSync(resource, "worker3");
		ResourcesExploiterWithLock resource = new ResourcesExploiterWithLock(0);
		ThreadedWorkerWithLock worker1 = new ThreadedWorkerWithLock(resource,"worker1");
		ThreadedWorkerWithLock worker2 = new ThreadedWorkerWithLock(resource, "worker2");
		ThreadedWorkerWithLock worker3 = new ThreadedWorkerWithLock(resource, "worker3");
		worker1.start();
		worker2.start();
		worker3.start();
		worker1.join();
		worker2.join();
		worker3.join();
		System.out.println(resource.getRsc());
		

	}

}
