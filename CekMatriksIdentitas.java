import java.util.Scanner;

public class CekMatriksIdentitas {
    public static boolean isIdentitas(int[][] matriks) {
        int n = matriks.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j && matriks[i][j] != 1) {
                    return false; 
                }

                if (i != j && matriks[i][j] != 0) {
                    return false; 
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan ordo matriks (n x n): ");
            int n = input.nextInt();
            
            int[][] matriks = new int[n][n];
            
            System.out.println("\nMasukkan elemen matriks:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    matriks[i][j] = input.nextInt();
                }
            }
            System.out.println("\nMatriks:");
            for (int i = 0; i < n; i++) {
                System.out.print("{ ");
                for (int j = 0; j < n; j++) {
                    System.out.print(matriks[i][j]);
                    if (j < n - 1) System.out.print(", ");
                }
                System.out.println(" },");
            }
            if (isIdentitas(matriks)) {
                System.out.println("\nHasil: Matriks ini adalah MATRİKS IDENTITAS.");
            } else {
                System.out.println("\nHasil: Matriks ini BUKAN matriks identitas.");
            }
        }
    }
}
