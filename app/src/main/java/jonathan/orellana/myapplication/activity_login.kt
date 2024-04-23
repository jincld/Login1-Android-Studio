package jonathan.orellana.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //Mandar a llamar a todos los elementos
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)

        //Programar al botón
        btnRegistrar.setOnClickListener {
            //Navegar entre pnatallas
            //Ir a la activity de registro
            val pantallaSiguiente = Intent(this, activity_registrar::class.java)
            startActivity(pantallaSiguiente)
        }

        //Mandar a llamar a todos los elementos
        val btnIngresar = findViewById<Button>(R.id.btnIngresar)

        //Programar al botón
        btnIngresar.setOnClickListener {
            //Navegar entre pnatallas
            //Ir a la activity de registro
            val pantallaSiguiente = Intent(this, MainActivity::class.java)
            startActivity(pantallaSiguiente)
        }
    }
}