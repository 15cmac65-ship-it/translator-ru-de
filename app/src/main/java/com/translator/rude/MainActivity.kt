package com.translator.rude

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 80, 40, 40)
        }

        val input = EditText(this).apply {
            hint = "Введите текст (RU)"
        }

        val button = Button(this).apply {
            text = "Перевести"
        }

        val output = TextView(this).apply {
            textSize = 18f
        }

        button.setOnClickListener {
            val text = input.text.toString().lowercase()
            output.text = when (text) {
                "привет" -> "Hallo"
                "как дела" -> "Wie geht's?"
                else -> "Перевод пока не найден"
            }
        }

        layout.addView(input)
        layout.addView(button)
        layout.addView(output)

        setContentView(layout)
    }
}
