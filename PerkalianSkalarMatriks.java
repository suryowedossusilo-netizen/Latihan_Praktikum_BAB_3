import java.util.Scanner;

public class PerkalianSkalarMatriks {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah baris: ");
            int baris = input.nextInt();
            
            System.out.print("Masukkan jumlah kolom: ");
            int kolom = input.nextInt();
            
            int[][] matriks = new int[baris][kolom];
            System.out.println("\nMasukkan elemen matriks:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    matriks[i][j] = input.nextInt();
                }
            }
            System.out.print("\nMasukkan nilai skalar: ");
            int skalar = input.nextInt();
            int[][] hasil = new int[baris][kolom];
            
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    hasil[i][j] = matriks[i][j] * skalar;
                }
            }
            System.out.println("\nHasil perkalian matriks dengan skalar:");
            for (int i = 0; i < baris; i++) {
                System.out.print("{ ");
                for (int j = 0; j < kolom; j++) {
                    System.out.print(hasil[i][j]);
                    if (j < kolom - 1) System.out.print(", ");
                }
                System.out.println(" }");
            }
        }
    }
}
