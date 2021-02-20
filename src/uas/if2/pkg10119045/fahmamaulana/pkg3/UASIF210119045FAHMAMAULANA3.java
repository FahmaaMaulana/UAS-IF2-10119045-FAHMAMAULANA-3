/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119045.fahmamaulana.pkg3;

import java.util.Scanner;

/**
 *
 * @author Legion
 * Nama     : FAHMA MAULANA
 * NIM      : 10119045
 * Kelas    : IF - 2
 * Tanggal  : 20-02-2021
 * No       : 3
 */
public class UASIF210119045FAHMAMAULANA3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan umur anda : ");

        int umur = userInput.nextInt();
        boolean dewasa = false;

        if (umur >= 17) {
            dewasa = true;
            System.out.println("Status Dewasa : " + dewasa);
        } else {
            System.out.println("Status Dewasa : " + dewasa);
        }
    }
}
