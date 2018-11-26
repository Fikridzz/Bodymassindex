package com.example.fikridzakwan.bodymassindex

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Process
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO 1 membuat respon ketika di Click
        btnHitung.setOnClickListener {
            var beratBadan = edtBeratBadan.text.toString()
            var tinggiBadan = edtTinggiBadan.text.toString()
            val kurus = 0.0
            val batasKurus = 18.4
            val normal = 18.5
            val Batasnormal = 24.9
            val gemuk = 25.0
            val batasGemuk = 29.0

            if (beratBadan.toDoubleOrNull() != null && tinggiBadan.toDoubleOrNull() != null) {
                var process = beratBadan.toDouble() / (tinggiBadan.toDouble() * tinggiBadan.toDouble())
                when (process) {
                    in kurus..batasKurus -> {
                        txtHasil.text = "kamu kurus $process"
                    }
                    in normal..Batasnormal ->{
                        txtHasil.text = "Berat Badan Kamu Normal $process"
                    }
                    in gemuk..batasGemuk -> {
                        txtHasil.text = "Kamu Gemuk $process"
                    }
                    else ->{
                        txtHasil.text = "Kamu Obesitas $process"
                    }

                }

                }
            else {
                Toast.makeText(this, "Harap Masukkan Datanya", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

