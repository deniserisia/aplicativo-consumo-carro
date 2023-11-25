package com.drc.appcarroconsumo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.drc.appcarroconsumo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        binding.buttonResultado.setOnClickListener(this)
    }
    override fun onClick(view: View){
        if (view.id == R.id.buttonResultado){
            calcularResultado()
        }
    }
    private fun calcularResultado(){
        val distancia = binding.textDistancia.text.toString().toFloat()
        val preco = binding.totalPreco.text.toString().toFloat()
        val autonomia = binding.textAutonomia.text.toString().toFloat()

        val valorTotal = (preco * distancia) / autonomia

        //val valorTotalStr = "R$ ${"%.2f" .format(valorTotal)}"

        binding.textResultado2.text = "R$ ${"%.2f" .format(valorTotal)}"
        //Toast.makeText(this, valorTotalStr, Toast.LENGTH_SHORT).show()
    }
}