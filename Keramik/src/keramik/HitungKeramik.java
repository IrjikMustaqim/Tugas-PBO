/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keramik;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author user
 */


public class HitungKeramik {
    double jumlahkardusOptimal;
    double hargaOptimal;
    int hasilPilihan;
    
    public Double luasKeramikPerKardus(int sisi1,int sisi2,int jumlahKeramikPerKardus){
        return (((sisi1*sisi2)*0.0001)*jumlahKeramikPerKardus);
    }
    
    public Double jumlahHarga(Double jumlahKardus, int hargaJual){
        return jumlahKardus*hargaJual;
    }
    
    public ArrayList<Double> jumlahKardusDiperlukan(Double luasperKardus,Double luasLahan){
         Double kardus = (Math.ceil(luasLahan/luasperKardus));
         Double sisa;
         sisa = (luasperKardus*kardus)-luasLahan;
         ArrayList<Double> hasil = new ArrayList<Double>();
         hasil.add(kardus);
         hasil.add(sisa);
         return hasil;
    }
    
    public int fit(ArrayList<Double> pilihanSisaKeramik,ArrayList<Double> hargaSeluruhnya){
        this.hargaOptimal = Collections.min(hargaSeluruhnya);
        ArrayList<Double> beberapaKeramikTerbaik = new ArrayList<Double>();
        for(Double i : hargaSeluruhnya){
            if(i == this.hargaOptimal){
                beberapaKeramikTerbaik.add(pilihanSisaKeramik.get(hargaSeluruhnya.indexOf(i)));                
            }        
        }
        this.hasilPilihan = pilihanSisaKeramik.indexOf(Collections.max(beberapaKeramikTerbaik));
        return this.hasilPilihan;
    }
    
    
        
        
        
    
}
