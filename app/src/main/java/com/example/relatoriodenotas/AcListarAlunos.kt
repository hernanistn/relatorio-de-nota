package com.example.relatoriodenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.relatoriodenotas.Classe.Aluno
import java.lang.Exception

class AcListarAlunos : AppCompatActivity() {
    private lateinit var nome: EditText
    private lateinit var nota1: EditText
    private lateinit var nota2: EditText
    private lateinit var nota3: EditText
    private lateinit var btnSalvar: Button
    var aluno: Aluno? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac_listar_alunos)
        nome = findViewById<EditText>(R.id.edtNome)
        nota1 = findViewById<EditText>(R.id.edtNota1)
        nota2 = findViewById<EditText>(R.id.edtNota2)
        nota3 = findViewById<EditText>(R.id.edtNota3)
        btnSalvar = findViewById<Button>(R.id.btnSalvar)
        btnSalvar.setOnClickListener {
            try {
              aluno?.add(nome.text.toString(), nota1.text.toString().toDouble(), nota2.text.toString().toDouble(), nota3.text.toString().toDouble())
            }catch (E: Exception){
                Toast.makeText(this, E.toString(), Toast.LENGTH_LONG).show()
            }
        }
    }
}
