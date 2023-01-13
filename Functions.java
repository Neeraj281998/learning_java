public class Functions {
    public static void main(String[] args) {
//        System.out.println(SumFun(1,1));
//        System.out.println(factorial(3));
    }
     public static int SumFun(int a , int b){
        return a+b;
     }
     public static int factorial(int num){
        int fact=1 ;
        for (int i = num; i >=1 ; i--) {
             fact*=i;
         }
        return fact;
     }
}
