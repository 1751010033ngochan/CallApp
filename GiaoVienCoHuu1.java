/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL;

/**
 *
 * @author DELL
 */
public class GiaoVienCoHuu1 extends GiangVien{
        private double luongCoBan;
        private double heSoluong; 
        
    public GiaoVienCoHuu1(String ht, String hh, String hv, double luongCB, 
                            double heSo) {
        super(ht, hh, hv);
        
        this.luongCoBan = luongCB;
        this.heSoluong = heSo;
    }

    @Override
    public double TinhTienLuong(int soNgaylam) {
        return soNgaylam * luong * this.luongCoBan * this.heSoluong;
    }

    @Override
    public String toString() {
        String m = super.toString();
        
        m += String.format("Lương cơ bản: %.2f\nHệ số: %.2f\n\n", 
                this.luongCoBan, this.heSoluong);
        return m; 
    }
    
    
    
}
