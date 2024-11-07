import java.util.Scanner;

/**
 * Kelas KelulusanMahasiswa untuk menyimpan nama siswa dan nilai ujian,
 * menghitung rata-rata nilai, dan menentukan kelulusan siswa.
 * 
 * Lulus jika nilai rata-rata >= 60.
 * 
 * @author Hasin
 * @version 1.0
 * @since 2024
 */
public class KelulusanMahasiswa {
    private String studentName;
    private double exam1, exam2, exam3;

    /**
     * Konstruktor untuk KelulusanMahasiswa.
     * 
     * @param studentName nama siswa
     * @param exam1 nilai ujian pertama
     * @param exam2 nilai ujian kedua
     * @param exam3 nilai ujian ketiga
     */
    public KelulusanMahasiswa(String studentName, double exam1, double exam2, double exam3) {
        this.studentName = studentName;
        this.exam1 = exam1;
        this.exam2 = exam2;
        this.exam3 = exam3;
    }

    /**
     * Menghitung nilai rata-rata dari tiga nilai ujian.
     * 
     * @return rata-rata nilai ujian
     */
    public double calculateAverage() {
        return (exam1 + exam2 + exam3) / 3;
    }

    /**
     * Menentukan apakah siswa lulus berdasarkan nilai rata-rata.
     * 
     * @return true jika siswa lulus, false jika tidak lulus
     */
    public boolean isPassing() {
        return calculateAverage() >= 60;
    }

    /**
     * Main method untuk menjalankan program.
     * Meminta input dari pengguna untuk nama siswa dan nilai ujian, lalu
     * menampilkan hasil nilai rata-rata dan status kelulusan.
     * 
     * @param args argumen command-line (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input pengguna
        System.out.print("Masukkan nama siswa: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan nilai ujian 1: ");
        double exam1 = scanner.nextDouble();

        System.out.print("Masukkan nilai ujian 2: ");
        double exam2 = scanner.nextDouble();

        System.out.print("Masukkan nilai ujian 3: ");
        double exam3 = scanner.nextDouble();

        // Membuat objek KelulusanMahasiswa
        KelulusanMahasiswa student = new KelulusanMahasiswa(name, exam1, exam2, exam3);

        // Menampilkan hasil rata-rata dan status kelulusan
        double average = student.calculateAverage();
        System.out.println("\nNama Siswa: " + name);
        System.out.println("Rata-rata Nilai: " + average);
        System.out.println("Status Kelulusan: " + (student.isPassing() ? "Lulus" : "Tidak Lulus"));

        scanner.close();
    }
}
