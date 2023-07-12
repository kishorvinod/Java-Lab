class MultiplicationTableThread extends Thread {
    @Override
    public void run() {
System.out.println("\nNAME : KISHOR VINOD ");
System.out.println("\nREG NO : SJC22MCA-2035");
System.out.println("\nDATE : 23-06-2023");
System.out.println("\nCOURSE CODE : 20MCA132");
System.out.println("\nCOURSE NAME : OBJECT ORIENTED PROGRAMMING LAB");
System.out.println("-----------OUTPUT---------");
        System.out.println("Multiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }

        // Start PrimeNumbersThread after printing the multiplication table
        new PrimeNumbersThread(10).start();
    }
}
class PrimeNumbersThread extends Thread {
    private int count;

    public PrimeNumbersThread(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println("First " + count + " Prime Numbers:");
        int num = 2;
        int primeCount = 0;

        while (primeCount < count) {
            if (isPrime(num)) {
                System.out.println(num);
                primeCount++;
            }
            num++;
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        new MultiplicationTableThread().start();
    }
}

