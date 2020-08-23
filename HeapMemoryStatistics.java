
public class HeapMemoryStatistics {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		double mb = 1024 * 1024;

		System.out.println("Max Memory : " + r.maxMemory() / mb);
		System.out.println("Total Memory : " + r.totalMemory() / mb);
		System.out.println("Free Memory : " + r.freeMemory() / mb);
		System.out.println("Consumed Memory : " + (r.totalMemory() / mb - r.freeMemory() / mb));
	}
}
