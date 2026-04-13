package com.mycompany;

public class Mahasiswa {
    private String npm;
    private String nama;
    private double ipk;
    private int semester;
    
    public Mahasiswa(String npm, String nama, double ipk, int semester){
        this.npm = npm;
        this.nama = nama;
        this.ipk = ipk;
        this.semester = semester;
    }
    public String getNpm() {return npm;}
    public void setNpm(String npm) {this.npm = npm;}
    
    public String getNama() {return nama;}
    public void setNama(String nama) {this.nama = nama;}
    
    public double getIpk() {return ipk;}
    public void setIpk(double ipk ) {this.ipk = ipk;}
    
    public int getSemester() {return semester;}
    public void setSemester(int semester) {this.semester = semester;}
    
    public void tampilkanData(){
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("NPM         : " + npm);
        System.out.println("Nama        : " + nama);
        System.out.println("IPK         : " + ipk);
        System.out.println("Semester    : " + semester);
    }
}
