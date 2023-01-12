public class BinomialCoffiecient {
    public static int factr(int n){
        int f =1;
        for (int i = 1; i <=n; i++) {
            f=f*i;
        }
        return f;

    }
    public static int binCaff(int n, int r){

        int fac_n = factr(n);
        int fact_r = factr(r);
        int fact_nmr = factr(n-r);
        int binCoeff = fac_n/(fact_r*fact_nmr);
        return binCoeff;

    }

    public static void main(String[] args) {
        System.out.println(binCaff(5, 2));
    }
}
