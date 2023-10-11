public class Main {
    public static void main(String[] args) {
        //intansiasi
        Mahasiswa mahasiswa1 = new Mahasiswa("Muhammad", 20);
        Mahasiswa mahasiswa2 = new Mahasiswa("Adit", 19);


        mahasiswa2.setNama("Kholid");

        mahasiswa1.display();
        mahasiswa2.display();

        System.out.println(mahasiswa2.getNama());

        mahasiswa1.rumusLuasSegitiga(5, 12);
        System.out.println(mahasiswa1.getRumusLuasSegitiga());

    }
}