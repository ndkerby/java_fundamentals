/*
 listing out all prime number from a number m
 ex input =30
 output:
 2
 3
 5
 7
 11
 13
 17
 19
 23
 29
 */
class ListAllPrime{
 
  static void prime(int a){
    for(int i=2;i<=a;i++){
      int counter=0;
      for(int b=1;b<=i;b++){
        if(i%b==0){
          counter=counter+1;
        }
      }
      if(counter==2){
        System.out.println(i);
      }
    }
  }
 
  public static void main(String args[]){
    int m;
    m=Integer.parseInt(args[0]);
    ListAllPrime.prime(m);


  }
}
