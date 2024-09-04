/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt2;
import bt1.sanpham;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.io.Serializable;

public class ReadObject {
     public static void main(String[] args) {
        // Đọc danh sách sản phẩm từ file 'sanpham.bin'
        try (FileInputStream fis = new FileInputStream("sanpham.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            ArrayList<sanpham> ds = (ArrayList<sanpham>) ois.readObject();
            System.out.println("Đọc danh sách sản phẩm từ file 'sanpham.bin' thành công.");
            System.out.println("Danh sách sản phẩm:");

            for (sanpham sp : ds) {
                System.out.println(sp);
            }
        } catch (Exception ex) {
            System.out.println("Lỗi xảy ra: " + ex.toString());
        }
    }
}
