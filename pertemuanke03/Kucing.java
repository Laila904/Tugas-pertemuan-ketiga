/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanke03;

/**
 *
 * @author ASUS
 */
public class Kucing extends Hewan {
    public void Kucing(String nama){
    super.setNama(nama);
    }

    @Override
    public void suara() {
        System.out.println(this.getNama() + "meong meong");
    }

    @Override
    public void makan() {
        System.out.println(this.getNama() + "memakan ikan");
    }

    public void minum() {
        System.out.println(this.getNama() + "sedang minum");
    }

    // Overloading 
    public void minum(int banyaknyaAir) {
        System.out.println(this.getNama() + "minum sebanyak " + banyaknyaAir + " mili");

    }

    public void cek() {
        System.out.println("cek override");
        this.suara();
    }
}
