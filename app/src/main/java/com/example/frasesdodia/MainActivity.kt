package com.example.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var texto: TextView
    val frases = arrayOf(
        "Que a força esteja com você - (Star Wars)",
        "Com o tempo aprenderás a confiar em teus instintos, então serás invencível! - (Obi-Wan Kenobi)",
        "Tudo o que temos de decidir é o que fazer com o tempo que nos é dado - (Gandalf)",
        "O mundo não está em seus livros e mapas. Ele está lá fora! - (Gandalf)",
        "Ações não valem menos por não serem elogiadas - (Aragorn)",
        "Com grandes poderes vêm grandes responsabilidades - (tio Ben)",
        "Felicidade só é verdadeira quando compartilhada... (Na Natureza Selvagem)"



    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
texto = findViewById(R.id.textoFrase) as TextView

    }
    fun gerarFrase(view: View){
    val totalIntensArray = frases.size
        val numeroAleatorio = java.util.Random().nextInt( totalIntensArray )

        texto.setText(frases[ numeroAleatorio])

    }

}