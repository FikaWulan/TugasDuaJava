package bukuu;

//kelas buku
public class Buku {
    // Atribut
    private final String judul;
    private final String pengarang;
    private final int tahunterbit;
    
    // Konstruktor
    public Buku(String judul, String pengarang, int tahunterbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunterbit = tahunterbit;
    }

    // Metode untuk mencetak detail buku
    public void cetakBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunterbit);
        System.out.println();//enter atau spasi antar buku ya
    }
}
