package bt2;

/*
 * Click  license
 * Click 
 */
import bt1.sanpham;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteObject {
     public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList<sanpham> ds = new ArrayList<>();
//        ds.add(new SanPham("SP01", "Gao", 25000));
//        ds.add(new SanPham("SP02", "Duong", 45000));
//        ds.add(new SanPham("SP03", "Keo", 29000));

        Scanner sc = new Scanner(System.in);
        try {
            FileOutputStream fos = new FileOutputStream("sanpham.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Nhap danh sach tu ban phim
            for (int i = 0; i < 3; i++) {
                System.out.println("Thong tin san pham thu nhat" + (i + 1));
                System.out.println("Nhap ma so:");
                String maso = sc.nextLine();
                System.out.println("Nhap ten:");
                String ten = sc.nextLine();
                System.out.println("Nhap gia");
                float gia = sc.nextFloat();
                sc.nextLine();
                sanpham sp = new sanpham(maso, ten, gia);
                ds.add(sp);
            }
            //ghi danh sach san pham ra tap tin
            oos.writeObject(ds);
            //dong luong
            oos.close();

            System.out.println("\n Da ghi xong");

        
        }catch(Exception ex){                   
            System.out.println("Loi xay ra:" + ex.toString());
        }
    }
}