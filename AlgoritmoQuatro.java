public class AlgoritmoQuatro {
    public static void main(String[] args) {
        for(int x = 1; x < 100; x += 5){
            System.out.println(x + ";" + f(x));
        }
    }

    public static long f(int x){
        int i, j, k, res = 0;
        int cont_op = 0;
        for(i = x / 2; i <= x * x; i += 1){
            for(j = 1; j <= x * x; j += (i / 2) + 1){
                for(k = 2; k <= i * j; k += (j / 2) + 1){
                    res = res + x - 1;
                    cont_op++;
                }
            }
        }
        return cont_op;
    }
}
