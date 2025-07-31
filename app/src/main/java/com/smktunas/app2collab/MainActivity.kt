package com.smktunas.app2collab

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var inputName: EditText
    private lateinit var inputKelas: EditText
    private lateinit var btnSubmit: Button
    private lateinit var txtResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        inputName = findViewById(R.id.nama)
        inputKelas = findViewById(R.id.kelas)
        btnSubmit = findViewById(R.id.tampilkan)
        txtResult = findViewById(R.id.hasil)

        btnSubmit.setOnClickListener {
            val nama = inputName.text.toString().trim()
            val kelas = inputKelas.text.toString().trim()
            val hasil = "Nama: $nama\nKelas: $kelas"
            txtResult.text = hasil

        }
    }
}