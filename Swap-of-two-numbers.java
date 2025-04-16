class Swap{
  public static void main(String args[]){

    int first = 5, second = 10;
    System.out.println("--Before swap--");
    System.out.println(first);
    System.out.println( second);

    int temporary = first;
    first = second;
    second = temporary;

    System.out.println("--After swap--");
    System.out.println( first);
    System.out.println(second);
  
  }
}
