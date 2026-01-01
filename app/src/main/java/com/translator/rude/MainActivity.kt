// test com.translator.rude

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tv = TextView(this).apply {
            text = "Translator RU ⇄ DE\n(первый запуск)"
            textSize = 22f
            setPadding(40, 80, 40, 40)
        }
        setContentView(tv)
    }
}
// test
