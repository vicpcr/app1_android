package com.example.app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.app1.databinding.ActivityLoginBinding
import com.example.app1.databinding.ActivityMainBinding
import org.w3c.dom.Text

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_login)
        //val user = findViewById<TextView>(R.id.txtUser)
        //val pass = findViewById<TextView>(R.id.txtPwd)
        //val btnLogin = findViewById<Button>(R.id.btnIngresar)

        //forma de view Binding
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnIngresar.setOnClickListener() {
            var usuario: String = (binding.txtUser.text.toString())
            var contra: String = (binding.txtPwd.text.toString())
            if (usuario == "victor123" && contra == "1711") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else if (usuario == "brenda" && contra == "123") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Usuario y/o contraseña incorrecta", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

