/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan21.programrataratanilai;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * Program Deskripsi : Program Rata-rata Nilai
 */
public class PBO0610119916Latihan21ProgramRatarataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        
        int i,banyak_mahasiswa;
        float jum,nilai_mahasiswa, rata;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        banyak_mahasiswa = masuk.nextInt();
        
            jum=0;
            i=1;
            while (i<= banyak_mahasiswa){
                System.out.print("Nilai Mahasiswa ke- " +i+ ":");
                nilai_mahasiswa = masuk.nextFloat();
                jum += nilai_mahasiswa;
                i++;
            }
            rata = jum / banyak_mahasiswa;
            System.out.println("Maka,Rata-rata nilainya adalah "+rata);
            
    }
    
}
