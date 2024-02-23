package JavaAssignment4;

public class PrimeNumber {
    public static void main(String[] args) {
        printAllPrime(100);
    }
    static void printAllPrime(int n){
        if(n < 2){
            System.out.println("no prime numbers are available");
        }
        System.out.println(2);
        for(int i = 3;i<=n;i++){
            int count = 0;
            for(int j = 2;j<=Math.sqrt(i);j++){ // Math.sqrt(i) we don't need to check all possible from 0,n
                if(i%j == 0)                  // just o- sqrt(n) is enough to declare that is prime or not;
                    count++;
            }
            if(count == 0)
                System.out.println(i);
        }
    }
}
