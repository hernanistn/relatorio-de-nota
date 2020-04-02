package com.example.relatoriodenotas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.relatoriodenotas.Classe.Aluno

class ListaRelatorio : AppCompatActivity() {
    private lateinit var edtText: EditText
    var aluno: Aluno? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_relatorio)
        edtText = findViewById(R.id.edtRelatorio)
        edtText.setText("${aluno!!.alunos}")
    }
}
