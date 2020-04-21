public class Experiment{
	public static void main(String[] args){
		int exp_limit = 10000;
		long startTime, endTime, totalTime = 0;
		startTime = System.nanoTime();
		Links link = new Links();
		for (int i =0; i < exp_limit; i++)
			link.push(i);
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("Total time for push using custom linked list: " + totalTime);

		startTime = System.nanoTime();
		for (int i =0; i < exp_limit; i++)
			link.pop();
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("Total time for pops using custom linked list: " + totalTime);

		startTime = System.nanoTime();
		BLinks blink = new BLinks();
		for (int i =0; i < exp_limit; i++)
			blink.push(i);
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("Total time for push using stack class:" + totalTime);

		startTime = System.nanoTime();
		for (int i =0; i < exp_limit; i++)
			blink.pop();
		endTime = System.nanoTime();
		totalTime = endTime - startTime;
		System.out.println("Total time for pops using stack class:" + totalTime);

		

	}
}