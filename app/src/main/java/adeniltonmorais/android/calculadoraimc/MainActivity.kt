package adeniltonmorais.android.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bttonNcd = findViewById<Button>(R.id.button_ncd)
        button_ncd.setOnClickListener{
            val abrirNcd= Intent(this, NecessidadeCaloricaActivity::class.java)
            startActivity(abrirNcd)
        }
    }
}