public class AlgoritmoDois {
    public static void main(String[] args) {
        for(int x = 10; x < 1000; x += 50){
            System.out.println(x + ";" + f(x));
        }
    }

    public static int f(int x){
        int i, j, k, res = 0;
        int cont_op = 0;
        for( i = x; i <= x+1; i += 2 ){
            for( j = x+1; j <= x*x; j += 2 ){
                for( k = i+1; k <= 2*x; k += 2 ){
                    res = res + x*k;
                    cont_op++;
                }
            }
        }
        return cont_op;
    }
}
