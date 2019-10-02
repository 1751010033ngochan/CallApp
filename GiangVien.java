/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QL;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author DELL
 */
public abstract class GiangVien {
    public static double luong = 90000;

    private String hoTen;
    private String hocHam;
    private String hocVi;
    private GregorianCalendar ngayBatdau;
    private double tienLuong = -1;
            
    {
        ngayBatdau = new GregorianCalendar();
    }
    
    public GiangVien(String ht, String hh, String hv){
        this.hoTen = ht;
        this.hocHam = hh;
        this.hocVi = hv;
    }
    
    public abstract double TinhTienLuong(int soNgaylam);

    @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            String ngay = f.format(this.ngayBatdau.getTime());
        String m = String.format("Họ tên: %s\nHọc hàm: %s\nHọc vị: %s\n"
                + "Ngày bắt đầu: %s\n", this.hoTen, this.hocHam, 
                this.hocVi, ngay);       
        
        if(this.getTienLuong() > 0)
            m += String.format("Tiền lương: %.2f\n", this.getTienLuong());
            
        return m; 
    }
    
    

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    

    /**
     * @return the hocHam
     */
    public String getHocHam() {
        return hocHam;
    }

    /**
     * @param hocHam the hocHam to set
     */
    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    /**
     * @return the hocVi
     */
    public String getHocVi() {
        return hocVi;
    }

    /**
     * @param hocVi the hocVi to set
     */
    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    /**
     * @return the ngayBatdau
     */
    public GregorianCalendar getNgayBatdau() {
        return ngayBatdau;
    }

    /**
     * @param ngayBatdau the ngayBatdau to set
     */
    public void setNgayBatdau(GregorianCalendar ngayBatdau) {
        this.ngayBatdau = ngayBatdau;
    }
    
    /**
     * @return the luong
     */
    public static double getLuong() {
        return luong;
    }

    /**
     * @param aLuong the luong to set
     */
    public static void setLuong(double aLuong) {
        luong = aLuong;
    }

    /**
     * @return the tienLuong
     */
    public double getTienLuong() {
        return tienLuong;
    }

    /**
     * @param tienLuong the tienLuong to set
     */
    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }
    
}
