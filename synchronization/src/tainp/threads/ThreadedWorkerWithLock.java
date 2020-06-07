package tainp.threads;

public class ThreadedWorkerWithLock extends Thread {
	private ResourcesExploiterWithLock rExp;
	private String thread_name; 
	public ThreadedWorkerWithLock(ResourcesExploiterWithLock resource, String name) {
		rExp = resource;
		thread_name = name;
	}
	public void run() {
		for(int i=0;i<1000;i++) {
			rExp.exploit();
			System.out.println(thread_name + " " + rExp.getRsc() + " ");
		}
	}
}
