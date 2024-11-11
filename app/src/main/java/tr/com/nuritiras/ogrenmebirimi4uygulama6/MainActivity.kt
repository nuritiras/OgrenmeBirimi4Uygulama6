package tr.com.nuritiras.ogrenmebirimi4uygulama6

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun onayla(view: View) {
        val ay = findViewById<EditText>(R.id.editTextNumber_Ay).text.toString().toInt()
        var sonuc:String =""
        when (ay) {
            1 -> sonuc = "Ocak"
            2 -> sonuc = "Şubat"
            3 -> sonuc = "Mart"
            4 -> sonuc = "Nisan"
            5 -> sonuc = "Mayıs"
            6 -> sonuc = "Haziran"
            7 -> sonuc = "Temmuz"
            8 -> sonuc = "Ağustos"
            9 -> sonuc = "Eylül"
            10 -> sonuc = "Ekim"
            11 -> sonuc = "Kasım"
            12 -> sonuc = "Aralık"
            else -> sonuc = "Hatalı Giriş"
        }
        findViewById<TextView>(R.id.textViewSonuc).text = sonuc
    }
}