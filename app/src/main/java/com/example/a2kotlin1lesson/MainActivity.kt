package com.example.a2kotlin1lesson

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn)
        button.setOnClickListener {
            Toast.makeText(this, "Просто кнопка", Toast.LENGTH_SHORT).show()
        }

        val data1 = FirstDataClass(1, 10.0)
        val data2 = FirstDataClass(1, 10.0)
        val data3: FirstDataClass = data1.copy()

        val data4 = SecondDataClass(12)
        val data5 = data4.copy(b = 1)

        println(data1)
        println(data2)
        println(data3)
        println(data4)
        println(data5)

        fun equals(data1: FirstDataClass, data2: FirstDataClass) {
            if (data1 == data2) {
                Toast.makeText(this, "data1 и data2 равны", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "data1 и data2 не равны", Toast.LENGTH_SHORT).show()
            }
        }

        val buttonEquals = findViewById<Button>(R.id.btn_equals)
        buttonEquals.setOnClickListener {
            equals(data1, data2)
        }

        val textView = findViewById<TextView>(R.id.textView)

        textView.text = data3.toString()

        for (i in 1..10) {
            println(i.toString())
        }

        for (i in 10 downTo 0 step 2) {
            println(i.toString())
        }

        for (i in 0 until 10) {
            println(i.toString())
        }

        val person = Person("Ivan", "Ivanov", 45)
        person.printMethod()
        person.firstName = "Petr"
        person.printMethod()
    }
}