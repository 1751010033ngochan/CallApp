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
public class GiangVienThinhGiang1 extends GiangVien{
        private String noiCongtac;
    public GiangVienThinhGiang1(String ht, String hh, String hv, String noiCT) {
        super(ht, hh, hv);
        
        this.noiCongtac = noiCT;
    }

    @Override
    public double TinhTienLuong(int soNgaylam) {
        return soNgaylam * luong;
    }

    @Override
    public String toString() {
        String m = super.toString();
        
        m += String.format("Nơi công tác: %s\n\n", this.noiCongtac);
        return m;
    }
    
    
    
}
