public class Mahasiswa {
    //atribute/data
    String nama;
    int umur;
    double luasSegitiga;


    //constructor
    Mahasiswa(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    //method
    public void display(){
        System.out.println("Nama : " + this.nama);
        System.out.println("Umur : " + this.umur);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public double rumusLuasSegitiga(double alas, double tinggi){
        luasSegitiga = alas * tinggi * 0.5;
        return luasSegitiga;
    }

    public double getRumusLuasSegitiga(){
        return this.luasSegitiga;
    }

}
