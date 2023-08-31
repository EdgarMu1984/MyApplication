package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        val nombre = findViewById<EditText>(R.id.txtnombre)
        val nombre2 = findViewById<EditText>(R.id.txtnombre2)
        val resultado = findViewById<EditText>(R.id.txtresultado)
        val sendButton = findViewById<Button>(R.id.btnguardar)

        /*sendButton.setOnClickListener {
            Log.d("MainActivity", "Button Clicked")
        }*/
        sendButton.setOnClickListener {

            if (nombre.equals(nombre2)) {
                resultado.setText("CORRECTO");
            }
                resultado.setText("INCORRECTO");
            }
        }
    }
}

/*
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}

 */