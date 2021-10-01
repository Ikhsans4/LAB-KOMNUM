package com.tugas;
/**
 * @author M. Ikhsan Fikri
 * NPM       : 2008107010020
 * Kelas    : C
 * @version 1.0.0
 */

 import java.lang.Math;

public class Biseksi {
    public static void main(String[] args) {
        
        // batas bawah = 2.4
        double a = 2.4;
        // batas atas = 2.7
        double b = 2.7;
        // e = 0.02
        double e = 0.02;
        // N = 5
        int N = 5;
        double fa;
        double fb;
        double xr = 0;
        double fxr;
        int i = 1;
        System.out.println("=== Mencari Akar Persamaan Non-Linear Dengan Metode Biseksi ====");
        System.out.println("Fungsi\t\t\t : f(x) = x^3 - 10x + 8 ");
        System.out.println("Nilai toleransi error(e) : " + e);
        System.out.println("batas bawah\t\t : " + a);
        System.out.println("batas atas\t\t : " + b);
        // f(x) = x^3 - 10x + 8
        // menghitung nilai f(a) dan f(b)
        fa = Math.pow(a, 3) - (10 * a) + 8;
        fb = Math.pow(b, 3) - (10 * b) + 8;
        // mengecek kondisi f(a) x f(b)

        if ((fa * fb) > 0) {
            System.out.println("Tidak ditemukan fungsi pada persamaan tersebut");

        } else {
            boolean looping = true;
            System.out.println(
                    "=================================================================================================================");
            System.out
                    .println("| i |     a\t|      b\t|      f(a)\t|      f(b)\t|     xr\t|      f(xr)\t|     |b-a|\t|");
            System.out.println(
                    "=================================================================================================================");

            while (looping) {
                // menghitung xr
                xr = (a + b) / 2;
                // menghitung f(xr)
                fxr = Math.pow(xr, 3) - (10 * xr) + 8;
                System.out.printf("| %d | %f\t| %f\t| %f\t| %f\t| %f\t| %f\t| %f\t|\n", i, a, b, fa, fb, xr, fxr,
                        (b - a));
                // mengecek kondisi looping untuk berhenti
                if ((i > N) || (Math.abs(b - a) < e)) {
                    looping = false;
                }
                // menukar nilai a atau b sesuai kondisi yang ditentukan
                if ((fxr * fa) < 0) {
                    b = xr;
                    fb = fxr;
                } else {
                    a = xr;
                    fa = fxr;
                }
                i++;

            }
            System.out.println(
                    "=================================================================================================================");

            System.out.println("Akar dari persamaan f(x) = x^3 - 10x + 8 adalah x = " + xr);
        }

    }
}