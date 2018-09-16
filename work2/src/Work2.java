/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MANGGAR-LAPTOP
 */
public class Work2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilaiAndroid = 100;
        String wajah = "CANTIK";
        String asal = "MALANG";
        
        System.out.println("apakah kamu mau menikah?");
        
        char nilaiAndroidHuruf;
        if (nilaiAndroid >= 85){
            nilaiAndroidHuruf = 'A';
    }
        else if (nilaiAndroid >= 75){
            nilaiAndroidHuruf = 'B';
    }
        else if (nilaiAndroid >= 65){
            nilaiAndroidHuruf = 'C';
    }
        else if (nilaiAndroid >= 55){
             nilaiAndroidHuruf = 'D';
    }
        else { nilaiAndroidHuruf = 'E';
        
        }
    
        if(nilaiAndroidHuruf == 'A' && wajah == "CANTIK" && asal == "MALANG"){
            System.out.println("Mau Banget Dong");
    }
        else if((nilaiAndroidHuruf == 'A' || nilaiAndroidHuruf == 'C') && wajah == "CANTIK" && asal == "MALANG"){
            System.out.println ("Bolehlah...");
    }
        else if (asal == "MALANG"){
            System.out.println("Saya Pikir Dulu");
    }
        else{System.out.println("NO!");
    }  
    }
    }
    
    

