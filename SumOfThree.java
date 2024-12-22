public class SumOfThree {
    public static int inSumOfThree(int n, int a, int b,int c){
        if (n==0){
            return 0;
        } else {
            System.out.print(a+",");
            inSumOfThree(n-1, b, c, a+b+c);
        }
        return 0;
}
public static void main(String[] args) {
    int n =5;
    int a =1;
    int b =1;
    int c =1;
    inSumOfThree(n, a, b, c);

  }
}