# Pertemuan6 – Formulir & Tampil Data (Jetpack Compose)

Aplikasi Android sederhana berbasis **Jetpack Compose** dan **Material 3** yang menampilkan dua layar: formulir isian dan halaman tampil data. Perpindahan antar layar ditangani oleh **Navigation Compose**.

## Fitur

- Layar **Formulir** berisi input Nama Lengkap, pilihan Jenis Kelamin (radio button), dan Alamat.
- Tombol **Submit** untuk berpindah ke layar Detail.
- Layar **Tampil Data** menampilkan Nama Lengkap, Jenis Kelamin, dan Alamat dalam bentuk daftar.
- Tombol **Back** untuk kembali ke formulir (`popBackStack`).
- Top bar berwarna `teal_700` pada kedua layar.

## Struktur Proyek

```
com.example.pertemuan6
├── MainActivity.kt      # Entry point, memasang tema dan memanggil DataApp()
├── Navigasi.kt          # enum Navigasi + NavHost (DataApp)
└── view
    ├── Formulir.kt      # Composable FormIsian
    └── TampilData.kt    # Composable TampilData
```

| File | Peran |
|------|-------|
| `MainActivity.kt` | Mengaktifkan edge-to-edge, membungkus aplikasi dengan `Pertemuan6Theme` dan `Surface`, lalu memanggil `DataApp()`. |
| `Navigasi.kt` | Mendefinisikan rute `FormulirSaya` dan `Detail`, serta `NavHost` dengan start destination `FormulirSaya`. |
| `Formulir.kt` | Tampilan form dengan `OutlinedTextField`, `RadioButton`, `HorizontalDivider`, dan tombol Submit. |
| `TampilData.kt` | Menampilkan data dalam pasangan label–nilai dengan teks tebal bergaya `FontFamily.Cursive`. |

## Alur Navigasi

```
FormulirSaya  --(Submit)-->  Detail
FormulirSaya  <--(Back)----  Detail
```

## Teknologi

- Kotlin
- Jetpack Compose (Material 3)
- Navigation Compose
- Android Studio

## Cara Menjalankan

1. Clone atau unduh proyek ini.
2. Buka folder proyek di **Android Studio**.
3. Tunggu proses **Gradle Sync** selesai.
4. Pastikan dependensi Navigation Compose ada di `build.gradle.kts` (module app):
```kotlin
   implementation("androidx.navigation:navigation-compose:<versi>")
```
5. Siapkan emulator atau hubungkan perangkat Android.
6. Klik **Run ▶** (atau `Shift + F10`).

## Resource yang Dibutuhkan

Aplikasi memakai resource berikut, pastikan ada di folder `res/`:

- **strings.xml**: `home`, `submit`, `tampil`, `back`, `nama_lengkap`, `jenis_kelamin`, `alamat`
- **colors.xml**: `teal_700`
- **dimens.xml**: `padding_medium`, `padding_small`

## Status Pengembangan

Versi saat ini masih berupa kerangka tampilan:

- Input formulir belum menyimpan state (`value = ""` dan `onValueChange = {}`).
- Radio button belum menyimpan pilihan (`selected = false`).
- Layar Tampil Data masih menampilkan data contoh (hardcode), belum mengambil data dari formulir.

Rencana pengembangan:

- [ ] Simpan input dengan `remember { mutableStateOf("") }`.
- [ ] Simpan pilihan jenis kelamin dan tandai radio yang aktif.
- [ ] Kirim data formulir ke layar Tampil Data (lewat argumen navigasi atau ViewModel).
- [ ] Pindahkan teks "Nama Lengkap" dan "Alamat" ke `strings.xml`.

## Identitas

- **Nama:** Ahmad Nawfal Ramadhan
- **NIM:** 20240140028
- **Mata kuliah:** Pemograman Aplikasi Mobile
- **Pertemuan:** 6

## Screenshot

| Layar Formulir | Layar Tampil Data (setelah Submit) |
|:--------------:|:----------------------------------:|
| <img width="394" height="864" alt="Screenshot 2026-10-22 191754" src="https://github.com/user-attachments/assets/0adc1922-d143-40c0-86ff-e0c45ef81629" />| <img width="393" height="867" alt="Screenshot 2026-10-22 191808" src="https://github.com/user-attachments/assets/a6aa7161-b645-4f7a-8885-b9614f38a287" />|
