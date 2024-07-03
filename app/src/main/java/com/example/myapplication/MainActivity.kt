package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //sentenciaWhen()
        // myCalculator()
        mapStructure()
        bucles()
        var resposta = saludar("Jordan")
        println("My answer: " + resposta)
        saludar("George")
        saludar("David")

        // Create Users
        crearUsuari()

        // Reference the TextView from the layout
        val resultTextView: TextView = findViewById(R.id.myCalculator)

        // Call myCalculator function to get the result
        val result = myCalculator()

        // Set the result to the TextView
        resultTextView.text = "Result: $result"


    }
}

//private fun sentenciaWhen() {
//    val nota = 8
//
//    when (nota) {
//        in 0..4 -> {
//            println("Suspès")
//        }
//        in 5..10 -> {
//            println("Notable")
//        }
//        else -> {
//            println("No conec la nota")
//        }
//    }
//}

private fun myCalculator(): Int {
    var x = 15
    var y = 2
    return x + y
}

private fun mapStructure(){
    var myMaps: Map<String, Int> = mapOf()
    println("HELOOOOOOOOOOOOOOOOO" + myMaps)
    myMaps = mapOf("Joan" to 5, "Iria" to 3, "Iv" to 9)
    println(myMaps)
    println(myMaps["Iria"])


    var mutableMap = mutableMapOf("Lorena" to 4, "Ilia" to 5, "David" to 6)
    println("mutableMap="+ mutableMap)

    mutableMap.put("Gabriela", 7)
    println("mutableMap="+ mutableMap)
}

private fun bucles() {
    var cities : List<String> = listOf("Paris", "Barcelona",
        "London", "Munich", "New York")
    var temperatures : List<Int> = listOf(21, 33, 41, 36, 12)

    for (city: String in cities) {
        println(city)
    }

    var temperatures1 : MutableMap<String, Int> = mutableMapOf(
        "Paris" to 21,
        "Barcelona" to 33,
        "London" to 41,
        "Munich" to 36,
        "New York" to 12
    )
    println("Temperatures using dictionary = "+ temperatures1)

    for (temperature: MutableMap.MutableEntry<String, Int> in temperatures1){
        println("Temperature of ${temperature.key} is ${temperature.value}")
    }

    for (table:Int in 0 ..  10) {
        println("6 x " + table + " = " + (table * 6))
    }

    for (table:Int in 0 until  10) {
        println("8 x " + table + " = " + (table * 8))
    }

    for (table:Int in 0 .. 10 step 2) {
        println("2 x " + table + " = " + (table * 2))
    }

    for (table:Int in 10 downTo 0) {
        println("Table downto " + table)
    }

    var pisos:IntRange = (0 .. 20)
    for(pis: Int in pisos){
        println("Estic el pis " + pis)
    }

    //While
    var pisAscensor = 0
    var pisDesitjat  = 4

    while(pisAscensor < pisDesitjat) {
        println("We are in floor: " + pisAscensor )
        pisAscensor ++
    }
    println("Final floor " + pisAscensor)

}

private fun saludar(name: String) : String{
    println("Hello Class! My name is ${name}")
    return "Hello Class! My name is ${name}"
}

private fun crearUsuari(){
    var nomUsuari = Usuari("admin", "123456", 1)
    println("User: " + nomUsuari.usuari)
    nomUsuari.rol = 2
    println("User rol: " + nomUsuari.rol)
}