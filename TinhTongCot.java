package season_2.TinhTongCot;

import java.util.Scanner;

public class TinhTongCot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so dong: ");
        int dong = sc.nextInt();
        System.out.printf("Nhap cot: ");
        int cot = sc.nextInt();

        int mang[][] = new int [dong][cot];
        System.out.printf("Nhap gia tri: ");
        //nhap gia tri cua mang
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                System.out.printf("\narr["+i+"]["+j+"]: ");
                mang[i][j]= sc.nextInt();
            }
        }
        System.out.printf("\nMang da nhap la: ");
        for (int i=0;i<dong;i++){
            for (int j=0;j<cot;j++){
                System.out.printf("\narr["+i+"]["+j+"] = "+ mang[i][j]);
            }
            System.out.printf("\n");
        }

        for (int i=0;i<dong;i++){
            int tong=0;
            for (int j=0;j<cot;j++){
                tong = tong+mang[j][i];
            }
            System.out.printf("\nTong cac dong la: "+tong);
        }

    }
}
