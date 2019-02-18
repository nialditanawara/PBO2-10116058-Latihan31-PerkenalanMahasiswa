/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan31.perkenalanmahasiswa;

public class PBO210116058Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "10116058";
        mhs1.nama = "Nialdi Tanawara";
        mhs1.perkenalkanDiri(mhs1.nim, mhs1.nama);
        System.out.println("");
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = "10116059";
        mhs2.nama = "Bobby Rafika";
        mhs2.perkenalkanDiri(mhs2.nim, mhs2.nama);
        System.out.println("");
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = "1011049";
        mhs3.nama = "Idris Kurniawan";
        mhs3.perkenalkanDiri(mhs3.nim, mhs3.nama);
        System.out.println("");
        
    }
    
}