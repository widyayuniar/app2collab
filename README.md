# Project Kolaborasi Android
Ini adalah proyek sederhana untuk belajar kolaborasi menggunakan Git & Android Studio

## 👥 Tim
- Widya Yuniar: Inisialisasi & Merge PR
- M. Naufal Saifulloh: Fitur TextView
- Nurin Ajrina Majdina: Fitur Button

## 📱 Fitur
- Menampilkan TextView
- Menampilkan Button yang dapat diklik

## 🔧 Teknologi
- Kotlin
- Android Studio
- Git + GitHub

## 📸 Penjelasan Code Penting
1. <?xml version="1.0" encoding="utf-8"?>: Baris ini merupakan deklarasi standar pada file XML. Artinya, file ini menggunakan format XML versi 1.0 dengan pengkodean karakter UTF-8. Pengkodean ini memungkinkan penggunaan berbagai karakter dari berbagai bahasa.

<androidx.constraintlayout.widget.ConstraintLayout
Baris ini menandakan bahwa ConstraintLayout digunakan sebagai layout utama (root layout). ConstraintLayout adalah jenis layout yang fleksibel dan memungkinkan penempatan komponen UI dengan mengatur batasan (constraint) antara satu komponen dengan komponen lainnya atau dengan parent-nya.

🌐 Deklarasi Namespace:
xml
Salin kode
xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
Bagian ini disebut namespace declaration, yang berfungsi agar atribut-atribut XML dikenali dengan benar oleh sistem Android.

xmlns:android: untuk atribut standar Android seperti android:layout_width.

xmlns:app: untuk atribut tambahan dari AndroidX seperti app:layout_constraintTop_toTopOf.

xmlns:tools: hanya digunakan untuk keperluan tampilan (preview) di Android Studio, tidak berpengaruh saat aplikasi dijalankan.

📐 Atribut Layout:
xml
Salin kode
android:id="@+id/main"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:id="@+id/main" memberikan identitas unik pada ConstraintLayout ini agar dapat diakses dari kode Java/Kotlin.

layout_width="match_parent" dan layout_height="match_parent" berarti layout ini akan mengisi seluruh lebar dan tinggi layar.

tools:context=".MainActivity"
Atribut ini hanya digunakan untuk preview di Android Studio. Menunjukkan bahwa layout ini digunakan di dalam kelas MainActivity, sehingga Android Studio dapat menampilkan pratinjau yang lebih akurat sesuai dengan konteks Activity tersebut.

## 📸 Screenshot
_Tambahkan screenshot di sini 
