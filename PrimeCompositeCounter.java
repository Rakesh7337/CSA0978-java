import java.util.Scanner;

public class PrimeCompositeCounter {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int primeCount = 0, compositeCount = 0;
System.out.println("Enter the numbers:");
while (sc.hasNextInt()) {
int num = sc.nextInt();
if (num < 2) {
continue;
}
boolean isPrime = true;
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0) {
isPrime = false;
break;
}
}
if (isPrime) {
primeCount++;
} else {
compositeCount++;
}
}
System.out.println("Prime number count: " + primeCount);
System.out.println("Composite number count: " + compositeCount);
}
}