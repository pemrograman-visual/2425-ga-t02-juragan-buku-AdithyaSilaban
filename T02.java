// 12S24029 - ADITHYA PHILIP JONA PUTRA SILABAN
// 12S24048 - OLIVIA TAMBUNAN

import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, fBE, grade;
        int tT, stok;
        double hP, mM, rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tT = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        fBE = input.nextLine();
        hP = Double.parseDouble(input.nextLine());
        mM = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7) {
            grade = "Best Pick";
        } else {
            if (rating >= 4.5 && rating < 4.7) {
                grade = "Must Read";
            } else {
                if (rating >= 4.0 && rating < 4.5) {
                    grade = "Recommended";
                } else {
                    if (rating >= 3.0 && rating < 4.0) {
                        grade = "Average";
                    } else {
                        if (rating < 3.0) {
                            grade = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tT + "|" + penerbit + "|" + fBE + "|" + hP + "|" + mM + "|" + stok + "|" + rating + "|" + grade);
    }
}

