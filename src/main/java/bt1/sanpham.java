/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt1;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class sanpham implements Serializable {
     String maso;
    String ten;
    float gia;
    
    public sanpham(){
    
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public sanpham(String maso, String ten, float gia) {
        this.maso = maso;
        this.ten = ten;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maso=" + maso + ", ten=" + ten + ", gia=" + gia + '}';
    }  

    public String getMaSo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

