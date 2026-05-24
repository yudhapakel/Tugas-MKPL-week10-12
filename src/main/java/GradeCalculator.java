public class GradeCalculator {

    public String convertScoreToGrade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }

        if (score >= 85) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 55) {
            return "C";
        } else if (score >= 40) {
            return "D";
        }

        return "E";
    }

    public boolean isPassed(int score) {
        return score >= 55;
    }

    // Tambahkan method main ini di bawah:
    public static void main(String[] args) {
        // Karena method di atas bukan 'static', kita harus buat objeknya dulu
        GradeCalculator kalkulator = new GradeCalculator();

        // Coba tes skor
        int skorUjian = 78;
        String nilaiHuruf = kalkulator.convertScoreToGrade(skorUjian);
        boolean statusLulus = kalkulator.isPassed(skorUjian);

        // Cetak hasil ke konsol
        System.out.println("Skor: " + skorUjian);
        System.out.println("Grade: " + nilaiHuruf);
        System.out.println("Apakah Lulus? " + (statusLulus ? "Ya" : "Tidak"));
    }
}