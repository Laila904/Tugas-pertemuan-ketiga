/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuanke03;

public class Awal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kucing kitty = new Kucing();
        kitty.setNama("kitty");
        kitty.suara();
        kitty.makan();
        kitty.minum();
        kitty.minum(100);
        kitty.cek();
        System.out.println();

        Anjing jose = new Anjing();
        jose.setNama("jose");
        jose.suara();
        jose.makan();
        jose.minum();
        jose.minum(90);
        jose.cek();
        System.out.println();

    }

}
