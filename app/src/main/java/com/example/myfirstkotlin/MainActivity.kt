package com.example.myfirstkotlin

import android.os.Bundle
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
import com.example.myfirstkotlin.ui.theme.MyFirstKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyFirstKotlinTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // variable mutable, it can changed
    var year:Int=2024
    year++
    // variable immutable, constant
    val message:String="in"

    Text(
        // concatentate string templates
        text = "${getGreeting()} $name! $message $year",
        modifier = modifier
    )
}

fun getGreeting(): String {
    return "Hello"
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyFirstKotlinTheme {
        Greeting("Android")
    }
}