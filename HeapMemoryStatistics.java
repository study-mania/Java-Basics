/*Code to retrieve the Heap Memory Area Statistics in JVM
r.maxMemory() retrieves in bytes. We convert bytes to MegaBytes(MB) here*/

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

/* Sample OUTPUT
Max Memory : 891.0
Total Memory : 61.5
Free Memory : 60.53981018066406
Consumed Memory : 0.9601898193359375
---------------------------------------------------------------------------------------------------------------------
SAMPLE OUTPUT When we run 'java -Xmx512m HeapMemory'  (Here we are setting maximum memory to 512MB)
Max Memory : 455.5
Total Memory : 61.5
Free Memory : 60.539939880371094
Consumed Memory : 0.9600601196289062 */
