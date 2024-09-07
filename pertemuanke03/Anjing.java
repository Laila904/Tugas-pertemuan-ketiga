/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanke03;

/**
 *
 * @author ASUS
 */
public class Anjing extends Hewan {
    public void Anjing(String nama){
    super.setNama(nama);
    }

    @Override
    public void suara() {
        System.out.println(this.getNama() + " Menggonggong");
    }

    @Override
    public void makan() {
        System.out.println(this.getNama() + " Memakan daging dan tulang");
    }

    public void minum() {
        System.out.println(this.getNama() + "Anjing sedang minum");
    }

    //overloading metode dgn para meter banyak
    public void minum(int banyaknyaAir) {
        System.out.println(this.getNama() + "Anjing minum sebanyak " + banyaknyaAir + " mili");
    }

    public void cek() {
        System.out.println("cek override");
        this.suara();
    }
}
