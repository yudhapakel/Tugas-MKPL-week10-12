# Grade Calculator App

## Deskripsi Aplikasi
Aplikasi ini adalah project Java Maven sederhana untuk menghitung grade mahasiswa berdasarkan nilai angka.

## Aturan Grade
- 85 - 100 = A
- 70 - 84 = B
- 55 - 69 = C
- 40 - 54 = D
- 0 - 39 = E

## Testing
Testing dilakukan menggunakan JUnit. Assertion digunakan untuk memastikan logic grade calculator berjalan sesuai aturan.

Assertion yang digunakan:
- `assertEquals`
- `assertTrue`
- `false` (assertFalse)
- `assertThrows`

## Git Workflow
Setiap anggota membuat branch masing-masing, melakukan commit, push, lalu membuat Pull Request ke branch main.

## GitHub Actions
GitHub Actions digunakan untuk menjalankan CI secara otomatis setiap ada push atau pull request.

## Security Scan
Security scan dilakukan menggunakan Trivy untuk mendeteksi potensi vulnerability pada project.