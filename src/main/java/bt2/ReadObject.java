/*
 * .txt to change this license
 * 
 */
package bt2;
import bt1.sanpham;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {
     public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<sanpham> ds;
        try{
            FileInputStream fis=new FileInputStream("sanpham.bin");
            ObjectInputStream ois=new ObjectInputStream(fis);
            ds=(ArrayList<sanpham> ) ois.readObject();
            
            
            System.out.println("\n Da doc xong");
            for(sanpham sp : ds){
                System.out.println(sp);
            }
        }catch (Exception ex){
            System.out.println("Loi xay ra" + ex.toString());
        }
    }
}

   
