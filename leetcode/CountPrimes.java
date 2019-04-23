/*
    Count Primes
    Count the number of prime numbers less than a non-negative number, n.
*/
class CountPrimes {
    public int SieveOfEratosthenes(int n) {
        
        boolean[] primes = new boolean[n];
        int primeCount =0;
        
        if(n==0 || n==1 ||n==2)
            return 0; 
        
        if(n==3)
            return 1;
        
        for(int i = 0; i< n; i++)
            primes[i] = true;
        
        for(int i = 2; i*i < n; i++) {
            
            if(primes[i]) {
                
                for(int j = i*i; j < n; j+=i) 
                    primes[j] = false;
            }
        }

        
        for(int i = 2; i< n; i++)
            if(primes[i])
                primeCount++;
            
        return primeCount;
    }
}