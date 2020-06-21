import hashTable.*;
import searchtrees.*;
import java.lang.*;



import java.security.SecureRandom;
import java.util.Hashtable;

public class ass1 {

    private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
    private static final String NUMBER = "0123456789";

    private static final String DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER;
    private static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {

        System.out.println("String : " + DATA_FOR_RANDOM_STRING);

       
     //       System.out.println("result : " + generateRandomString(8));
           
    String str; 
    int n = 10;
    long t1=0;
    long t2=0;
    long totaltime=0;
    long avg =0;
    QuadraticProbingHashTable<String> H = new QuadraticProbingHashTable<>( );
    double v;
    //SplayTree<Integer> splayt = new SplayTree<Integer>( );
    //AVLTree<Integer> avlt = new AVLTree<>( ); 
    //BinarySearchTree<Integer> binarySearcht = new BinarySearchTree<>( );
    RedBlackBST<Integer, Integer> redBalckbstt = new RedBlackBST<Integer, Integer>();
    for(int i = 1; i<100000;i++) {
  	  v = (Math.random()*((100000-1)+1))+1;
  	  t1 = System.currentTimeMillis(); 
  	//splayt.insert(i);
    //splayt.insert((int)v);
    //avlt.insert(i);
  	//avlt.insert((int)v);
  	//binarySearcht.insert(i);
  	//binarySearcht.insert((int)v);
  	//redBalckbstt.put(i,i);
  	redBalckbstt.put((int)v,(int)v);
  	  t2 = System.currentTimeMillis(); 
  	  totaltime = totaltime+ (t2-t1)*10000;
  	    }
  	    avg = totaltime/10000*n;	  
  	  System.out.println("insertion average of tree is : " + avg);
  	 
  	   avg = 0;
 	    totaltime =0; 
 	    for(int i = 1; i<100000;i++) {
 	 	  v = (Math.random()*((100000-1)+1))+1;
 	  	  t1 = System.currentTimeMillis(); 
 	 //splayt.contains(i);
    //splayt.contains((int)v);
 	//avlt.contains(i); 
    //avlt.contains((int)v);
 	//binarySearcht.contains(i);
 	//binarySearcht.contains((int)v);
 	//redBalckbstt.contains(i);
 	redBalckbstt.contains((int)v);
 	  	  t2 = System.currentTimeMillis(); 
 	  	  totaltime = totaltime+ (t2-t1)*10000;
 	  	    }
 	  	    avg = totaltime/10000*n;
   System.out.println("finding average of tree is : " + avg);

  	  
  	  
  	  
  	  
  	  avg = 0;
  	    totaltime =0; 
  	    for(int i = 1; i<100000;i++) {
  	  	  v = (Math.random()*((100000-1)+1))+1;
  	  	  t1 = System.currentTimeMillis(); 
  	   //splayt.remove(i);
  	   //splayt.remove((int)v);
      //avlt.remove(i);
  	  //avlt.remove((int)v);
  	  //binarySearcht.remove(i);
  	  //binarySearcht.remove((int)v);
  	  //redBalckbstt.delete(i);
  	  redBalckbstt.delete((int)v);
  	  	  t2 = System.currentTimeMillis(); 
  	  	  totaltime = totaltime+ (t2-t1)*10000;
  	  	    }
  	  	    avg = totaltime/10000*n;
    System.out.println("deletion average of tree is : " + avg);

    
/*
    for (int i =0;i<n;i++) {
    str = generateRandomString(4); ///here to change 2 to the power
    t1 = System.currentTimeMillis(); 
    H.insert( ""+str );
    t2 = System.currentTimeMillis(); 
    totaltime = totaltime+ (t2-t1);
    }
    avg = totaltime /n;
    System.out.println("insertion average is : " + avg);
  */ 
    /*for (int i =0;i<n;i++) {
        str = generateRandomString(4); ///here to change 2 to the power
        t1 = System.currentTimeMillis(); 
        H.contains( ""+str );
        t2 = System.currentTimeMillis(); 
        totaltime = totaltime+ (t2-t1);
        }
        avg = totaltime /n;
        System.out.println("Search average is : " + avg);
      */  
        /*AVLTree<Integer> avlt = new AVLTree<>( ); 
        for(int i = 1; i<100000;i++) {
      	  t1 = System.currentTimeMillis(); 
      	  avlt.insert( i );
      	  t2 = System.currentTimeMillis(); 
      	  totaltime = totaltime+ (t2-t1);
      	    }
      	    avg = totaltime /n;	  
   
        System.out.println("insertion average of avlt is : " + avg);
  
              
        BinarySearchTree<Integer> binarySearcht = new BinarySearchTree<>( );
        for(int i = 1; i<100000;i++) {
      	  t1 = System.currentTimeMillis(); 
      	  binarySearcht.insert(i);
      	  t2 = System.currentTimeMillis(); 
      	  totaltime = totaltime+ (t2-t1);
      	    }
      	    avg = totaltime /n;	  
   
        System.out.println("insertion average of binarySearcht is : " + avg);
        
        RedBlackBST<Integer, Integer> redBalckbstt = new RedBlackBST<Integer, Integer>();
        //Integer RB;
        for(int i = 1; i<100000;i++) {
      	  t1 = System.currentTimeMillis(); 
      	  //RB=i;
      	  //redBalckbstt.put(RB,RB);
      	  redBalckbstt.put(i,i);
      	  t2 = System.currentTimeMillis(); 
      	  totaltime = totaltime+ (t2-t1);
      	    }
      	    avg = totaltime /n;	  
   
        System.out.println("insertion average of redBlackstt is : " + avg);
   
           	    
    	 // AVLTree<Integer> avlt = new AVLTree<>( );     
    	 for(int i = 1; i<100000;i++) {
    	    t1 = System.currentTimeMillis(); 
    	    avlt.contains( i );
    	    t2 = System.currentTimeMillis(); 
    	    totaltime = totaltime+ (t2-t1);
    	    }
    	    avg = totaltime /n;	  
    	    	    	    	 
     System.out.println("finding average of avlt is : " + avg);
     
     for(int i = 1; i<100000;i++) {
 	    t1 = System.currentTimeMillis(); 
 	    binarySearcht.contains( i );
 	    t2 = System.currentTimeMillis(); 
 	    totaltime = totaltime+ (t2-t1);
 	    }
 	    avg = totaltime /n;	  
 	    	    	    	 
    System.out.println("finding average of binarySearcht is : " + avg);
    
    for(int i = 1; i<100000;i++) {
	    t1 = System.currentTimeMillis(); 
  	    redBalckbstt.contains( i );
	    t2 = System.currentTimeMillis(); 
	    totaltime = totaltime+ (t2-t1);
	    }
	    avg = totaltime /n;	  
	    	    	    	 
    System.out.println("finding average of redBlackbstt is : " + avg);
    
    for(int i = 1; i<100000;i++) {
	    t1 = System.currentTimeMillis(); 
  	    splayt.contains(i);
	    t2 = System.currentTimeMillis(); 
	    totaltime = totaltime+ (t2-t1);
	    }
	    avg = totaltime /n;	  
	    	    	    	 
    System.out.println("finding average of splayt is : " + avg);
    
    for(int i = 1; i<100000;i++) {
	    t1 = System.currentTimeMillis(); 
	    avlt.remove( i );
	    t2 = System.currentTimeMillis(); 
	    totaltime = totaltime+ (t2-t1);
	    }
	    avg = totaltime /n;	  
	    	    	    	 
    System.out.println("elimination average of avlt is : " + avg);
    
    for(int i = 1; i<100000;i++) {
	    t1 = System.currentTimeMillis(); 
	    binarySearcht.remove(i);
	    t2 = System.currentTimeMillis(); 
	    totaltime = totaltime+ (t2-t1);
	    }
	    avg = totaltime /n;	  
	    	    	    	 
    System.out.println("elimination average of binarySearcht is : " + avg);
    
    for(int i = 1; i<100000;i++) {
	    t1 = System.currentTimeMillis(); 
  	    redBalckbstt.delete(i);
	    t2 = System.currentTimeMillis(); 
	    totaltime = totaltime+ (t2-t1);
	    }
	    avg = totaltime /n;	  
	    	    	    	 
   System.out.println("elimination average of redBlackstt is : " + avg);
 
   for(int i = 1; i<100000;i++) {
	    t1 = System.currentTimeMillis(); 
 	    splayt.remove(i);
	    t2 = System.currentTimeMillis(); 
	    totaltime = totaltime+ (t2-t1);
	    }
	    avg = totaltime /n;	  
	    	    	    	 
   System.out.println("elimination average splayt is : " + avg);
   
   AVLTree<AnyType> avlt = new AVLTree<>( ); 
   for(int i = 1; i<100000;i++) {
 	  t1 = System.currentTimeMillis(); 
 	  avlt.insert( i );
 	  t2 = System.currentTimeMillis(); 
 	  totaltime = totaltime+ (t2-t1);
 	    }
 	    avg = totaltime /n;	  

   System.out.println("insertion average of avlt is : " + avg);
*/  
    }

    public static String generateRandomString(int length) {
        if (length < 1) throw new IllegalArgumentException();

        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {

// 0-62 (exclusive), random returns 0-61
            int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
            char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);
                  
            // debug
            //System.out.format("%d\t:\t%c%n", rndCharAt, rndChar);

            sb.append(rndChar);

        }

        return sb.toString();

    }

}

