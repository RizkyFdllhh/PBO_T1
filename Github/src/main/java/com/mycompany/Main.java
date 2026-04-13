package com.mycompany;

import com.mycompany.akademi.MataKuliah;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("2410010402", "Rizky Fadillah", 3.67, 4);
        
        MataKuliah mk = new MataKuliah("MK101", "Pemrograman Berorientasi Objek");
        mhs.tampilkanData();
        mk.tampilkanData();
    }
    
}
