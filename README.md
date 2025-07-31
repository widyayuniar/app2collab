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
A. activity_main.xml
![1](https://github.com/user-attachments/assets/e85a5b7d-fb5b-484d-b6bb-ec3a0ec212b6)
1. <?xml version="1.0" encoding="utf-8"?> : Baris ini merupakan deklarasi standar pada file XML. Artinya, file ini menggunakan format XML versi 1.0 dengan pengkodean karakter UTF-8. Pengkodean ini memungkinkan penggunaan berbagai karakter dari berbagai bahasa.
2. <androidx.constraintlayout.widget.ConstraintLayout : Baris ini menandakan bahwa ConstraintLayout digunakan sebagai layout utama (root layout). ConstraintLayout adalah jenis layout yang fleksibel dan memungkinkan penempatan komponen UI dengan mengatur batasan (constraint) antara satu komponen dengan komponen lainnya atau dengan parent-nya.
3. xmlns:android="http://schemas.android.com/apk/res/android"
   xmlns:app="http://schemas.android.com/apk/res-auto"
   xmlns:tools="http://schemas.android.com/tools" :
   Bagian ini disebut namespace declaration, yang berfungsi agar atribut-atribut XML dikenali dengan benar oleh sistem Android.
    - xmlns:android: untuk atribut standar Android seperti android:layout_width.
    - xmlns:app: untuk atribut tambahan dari AndroidX seperti app:layout_constraintTop_toTopOf.
    - xmlns:tools: hanya digunakan untuk keperluan tampilan (preview) di Android Studio, tidak berpengaruh saat aplikasi dijalankan.
4. android:id="@+id/main"
   android:layout_width="match_parent"
   android:layout_height="match_parent"
   android:id="@+id/main" : memberikan identitas unik pada ConstraintLayout ini agar dapat diakses dari kode Java/Kotlin.
5. layout_width="match_parent" dan layout_height="match_parent" : berarti layout ini akan mengisi seluruh lebar dan tinggi layar.
6. tools:context=".MainActivity" : Atribut ini hanya digunakan untuk preview di Android Studio. Menunjukkan bahwa layout ini digunakan di dalam kelas MainActivity, sehingga Android Studio dapat menampilkan pratinjau yang lebih akurat sesuai dengan konteks Activity tersebut.
7. <LinearLayout
    ...
    android:orientation="vertical"
    ... > : LinearLayout adalah jenis layout yang menyusun elemen-elemen di dalamnya secara linear, baik vertikal maupun horizontal. Pada kasus ini digunakan vertical, artinya komponen-komponen di dalamnya akan disusun dari atas ke bawah.

![2](https://github.com/user-attachments/assets/1382aa9b-8d07-4c14-ad04-678d366586dc)
Kode XML tersebut membuat tampilan form biodata dengan dua elemen.
- TextView menampilkan judul "Form Biodata Siswa" yang rata tengah, huruf tebal, ukuran 20sp, dan memiliki jarak bawah.
- Di bawahnya ada EditText untuk input nama siswa, dengan hint "Masukkan Nama", teks rata tengah, tinggi 48dp, dan garis bawah berwarna ungu.
Layout ini disusun agar terlihat rapi dan mudah digunakan.

![3](https://github.com/user-attachments/assets/369877fc-fea9-476a-a24f-53ec509e2380)
Kode XML tersebut menampilkan dua komponen: kolom input kelas dan tombol aksi. 
- EditText digunakan untuk memasukkan kelas siswa, dengan lebar penuh, tinggi 48dp, teks rata tengah, hint "Masukkan Kelas", dan garis bawah berwarna ungu.
- Di bawahnya, terdapat Button dengan teks "Tampilkan", posisi di tengah layar, teks tidak huruf kapital semua, serta latar tombol berwarna cyan muda.
Keduanya diberi jarak bawah agar tampilan lebih rapi dan nyaman dilihat.

![4](https://github.com/user-attachments/assets/d503e46f-5bb2-46bd-b315-ed05517cfdce)
Kode XML tersebut menampilkan sebuah TextView yang digunakan untuk: 
- Menampilkan hasil output dari input sebelumnya.
- Komponen ini memiliki lebar penuh (match_parent) dan tinggi menyesuaikan isi.
- Awalnya tidak menampilkan teks karena android:text="". Ukuran teks diatur 16sp, berwarna abu gelap (#333), dan diberi padding 12dp agar isi teks tidak mepet ke tepi.
- Latar belakangnya berwarna abu terang (#E0E0E0), membuat hasil yang ditampilkan lebih mudah dibaca dan terlihat menonjol.

B. MainActivity.kt
![import ma](https://github.com/user-attachments/assets/ac86d9e4-c4ff-4956-9a54-010d1c193e85)
1. package com.smktunas.app2collab : Mendefinisikan lokasi atau nama paket tempat file ini berada. Biasanya mencerminkan struktur folder proyek dan nama aplikasi.
2. import android.os.Bundle : Untuk mengakses class Bundle, yang digunakan saat menyimpan atau memulihkan data pada onCreate() Activity.
3. import android.widget.Button, EditText, TextView : Mengimpor komponen UI (Button: untuk tombol, EditText: untuk kolom input teks, TextView: untuk menampilkan teks)
4. import androidx.activity.enableEdgeToEdge : Digunakan untuk membuat tampilan aplikasi full screen hingga ke tepi layar (edge-to-edge layout), biasanya dipakai untuk modern UI.
5. import androidx.appcompat.app.AppCompatActivity : Base class untuk Activity yang kompatibel dengan berbagai versi Android. Biasanya menjadi superclass dari MainActivity.
6. import androidx.core.view.ViewCompat & WindowInsetsCompat : Digunakan untuk menangani tampilan sistem seperti status bar atau navigation bar secara kompatibel di berbagai versi Android. Umumnya berkaitan dengan pengaturan padding atau inset agar tampilan aplikasi tidak tertutup oleh sistem UI.

![private ma](https://github.com/user-attachments/assets/e9559d66-7cad-4548-8f6d-8ed88f2b5449)
1. class MainActivity : AppCompatActivity() { : Mendefinisikan kelas MainActivity sebagai turunan dari AppCompatActivity, yaitu kelas dasar untuk activity yang kompatibel dengan berbagai versi Android.
2. private lateinit var inputName: EditText : Bagian ini mendeklarasikan empat variabel UI yang akan digunakan di dalam Activity. Penjelasan kata kunci dan tiap variabel:
   - private : Menandakan bahwa variabel ini hanya bisa diakses dalam kelas ini saja.
   - lateinit : Artinya variabel akan diinisialisasi nanti, bukan saat deklarasi, Hanya bisa digunakan untuk tipe data non-nullable dan bukan tipe primitif, Berguna untuk komponen UI karena biasanya baru di-binding saat onCreate().
4. lateinit var inputName: EditText → Untuk mengambil input nama dari pengguna.
5. lateinit var inputKelas: EditText → Untuk mengambil input kelas dari pengguna.
6. lateinit var btnSubmit: Button → Untuk mendeteksi saat tombol "Tampilkan" diklik.
7. lateinit var txtResult: TextView → Untuk menampilkan hasil input nama dan kelas.

![oncreate ma](https://github.com/user-attachments/assets/3ba63a9a-ee0a-4221-99e0-aa80cbe8f99d)
1. override fun onCreate(savedInstanceState: Bundle?) : Fungsi ini dijalankan saat Activity pertama kali dibuat. Kata override berarti fungsi ini menimpa fungsi bawaan dari AppCompatActivity.
2. super.onCreate(savedInstanceState) : Memanggil fungsi onCreate() dari superclass (AppCompatActivity) agar siklus hidup Activity tetap berjalan dengan benar.
3. enableEdgeToEdge() : Mengaktifkan mode edge-to-edge UI, yaitu tampilan layar penuh hingga ke area status bar dan navigation bar. Cocok untuk desain modern Android.
4. setContentView(R.layout.activity_main) : Mengatur tampilan Activity menggunakan layout XML activity_main.xml.
5. Bagian ViewCompat.setOnApplyWindowInsetsListener(...) : Digunakan untuk menyesuaikan padding otomatis agar konten tidak tertutup oleh sistem seperti status bar atau navigation bar.

![id ma](https://github.com/user-attachments/assets/31c1b1dd-c908-4da1-9216-9a94b25cdbad)
1. findViewById(R.id.xxx) : Digunakan untuk menghubungkan komponen di layout XML (activity_main.xml) dengan variabel di kode Kotlin (MainActivity.kt). Ini adalah bagian penting agar komponen seperti EditText, Button, dan TextView bisa digunakan dalam logika aplikasi.
2. inputName = findViewById(R.id.nama) : Menghubungkan variabel inputName (tipe EditText) dengan komponen yang memiliki ID @+id/nama di file XML -> untuk mengambil input nama siswa.
3. inputKelas = findViewById(R.id.kelas) : Menghubungkan variabel inputKelas (tipe EditText) dengan komponen @+id/kelas di layout -> untuk input kelas siswa.
4. btnSubmit = findViewById(R.id.tampilkan) : Menghubungkan variabel btnSubmit (tipe Button) dengan tombol yang ID-nya @+id/tampilkan -> Tombol ini digunakan untuk menampilkan hasil input saat diklik.
5. txtResult = findViewById(R.id.hasil) : Menghubungkan variabel txtResult (tipe TextView) dengan komponen @+id/hasil -> Tempat menampilkan output dari nama dan kelas yang telah diinput.

![submit ma](https://github.com/user-attachments/assets/91a0656b-0eba-4c40-acc4-f424989e5dcf)
1. btnSubmit.setOnClickListener { : Baris ini membuat listener untuk tombol btnSubmit. Artinya, kode di dalam blok { ... } akan dijalankan ketika tombol diklik.
2. val nama = inputName.text.toString().trim() : Mengambil teks dari EditText bernama inputName, mengubahnya menjadi String, dan menghapus spasi di awal dan akhir.
3. val kelas = inputKelas.text.toString().trim() : Sama seperti baris sebelumnya, tetapi mengambil input dari EditText bernama inputKelas.
4. val hasil = "Nama: $nama\nKelas: $kelas" : Membuat sebuah String yang berisi nama dan

C. activity_splash.xml
![splash xml](https://github.com/user-attachments/assets/3546eef6-37a1-4514-a8c0-1cd21c50d831)
1. import android.content.Intent
   import android.os.Bundle
   import android.os.Handler
   import androidx.appcompat.app.AppCompatActivity : Menunjukkan nama paket aplikasi. Mengimpor class-class yang diperlukan, seperti Intent, Handler, dan AppCompatActivity.
2. class splashactivity : AppCompatActivity() { : Membuat class bernama splashactivity (sebaiknya pakai huruf besar di awal: SplashActivity) yang merupakan subclass dari AppCompatActivity.
3. override fun onCreate(savedInstanceState: Bundle?) {
   super.onCreate(savedInstanceState)
   setContentView(R.layout.activity_splash) :
   - Fungsi onCreate dijalankan saat activity pertama kali dibuat.
   - setContentView(...) : Menentukan layout yang digunakan, yaitu activity_splash.xml.
5. Handler().postDelayed({ startActivity(Intent(this@splashactivity,
   MainActivity::class.java))finish()
   }, 3000)
   - Handler().postDelayed({...}, 3000) : Menjalankan kode di dalamnya setelah delay 3000 milidetik (3 detik).
   - startActivity(...) : Membuka activity baru, yaitu MainActivity.
   - finish() : Menutup splash screen agar tidak bisa dibuka lagi saat tombol “Back” ditekan.

D. SplashActivity.kt
![splash kt](https://github.com/user-attachments/assets/ef3fbcaa-cad0-4397-8766-66cc1bcf01e8)
1. <?xml version="1.0" encoding="utf-8"?> : Deklarasi standar XML (wajib ada di bagian atas file layout XML).
2. <RelativeLayout
   xmlns:android="http://schemas.android.com/apk/res/android"android:layout_width="match_parent"android:layout_height="match_parent"android:background="#FFFFFF"> :
   - RelativeLayout: Jenis layout yang memungkinkan penempatan view relatif terhadap parent atau view lain.
   - layout_width dan layout_height = "match_parent" artinya mengisi seluruh layar.
   - background = "#FFFFFF" memberi warna putih pada latar belakang.
3. <ImageView
   android:id="@+id/logo_smk"
   android:layout_width="200dp"
   android:layout_height="200dp"
   android:src="@drawable/fotoosmk"android:layout_centerInParent="true"/>
   - ImageView: Untuk menampilkan gambar/logo. Penjelasan atribut:
      • android:id="@+id/logo_smk" → ID view, agar bisa digunakan di Kotlin.
    	•	layout_width dan layout_height → Ukuran gambar 200dp x 200dp.
    	•	src="@drawable/fotoosmk" → Menampilkan gambar bernama fotoosmk dari folder res/drawable. Pastikan file fotoosmk.png/jpg benar-benar ada di folder tersebut.
    	•	layout_centerInParent="true" → Memposisikan gambar di tengah layout.
4. </RelativeLayout> : Menutup tag RelativeLayout.

D. Terminal
1. git init : Menginisialisasi repositori Git lokal di folder proyek. Setelah perintah ini, folder tersebut menjadi repositori Git.
2. git add . : Menambahkan semua file dan perubahan ke area staging agar siap dikomit.
3. git commit -m "Inisialisasi proyek Android" : Menyimpan perubahan yang sudah di-add dengan pesan commit "Inisialisasi proyek Android".
4. git branch -M main : Mengganti nama branch utama (default) menjadi main.
5. git remote add origin https://github.com/NamaUser/NamaRepo.git : Menghubungkan repositori lokal dengan repositori GitHub (remote) yang URL-nya kamu masukkan.
6. git push -u origin main : Mengirim branch main ke GitHub (remote) dan menetapkan origin/main sebagai default tracking branch.
7. git checkout -b fitur-ui : Membuat dan langsung berpindah ke branch baru bernama fitur-ui.
8. git commit -m "add ui" : Menyimpan perubahan (yang sebelumnya sudah di-add) dengan pesan commit "add ui".
9. git push -u origin fitur-ui : Mengirim branch fitur-ui ke GitHub dan menetapkannya sebagai tracking branch.
10. git checkout -b fitur-logic : Membuat dan berpindah ke branch baru bernama fitur-logic.
11. git commit -m "add logic" : Menyimpan perubahan yang sudah ditambahkan ke staging area dengan pesan "add logic".
12. git push -u origin fitur-logic : Mengirim branch fitur-logic ke GitHub dan menetapkannya sebagai tracking branch.
13. git commit -m "add splash" : Melakukan commit (catatan perubahan) dengan pesan "add splash", tetapi tidak ada git add sebelumnya, jadi mungkin tidak ada perubahan yang ikut dikomit.
14. git checkout -b fitur-splash : Membuat dan berpindah ke branch fitur-splash.
15. git push -u origin fitur-splash : Mengirim branch fitur-splash ke GitHub dan menetapkannya sebagai tracking branch.
16. git pull origin fitur-ui : Mengambil dan menggabungkan isi dari branch fitur-ui di GitHub ke branch lokal saat ini.
17. git pull origin fitur-logic : Mengambil dan menggabungkan isi dari branch fitur-logic ke branch lokal.
18. git pull origin fitur-splash : Mengambil dan menggabungkan isi dari branch fitur-splash ke branch lokal.
19. git push -u origin main : Mendorong perubahan dari branch main lokal ke GitHub (bisa jadi setelah digabung dari cabang fitur-fitur sebelumnya).
20. git pull origin main : Mengambil dan menggabungkan perubahan terbaru dari branch main di GitHub ke branch lokal saat ini.

## 📸 Screenshot
![hasil 1](https://github.com/user-attachments/assets/b8494029-f243-4976-88d3-78b9fe611c8a)
![hasil 2](https://github.com/user-attachments/assets/a57d09fb-fdae-4b5a-8f20-6625b6bc61a8)
![hasil 3](https://github.com/user-attachments/assets/f63cae2b-3a2c-421c-84bc-271504ad5919)

