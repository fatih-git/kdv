/**
 * @author fatih-git
 */

import java.util.Scanner;

public class KDV {

    public static void main(String[] args) {

        float price, kdvOrani;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Lütfen Ürün Fiyatını giriniz:");
        price=input.nextFloat();

        kdvOrani= (float) ((price<1000) ? 0.18 : 0.08);

        System.out.println("Aldığınız ürünün katma değer vergisi="+(price*kdvOrani));

    }

}
