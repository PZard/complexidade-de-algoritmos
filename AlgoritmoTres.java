public class AlgoritmoTres {
    public static void main(String[] args) {
        for(int x = 10; x < 1000; x += 50){
            System.out.println(x + ";" + f(x));
        }
    }

    public static int f(int x){
        int i, j, k, res = 0;
        int cont_op = 0;
        for(i = x + 1; i <= x + 1; i += 1){
            for(j = x; j <= i+1; j += j / 2+1){
                for(k = j; k <= x * j; k += Math.abs(j-i)+1){
                    res = res + x * k;
                    cont_op++;
                }
            }
        }
        return cont_op;
    }
}
