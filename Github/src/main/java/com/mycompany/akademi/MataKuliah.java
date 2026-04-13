package com.mycompany.akademi;

public class MataKuliah {
    private String kodeMK;
    private String namaMK;
    
    public MataKuliah(String kodeMK, String namaMK){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
    }
    
    public String getKodeMK() { return kodeMK;}
    public void setKodeMK(String KodeMK){this.kodeMK = kodeMK;}
    
    public String getNamaMK() { return namaMK;}
    public void setNamaMK(String namaMK){this.namaMK = namaMK;}
    
    public void tampilkanData(){
        System.out.println("=== Data Mata Kuliah ===");
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " +namaMK);
    }
    
}
