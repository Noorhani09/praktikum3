/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum3.soal2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class main {
     public static void main(String[] args) {
        String nama = "", jenis="", nama_p="";
        int tanggal=0, bulan=0, tahun=0;
        Scanner input = new Scanner(System.in);
        Negara a = new Negara(nama, jenis, nama_p, tanggal, bulan, tahun);
        LinkedList<Negara> llNegara = new LinkedList<Negara>();

        int ulang;
        ulang = input.nextInt();

        for (int i=0; i<ulang; i++){
            Negara b = new Negara(nama, jenis, nama_p, tanggal, bulan, tahun);
            b.getData();
            llNegara.add(b);
        }

        for (int i = 0; i < llNegara.size(); i++){
            Negara nIndex = llNegara.get(i);
            nIndex.tampilkan();
    }
}
}
