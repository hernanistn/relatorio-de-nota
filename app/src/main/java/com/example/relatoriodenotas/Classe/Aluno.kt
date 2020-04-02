package com.example.relatoriodenotas.Classe

data class Aluno (val nome: String, val notas: Array<Double>){
lateinit var alunos : MutableList<Aluno>


    fun add(nome: String, nota1: Double, nota2: Double, nota3: Double){
        alunos = mutableListOf(Aluno(nome, arrayOf(nota1, nota2, nota3)))
}
}
