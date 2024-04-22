package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.LocalSerifOsf
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Android")
                }
            }
        }
    }
}



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hello $name!", modifier = modifier, style = LocalSerifOsf.current.bold)
        Text(text = "Hello $name!", modifier = modifier, style = LocalSerifOsf.current.boldItalic)
        Text(text = "Hello $name!", modifier = modifier, style = LocalSerifOsf.current.extraBold)
        Text(text = "Hello $name!", modifier = modifier, style = LocalSerifOsf.current.extraBoldItalic)
        Text(text = "Hello $name!", modifier = modifier, style = LocalSerifOsf.current.light)
        Text(text = "Hello $name!", modifier = modifier, style = LocalSerifOsf.current.lightItalic)
        Text(text = "Hello $name!", modifier = modifier, style = LocalSerifOsf.current.regular)
        Text(text = "Hello $name!", modifier = modifier, style = LocalSerifOsf.current.regularItalic)
        Text(text = "Hello $name!", modifier = modifier, style = LocalSerifOsf.current.semiBold)
        Text(text = "Hello $name!", modifier = modifier, style = LocalSerifOsf.current.semiBoldItalic)
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}