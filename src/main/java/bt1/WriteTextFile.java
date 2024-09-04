/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt1;

import java.io.FileWriter;
import java.util.ArrayList;

public class WriteTextFile {
     public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<sanpham> ds = new ArrayList<>();
        ds.add(new sanpham("SP01", "Gao", 25000));
        ds.add(new sanpham("SP02", "Duong", 45000));
        ds.add(new sanpham("SP03", "Keo", 29000));
        
        try{
            //tao luong ghi du lieu ra tap tin van ban
            FileWriter fw = new FileWriter("sanpham.txt");
            
            for(sanpham sp : ds)
            {
                //ghi du lieu file
                fw.write(sp.getMaso() + ":" + sp.getTen() + ":" +sp.getGia() + "\n");
            }
            //dong luong
            fw.close();
            System.out.println("Ghi thanh cong");
        }catch (Exception ex){
            System.out.println("Loi xay ra:" + ex.toString());
            System.out.println("Ghi file that bai");
        }
    }
}
