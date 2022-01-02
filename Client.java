public class Client {
   public static void main(String[] args) {
      // create two Point objects
      Point p1 = new Point(3, 7);
      Point p2 = new Point(4, 3);
      
      // create an ArrayList of Points 
   	  ArrayList<Point> list = new ArrayList<Point>();
   	  
   	  //add elements to ArrayList
   	  list.add(p1);
   	  list.add(p2);
      
   	  //Print original list
      System.out.println("Original order: " + list);
      
      //compare and sort list
      p1.compareTo(p2);
      Collections.sort(list);
      
      //Print ordered list
      System.out.println("Sorted order: " + list);
      
      // print each point and its distance from the origin
      System.out.println("p1 is " + p1);
      System.out.printf("distance from origin = %3.2f\n",
                            p1.distanceFromOrigin());
   
      System.out.println("p2 is " + p2);
      System.out.printf("distance from origin = %3.2f\n",
                            p2.distanceFromOrigin());
    
   }
}
