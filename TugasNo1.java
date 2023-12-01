public class TugasNo1{
        public static void deretDescRekursif(int n) {
            if (n >= 0) {
                System.out.print(n + " ");
                deretDescRekursif(n - 1);
            }
        }
    
        public static void deretDescIteratif(int n) {
            for (int i = n; i >= 0; i--) {
                System.out.print(i + " ");
            }
        }
    
        public static void main(String[] args) {
            int n = 5; 

            System.out.print("Deret descending rekursif dari " + n + " sampai 0:\n");
            deretDescRekursif(n);
            System.out.println("\n");
            System.out.print("Deret descending iteratif dari " + n + " sampai 0:\n");
            deretDescIteratif(n);
        }
    
}