/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarmenu;

import java.util.Scanner;

/**
 *
 * @author Tiwi
 */
public class Daftarmenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       hargamenu entityObjk =new hargamenu();
        query tambah = new query();
        Scanner input=new Scanner(System.in);
        String kdbarang,jenisbarang,harga;
        String jwb;
       
        
        System.out.print("kdbarang:");kdbarang = input.nextLine();
        System.out.print("jenisbarang :");jenisbarang=input.nextLine();
        System.out.print("harag :");harga = input.nextLine();
        entityObjk.setKdbarang(kdbarang);
        entityObjk.setJenisbarang(jenisbarang);
        entityObjk.setHarga(harga);
        tambah.Add(entityObjk);
        
        System.out.println("Apakah data anda ingin dilihat kan ? jawab ya/tidak");jwb=input.nextLine();
        if(jwb.equals("ya")){
        tambah.Show();
        }
        
        System.out.println("Apakah data anda ingin di rubah kan ? jawab ya/tidak");jwb=input.nextLine();
        if(jwb.equals("ya")){
            System.out.print("kdbarang :");kdbarang = input.nextLine();
            System.out.print("jenisbarang :");jenisbarang = input.nextLine();
            System.out.print("harga :");harga =input.nextLine();
            tambah.update(harga,jenisbarang,kdbarang);
            tambah.Show();
        }
        
        System.out.println("Apakah data anda ingin di hapus kan ? jawab ya/tidak");jwb=input.nextLine();
        if(jwb.equals("ya")){
            
            System.out.print("kdbarang :");kdbarang=input.nextLine();
            tambah.hapus(kdbarang);
            tambah.Show();
        }
        
    }
    
}
    

