package com.example.relatoriodenotas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.relatoriodenotas.Classe.Aluno

class MainActivity : AppCompatActivity() {
    lateinit var btnCadastrarAluno: Button
    lateinit var btnListaAlunos: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnCadastrarAluno = findViewById<Button>(R.id.btnCadastrarAluno)
        btnListaAlunos = findViewById<Button>(R.id.button2)
        btnCadastrarAluno.setOnClickListener {
            val intent = Intent(this, AcListarAlunos::class.java).apply {

            }
            startActivity(intent)
        }
        btnListaAlunos.setOnClickListener {
            val intent = Intent(this, ListaRelatorio::class.java).apply {
            }
            startActivity(intent)
        }
    }
}
