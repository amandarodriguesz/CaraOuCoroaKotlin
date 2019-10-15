package com.example.firstappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*



class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_resultado)
        img1.setImageResource(R.drawable.ic_launcher_background)
        img2.setImageResource(R.drawable.ic_launcher_background)
        img3.setImageResource(R.drawable.ic_launcher_background)

        var intent: Intent = getIntent()
        var numero: Int = intent.getIntExtra("numero",0)
        var n2: Int = intent.getIntExtra("n2",0)
        var n3: Int = intent.getIntExtra("n3",0)

        if(numero==0 && n2==0 && n3==0){
            img1.setImageResource(R.drawable.moeda_cara)
            img2.setImageResource(R.drawable.moeda_cara)
            img3.setImageResource(R.drawable.moeda_cara)
        }else if(numero==1 && n2==1 && n3==1) {
            img1.setImageResource(R.drawable.moeda_coroa)
            img2.setImageResource(R.drawable.moeda_coroa)
            img3.setImageResource(R.drawable.moeda_coroa)
        }else if(numero==0 && n2==1 && n3==1) {
            img1.setImageResource(R.drawable.moeda_cara)
            img2.setImageResource(R.drawable.moeda_coroa)
            img3.setImageResource(R.drawable.moeda_coroa)
        }else if(numero==0 && n2==0 && n3==1) {
            img1.setImageResource(R.drawable.moeda_cara)
            img2.setImageResource(R.drawable.moeda_cara)
            img3.setImageResource(R.drawable.moeda_coroa)
        }else if(numero==1 && n2==1&& n3==0) {
            img1.setImageResource(R.drawable.moeda_coroa)
            img2.setImageResource(R.drawable.moeda_coroa)
            img3.setImageResource(R.drawable.moeda_cara)
        }else if(numero==1 && n2==0 && n3==0) {
            img1.setImageResource(R.drawable.moeda_coroa)
            img2.setImageResource(R.drawable.moeda_cara)
            img3.setImageResource(R.drawable.moeda_cara)
        }else if(numero==1 && n2==0 && n3==1) {
            img1.setImageResource(R.drawable.moeda_coroa)
            img2.setImageResource(R.drawable.moeda_cara)
            img3.setImageResource(R.drawable.moeda_coroa)
        }else if(numero==0 && n2==1 && n3==0) {
            img1.setImageResource(R.drawable.moeda_cara)
            img2.setImageResource(R.drawable.moeda_coroa)
            img3.setImageResource(R.drawable.moeda_cara)
        }


        button_voltar.setOnClickListener{
            finish()
        }

    }
}
