package com.example.firstappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado.*
import kotlin.random.Random


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
            img1.setImageResource(R.drawable.moeda_coroa)
            img2.setImageResource(R.drawable.moeda_coroa)
            img3.setImageResource(R.drawable.moeda_coroa)
            tV1.setText("Coroa")
            tv2.setText("Coroa")
            tv3.setText("Coroa")
        }else if(numero==1 && n2==1 && n3==1) {
            img1.setImageResource(R.drawable.moeda_cara)
            img2.setImageResource(R.drawable.moeda_cara)
            img3.setImageResource(R.drawable.moeda_cara)
            tV1.setText("Cara")
            tv2.setText("Cara")
            tv3.setText("Cara")
        }else if(numero==0 && n2==1 && n3==1) {
            img1.setImageResource(R.drawable.moeda_coroa)
            img2.setImageResource(R.drawable.moeda_cara)
            img3.setImageResource(R.drawable.moeda_cara)
            tV1.setText("Coroa")
            tv2.setText("Cara")
            tv3.setText("Cara")
        }else if(numero==0 && n2==0 && n3==1) {
            img1.setImageResource(R.drawable.moeda_coroa)
            img2.setImageResource(R.drawable.moeda_coroa)
            img3.setImageResource(R.drawable.moeda_cara)
            tV1.setText("Coroa")
            tv2.setText("Coroa")
            tv3.setText("Cara")
        }else if(numero==1 && n2==1&& n3==0) {
            img1.setImageResource(R.drawable.moeda_cara)
            img2.setImageResource(R.drawable.moeda_cara)
            img3.setImageResource(R.drawable.moeda_coroa)
            tV1.setText("Cara")
            tv2.setText("Cara")
            tv3.setText("Coroa")
        }else if(numero==1 && n2==0 && n3==0) {
            img1.setImageResource(R.drawable.moeda_cara)
            img2.setImageResource(R.drawable.moeda_coroa)
            img3.setImageResource(R.drawable.moeda_coroa)
            tV1.setText("Cara")
            tv2.setText("Coroa")
            tv3.setText("Coroa")
        }else if(numero==1 && n2==0 && n3==1) {
            img1.setImageResource(R.drawable.moeda_cara)
            img2.setImageResource(R.drawable.moeda_coroa)
            img3.setImageResource(R.drawable.moeda_cara)
            tV1.setText("Cara")
            tv2.setText("Coroa")
            tv3.setText("Cara")
        }else if(numero==0 && n2==1 && n3==0) {
            img1.setImageResource(R.drawable.moeda_coroa)
            img2.setImageResource(R.drawable.moeda_cara)
            img3.setImageResource(R.drawable.moeda_coroa)
            tV1.setText("Coroa")
            tv2.setText("Cara")
            tv3.setText("Coroa")
        }


        play.setOnClickListener{
            var numero = Random.nextInt(2) //gerando um nuemro randomico até 1 ( ou seja, 0 ou 1)
            var n2 = Random.nextInt(2)
            var n3 = Random.nextInt(2)

            if(numero==0 && n2==0 && n3==0){
                img1.setImageResource(R.drawable.moeda_coroa)
                img2.setImageResource(R.drawable.moeda_coroa)
                img3.setImageResource(R.drawable.moeda_coroa)
                tV1.setText("Coroa")
                tv2.setText("Coroa")
                tv3.setText("Coroa")
            }else if(numero==1 && n2==1 && n3==1) {
                img1.setImageResource(R.drawable.moeda_cara)
                img2.setImageResource(R.drawable.moeda_cara)
                img3.setImageResource(R.drawable.moeda_cara)
                tV1.setText("Cara")
                tv2.setText("Cara")
                tv3.setText("Cara")
            }else if(numero==0 && n2==1 && n3==1) {
                img1.setImageResource(R.drawable.moeda_coroa)
                img2.setImageResource(R.drawable.moeda_cara)
                img3.setImageResource(R.drawable.moeda_cara)
                tV1.setText("Coroa")
                tv2.setText("Cara")
                tv3.setText("Cara")
            }else if(numero==0 && n2==0 && n3==1) {
                img1.setImageResource(R.drawable.moeda_coroa)
                img2.setImageResource(R.drawable.moeda_coroa)
                img3.setImageResource(R.drawable.moeda_cara)
                tV1.setText("Coroa")
                tv2.setText("Coroa")
                tv3.setText("Cara")
            }else if(numero==1 && n2==1&& n3==0) {
                img1.setImageResource(R.drawable.moeda_cara)
                img2.setImageResource(R.drawable.moeda_cara)
                img3.setImageResource(R.drawable.moeda_coroa)
                tV1.setText("Cara")
                tv2.setText("Cara")
                tv3.setText("Coroa")
            }else if(numero==1 && n2==0 && n3==0) {
                img1.setImageResource(R.drawable.moeda_cara)
                img2.setImageResource(R.drawable.moeda_coroa)
                img3.setImageResource(R.drawable.moeda_coroa)
                tV1.setText("Cara")
                tv2.setText("Coroa")
                tv3.setText("Coroa")
            }else if(numero==1 && n2==0 && n3==1) {
                img1.setImageResource(R.drawable.moeda_cara)
                img2.setImageResource(R.drawable.moeda_coroa)
                img3.setImageResource(R.drawable.moeda_cara)
                tV1.setText("Cara")
                tv2.setText("Coroa")
                tv3.setText("Cara")
            }else if(numero==0 && n2==1 && n3==0) {
                img1.setImageResource(R.drawable.moeda_coroa)
                img2.setImageResource(R.drawable.moeda_cara)
                img3.setImageResource(R.drawable.moeda_coroa)
                tV1.setText("Coroa")
                tv2.setText("Cara")
                tv3.setText("Coroa")
            }


        }
    }
}
