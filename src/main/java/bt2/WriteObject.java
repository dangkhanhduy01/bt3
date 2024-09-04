package bt2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import bt1.sanpham;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteObject {
     public static void main(String[] args) {
       
 ArrayList<sanpham> ds = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin 3 sản phẩm từ bàn phím
        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
            System.out.print("Mã số: ");
            String maSo = scanner.nextLine();
            System.out.print("Tên sản phẩm: ");
            String ten = scanner.nextLine();
            System.out.print("Giá sản phẩm: ");
            float gia = Float.parseFloat(scanner.nextLine());

            ds.add(new sanpham(maSo, ten, gia));
        }

        // Ghi danh sách sản phẩm vào file 'sanpham.txt'
        try (FileWriter fw = new FileWriter("sanpham.txt")) {
            for (sanpham sp : ds) {
                fw.write(sp.getMaSo() + ";" + sp.getTen() + ";" + sp.getGia() + "\n");
            }
            System.out.println("Ghi danh sách sản phẩm vào file 'sanpham.txt' thành công.");
        } catch (IOException ex) {
            System.out.println("Lỗi xảy ra: " + ex.toString());
        }
    }
}

