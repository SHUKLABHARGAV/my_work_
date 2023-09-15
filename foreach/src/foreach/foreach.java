package foreach;

public class foreach {
	int sum1 =0;
	for(int k :arr2) {
	//	sum1 = sum1+k;
		sum1 += k;  // sum1 = sum1+k;
		System.out.println(k);
	}
	System.out.println(sum1 + " ");
	for(String s : name) {
		System.out.print(s + " ");
	}
}
