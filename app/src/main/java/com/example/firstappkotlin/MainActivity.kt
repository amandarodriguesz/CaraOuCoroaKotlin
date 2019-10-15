package com.example.firstappkotlin


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navegar.setOnClickListener {
            var intent = Intent(applicationContext,ResultadoActivity::class.java) //passando a activity que eu quero "ir"
            var numero = Random.nextInt(2) //gerando um nuemro randomico até 1 ( ou seja, 0 ou 1)
            var n2 = Random.nextInt(2)
            var n3 = Random.nextInt(2)

            intent.putExtra("numero",numero) //agregando o parametro na pagina que eu quero navegar
            intent.putExtra("n2",n2)
            intent.putExtra("n3",n3)

            //intent.putIntegerArrayListExtra("numero",Int numero,"n2",n2,"n3",n3)
            startActivity(intent) //empilhando a nova pagina a frente da pagina atual

        }
    }
}
