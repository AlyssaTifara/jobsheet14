public class TugasJobsheet14 {

    static int penjumlahanRekursif(int n) {
        int hasil = 0;

        for (int i = 1; i <= n; i++) {
            hasil += i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        int f = 8; 
        int hasil = penjumlahanRekursif(f); 

        System.out.println("1+2+3+4+5+6+7+8 = " + hasil);
    }
}
