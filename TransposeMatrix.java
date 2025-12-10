import java.util.Scanner;

public class TransposeMatrix {

    public static int[][] transpose(int[][] matriks) {
        int baris = matriks.length;
        int kolom = matriks[0].length;

        int[][] hasil = new int[kolom][baris];

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[j][i] = matriks[i][j];
            }
        }
        return hasil;
    }

    public static void printMatrix(int[][] matriks) {
        for (int[] row : matriks) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

                int[][] matriks = new int[baris][kolom];
        
                System.out.println("Masukkan elemen matriks:");
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        System.out.print("Elemen [" + i + "][" + j + "]: ");
                        matriks[i][j] = input.nextInt();
                    }
                }
        
                System.out.println("\nMatriks Asli:");
                printMatrix(matriks);
        
                int[][] hasil = transpose(matriks);
        
                System.out.println("\nMatriks Transpose:");
                printMatrix(hasil);
        
                input.close();
            }
        }

