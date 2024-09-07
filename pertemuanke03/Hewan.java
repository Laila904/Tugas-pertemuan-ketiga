/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuanke03;

/**
 *
 * @author ASUS
 */
abstract class Hewan {
    private String nama;

    //metode abstract yg harus diimplementasikan oleh subclass
    public abstract void suara();

    public abstract void makan();

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
}
