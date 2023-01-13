package br.com.kotlinappsorteo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sortearNumero(view: View){

        var texto = findViewById<TextView>(R.id.resultado);
        var numeroSorteado = java.util.Random().nextInt(61)
        texto.text = "Número sorteado é: " + numeroSorteado
    }
}