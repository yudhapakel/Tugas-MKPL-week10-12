# Tugas MKPL Week 10-12 - Java Maven CI

Project ini dibuat untuk tugas Manajemen Konfigurasi Perangkat Lunak.
Project menggunakan Java Maven, unit testing, GitHub Actions, dan security scanning dengan Trivy.

## Fitur

- Konversi nilai angka menjadi grade A-E
- Validasi kelulusan berdasarkan nilai minimum
- Unit test menggunakan JUnit assertion
- CI otomatis menggunakan GitHub Actions
- Security scan menggunakan Trivy

## Cara Menjalankan Test Lokal

```bash
mvn clean test
```

## GitHub Actions

Workflow akan berjalan otomatis pada:

- Setiap push ke branch apapun
- Setiap pull request ke branch `main`

Workflow terdiri dari dua job:

1. `build-test`: melakukan checkout repository, setup Java 17, lalu menjalankan `mvn clean test`.
2. `security-scan`: menjalankan Trivy untuk mendeteksi vulnerability pada file/dependency project.

## Tools Security Scan

Tools yang digunakan adalah Trivy. Trivy merupakan vulnerability scanner yang dapat memeriksa dependency, filesystem, container image, dan konfigurasi project. Pada project ini, Trivy digunakan di GitHub Actions untuk mendeteksi potensi kerentanan keamanan setiap kali ada push atau pull request.
