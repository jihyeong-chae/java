
public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
	int i = 1;
	int sum = 0;
	
	while(i <= 10) {
		if (i % 2 == 1) {
			sum = i;
			i = i + 1;
		}
	}
	System.out.println(sum);
}
}