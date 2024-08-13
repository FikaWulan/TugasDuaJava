package bukuu;

//kelas perpustakaan
public class Perpustakaan {
    public static void main(String[] args) {
        // Membuat objek buku1
        Buku buku1 = new Buku("Belajar Java", "Fika", 2022);
        // Membuat objek buku2
        Buku buku2 = new Buku("Belajar PBO", "Giska", 2024);
        
        // Mencetak detail buku1
        buku1.cetakBuku();
        // Mencetak detail buku2
        buku2.cetakBuku();
    }
}
