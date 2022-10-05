/*
 created by 21343008_Maharani Safitri
 */

package Jobsheett6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tugas1a {
    public static void main(String[] args) {
	BufferedReader nilai = new BufferedReader(new InputStreamReader(System.in));
	String r="";
	String s="";
	String t="";
		  
	try{
            System.out.print("Masukkan nilai pertama Anda: ");
            r = nilai.readLine();
            System.out.print("Masukkan nilai kedua Anda: ");
            s = nilai.readLine();
            	  
            System.out.print("Masukkan nilai ketiga Anda: ");
            t = nilai.readLine();
            
	}
        
        catch(IOException e){
            System.out.println("Kata yang Anda masukkan salah, silahkan coba lagi.");
	} 
        
	int pertama , kedua , ketiga;
        ketiga = Integer.parseInt(t);
        kedua = Integer.parseInt(s);
        pertama = Integer.parseInt(r);
        
        int rata_rata=(pertama+kedua+ketiga)/3;
	if (rata_rata >= 60)
            System.out.println("Rata-rata nilai Anda: "+rata_rata+ " :-)");
	else 
            System.out.println("Rata-rata nilai Anda: "+rata_rata+ " :-(");
		  
	}
}
