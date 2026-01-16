public class Count_Primes_05 {

    public static void main(String[] args) {
        int n = 10;
        countPrimes(n);
    }

    public static void countPrimes(int n) {

        // Array used to mark non-prime numbers
        // 0 → prime (initially assumed)
        // 1 → not prime
        int arr[] = new int[n];

        // 0 and 1 are not prime numbers
        arr[0] = arr[1] = 1;

        // Sieve of Eratosthenes logic
        // Loop till i*i < n because smaller multiples are already handled
        for (int i = 2; i * i < n; i++) {

            // If i is still marked as prime
            if (arr[i] == 0) {

                // Mark all multiples of i as non-prime
                for (int j = i; i * j < n; j++) {
                    arr[i * j] = 1;
                }
            }
        }

        // Counter for prime numbers
        int c = 0;

        // Count all numbers marked as prime
        for (int i = 2; i < n; i++) {
            if (arr[i] == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}
