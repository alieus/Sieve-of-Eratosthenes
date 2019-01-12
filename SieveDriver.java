 /**
 * A subclass of SieveDriverBase 
 * it extends the parent class and overrides most ot its method
 *
 * @author Alieu Sanneh
 * @version PA9: Sieve of Eratosthenes 
 */
 public class SieveDriver extends SieveDriverBase{
 
 //decleration of the instance variables
 private int percent;
 private int n;
   
   /**
   * The zero parameter constructor intantiates MySieve
   */
   public SieveDriver() {
     theSieve = new MySieve();
     }
    
    
   /**
   * The overriden go method from SieveDriverBase
   * it determines the flow of executiong of the program
   */
   @Override 
   public void go() {
     do{
     super.go();
     theSieve = new MySieve();
     }while( n!=0 );
     }
          
   
   /**
   * The getNumber method from SieveDriverBase
   * it validates the user input
   */
   @Override
   public int getNumber() {
      n = super.getNumber();
      while(n<0) {
      System.out.println("That is an invalid input");
      System.out.println("Please enter a positive integer");
      n=super.getNumber();
      }
      return n;
      }
   
   
    /**
    * The printPrimes method from SieveDriverBase
    * it prints out a formatted output for the user
    * it uses a list iterator to iterate through the list
    *
    *@param bound The uperbound provided by the user
    *@param list The list from the base class
    */
    @Override
    public void printPrimes(int bound, java.util.List<Integer> list) {
      System.out.print("The primes up to " + bound + " are:");
      java.util.Iterator<Integer> it = list.iterator();
      int count = 0;
      while(it.hasNext()) {
      if( count%12 ==0){
      System.out.println();
      }
      System.out.print(it.next() + " ");
      count++;
      // calculates the percentage of numbers that a prime
      percent = ((count*100)/bound);
     
      }
       
      System.out.println();
      if(bound>=2){
      //prints about the pecentage of n that are primes
      System.out.println(percent + "% of the numbers between 1 and "+ bound +" are prime.");
      }
      else{
      System.out.println("There are no prime numbers up to " + bound);
      }
      System.out.println();
      }
      
      
      
    /**
    * The application method that runs the program
    *
    * @param args The command-line arguments
    */
    public static void main(String[] args) {
      new SieveDriver().go();
      
     }
   
}
   
   
   