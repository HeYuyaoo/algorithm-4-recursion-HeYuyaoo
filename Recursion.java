public class Recursion{
   //part1: factorial non-recursion
   public static int fac1(int n) {
        	int tmp=n-1;
        	while(tmp!=1) {
        		n=n*(tmp);
        		tmp--;
        	}
        	return n;
        }
   
   
   //part2: factorial recursion
   public int fac2(int n) {
        if(n==1||n==0) {
             return 1;
          }
        return n*factorial(n-1);
    }
   
   
   //part3: fibonacci sequence non-recursion
   public int Fibo1(int n){//1 1 3 5 
          int a=1;
          if(n>2){
            while(a<=n-3){
               int sum= 2+a;
               a++;
            }
             return sum;
          }
      return 1;
         
   
   
   //part4: fibonacci sequence recursion
    public int Fibo2(int n){
          if(n==1||n==2) {
               return 1;
           }
           return Fibo(n-1)+Fibo(n-2);

    }
