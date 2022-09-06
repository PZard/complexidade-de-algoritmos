public class AlgoritmoCinco {
    public static void main(String[] args) {
        for(int x = 0; x < 500; x += 5){
            System.out.println(x + ";" + f(x));
        }
    }

    public static long f(int x){
        int i, j, k, res = 0;
        int cont_op = 0;
        for(i = x / 2; i <= x + 1; i += 2){
            for(j = i; j <= x * i; j += i / 2 + 1){
                for(k = i + 1; k <= x * j; k += 1){
                    res = res + k*j;
                    cont_op++;
                }
            }
        }
        return cont_op;
    }
}
