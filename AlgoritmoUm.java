public class AlgoritmoUm{
    public static void main(String[] args) {
        for(int x = 10; x < 1000; x += 50){
            System.out.println(x + ";" + f(x));
        }
    }

    public static int f(int x){
        int i, j, k, res = 0;
        int cont_op = 0;
        for( i = x; i <= x+1; i += 1 ){
            for( j = x+1; j <= x+i; j += i ){
                for( k = 1; k <= i*i; k += i/2+1 ){
                    res = res + i;
                    cont_op++;
                }
            }
        }
        return cont_op;
    }
}