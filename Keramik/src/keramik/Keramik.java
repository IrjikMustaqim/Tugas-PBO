/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramik;
import java.util.*;
/**
 *
 * @author user
 */
public class Keramik {
    
   
    
    
    public static void main(String[] args) {  
        HitungKeramik keramikMurah = new HitungKeramik();
        double keramik1 = keramikMurah.luasKeramikPerKardus(30, 30, 10);
        double keramik2 = keramikMurah.luasKeramikPerKardus(40, 40, 5);
        double keramik3 = keramikMurah.luasKeramikPerKardus(30, 40, 8);
        
        ArrayList<Double> daftarLuasKeramik = new ArrayList<>();
        daftarLuasKeramik.add(keramik1);
        daftarLuasKeramik.add(keramik2);
        daftarLuasKeramik.add(keramik3);
        
        ArrayList<ArrayList<Double>> daftarKardusDiperlukan = new ArrayList<>();
        double luasLahan = 100.0;
        for(double i : daftarLuasKeramik){
            daftarKardusDiperlukan.add(keramikMurah.jumlahKardusDiperlukan(i,luasLahan));
        }
        
        ArrayList<Double> daftarHargaSeluruhnya = new ArrayList<>();
        daftarHargaSeluruhnya.add(keramikMurah.jumlahHarga(daftarKardusDiperlukan.get(0).get(0),54000));
        daftarHargaSeluruhnya.add(keramikMurah.jumlahHarga(daftarKardusDiperlukan.get(1).get(0),65000));
        daftarHargaSeluruhnya.add(keramikMurah.jumlahHarga(daftarKardusDiperlukan.get(2).get(0),60000));
        
        ArrayList<Double> sisa = new ArrayList<>();
        for(ArrayList<Double> i : daftarKardusDiperlukan){
            sisa.add(i.get(1));
        }
        
        System.out.println("Pilihan Optimal adalah Keramik berindeks "+keramikMurah.fit(sisa, daftarHargaSeluruhnya)+"\n");
       
        
                
        
        
        
        
        
        
        
        
        
        
    }
    
}
