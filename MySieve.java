 /**
 * A class that uses the Sieve of Eratosthenes to print prime numbers
 * the class implements Sieve
 *
 * @author Alieu Sanneh
 * @version Sieve of Eratosthenes 
 */
 public class MySieve implements Sieve{

 //decleration of the instance variables
 private int currentPrime;
 private int M;
 private java.util.ArrayList<Integer> numberList;
 private java.util.ArrayList<Integer> primeList;


 /**
 * The zero parameter constructor intantiates the two Arraylists
 */
 public MySieve(){
        numberList = new java.util. ArrayList<Integer>();
        primeList = new java.util.ArrayList<Integer>();

 }
 
 
  /**
  * The method from Sieve
  * The overrriden method performs the calculations and returns 
  * a list of primes numbers up to an upper bound, n.
  *
  * @param n The upper bound chosen by the user
  */
  @Override
  public java.util.List<Integer> getPrimes(int n){
      // M is the square root of the upper bound
      M = (int)Math.sqrt(n);
      // the loop that creates the numberList
      for(int i=2; i<=n; i++){
      numberList.add(i);
      }
          
      if(n>=2){
      currentPrime = numberList.get(0);
      primeList.add(currentPrime);
      for(int j=0; j<numberList.size(); j++){
      // checks for multiples of currentPrime
      if(numberList.get(j) % currentPrime == 0) {
      // removes all the mutiples of currentPrime from the list
      numberList.remove(j);
      }
      }
      
      while(currentPrime < M){
      // resets the numberlist index to start at zero
      int i=0;
      //sets currentPrime as the first number in the updated numberList
      currentPrime = numberList.get(i);
      // adds currentPrime to primeList
      primeList.add(currentPrime);
      for(int j=0; j<numberList.size(); j++){
      if(numberList.get(j) % currentPrime == 0) {
      numberList.remove(j);
      } 
      }
      }
      // adds all the remaining contents of numberList to primeList    
      for(int j=0; j<numberList.size(); j++){
      primeList.add(numberList.get(j));
      }
      }
      // returns the list with the primes
      return primeList;
      }  


 }
 
 








