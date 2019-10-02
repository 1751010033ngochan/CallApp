/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class QuanLyGiangVien1 {
    private ArrayList<GiangVien> ds = new ArrayList<>();
    
    public void themGiangvien(GiangVien gv){
       this.ds.add(gv);
    }
    
    public void xoaGiangvien(GiangVien gv){
        this.ds.remove(gv);
    }
    
    public double tinhLuong(Scanner s){
        //for ( start_value; end_value; increment_number )
        for(GiangVien gv: this.ds){
            System.out.printf("Nhập số ngày làm việc: ", gv.getTienLuong());
            //Nhập số ngày làm
            int soNgaylam = s.nextInt();
            gv.setTienLuong(gv.TinhTienLuong(soNgaylam));
        }
        return 0;
    }

    @Override
    public String toString() {
        String m = "";
        for(GiangVien gv: this.ds){
            m += gv;
        }
        return m; 
    }
    
    
}
