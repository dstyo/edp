package com.example.dwisetiyono.edpapplication.staticvariabel;

/**
 * @author dstyo (dwi.setiyono@dana.id)
 * @version CallStatic.java, v 0.1 17/01/19 12.04 by dstyo
 */
public class CallStatic {
        public static void main(String[] args) {
            TryStatic.tulisan();
            System.out.println(TryStatic.tambah(7,9));
            System.out.println("Panjang = " + TryStatic.panjang);
            System.out.println("Tinggi = " + TryStatic.tinggi);
        }
}
