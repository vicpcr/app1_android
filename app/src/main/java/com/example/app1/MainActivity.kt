package com.example.app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.app1.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private var backPressedTime = 0L

    override fun onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()){
            super.onBackPressed()
        }else{
            Toast.makeText(this, "Presione atrás nuevamente para salir de la aplicación",Toast.LENGTH_SHORT).show()
        }
        backPressedTime = System.currentTimeMillis()
    }
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //val num1 = findViewById<TextView>(R.id.txtNum1)
        //val num2:TextView = findViewById(R.id.txtNum2)
        //val boton1:Button = findViewById(R.id.btnSum)
        //val boton2:Button = findViewById(R.id.btnRes)
        //val boton3:Button = findViewById(R.id.btnMul)
        //val boton4:Button = findViewById(R.id.btnDiv)
        //val resul:TextView = findViewById(R.id.txtResul)
        //val cerrar = findViewById<Button>(R.id.btnClose)

        //aqui empezamos a apicar el view Banding

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnClose.setOnClickListener(){
            val intento = Intent(this, LoginActivity::class.java)
            Toast.makeText(this, "Sesión cerrada con éxito, vuelva pronto", Toast.LENGTH_SHORT).show()
            startActivity(intento)


        }

        binding.btnSum.setOnClickListener(){
            var x:String = (binding.txtNum1.text.toString())
            var y:String = (binding.txtNum2.text.toString())
            var z = (x.toFloat() + y.toFloat())
            binding.txtResul.setText("LA SUMA DE LOS NUMEROS DA: " + z.toString())
        }

        binding.btnRes.setOnClickListener(){
            var x:String = (binding.txtNum1.text.toString())
            var y:String = (binding.txtNum2.text.toString())
            var z = (x.toFloat() - y.toFloat())
            binding.txtResul.setText("LA RESTA DE LOS NUMEROS DA: " + z.toString())
        }

        binding.btnMul.setOnClickListener(){
            var x:String = (binding.txtNum1.text.toString())
            var y:String = (binding.txtNum2.text.toString())
            var z = (x.toFloat() * y.toFloat())
            binding.txtResul.setText("LA MULTIPLICACIÓN DE LOS NUMEROS DA: " + z.toString())
        }

        binding.btnDiv.setOnClickListener(){
            var x:String = (binding.txtNum1.text.toString())
            var y:String = (binding.txtNum2.text.toString())
            var z = (x.toFloat() / y.toFloat())
            binding.txtResul.setText("LA DIVISIÓN DE LOS NUMEROS DA: " + z.toString())
        }



    }
}