public class SieveDriverBase {
    
    private java.util.Scanner scan;
    protected Sieve theSieve;
    
    public SieveDriverBase() {
        scan = new java.util.Scanner(System.in);
    }
    
    public void go() {
        
        java.util.List<Integer> primes;
        
        int n = getNumber();
        primes = theSieve.getPrimes(n);
        printPrimes(n, primes);
    }
    
    public int getNumber() {
        System.out.print("Enter the upper bound: ");
        int n = scan.nextInt();
        return n;
    }
    
    public void printPrimes(int bound, java.util.List<Integer> list) {
        System.out.println("The primes up to " + bound + " are:");
        for(int i = 0; i < list.size(); i ++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        new SieveDriverBase().go();
        
    }
    
}
