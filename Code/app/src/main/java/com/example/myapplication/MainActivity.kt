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
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.AppTopographyTwo
import com.example.myapplication.ui.theme.EconomistTopography
import com.example.myapplication.ui.theme.LocalSansLfProvider
import com.example.myapplication.ui.theme.LocalSansOsfProvider
import com.example.myapplication.ui.theme.LocalSansScProvider
import com.example.myapplication.ui.theme.LocalSerifLfProvider
import com.example.myapplication.ui.theme.LocalSerifOsfProvider
import com.example.myapplication.ui.theme.LocalSerifScProvider
import com.example.myapplication.ui.theme.LocalSundayClarendonLfProvider
import com.example.myapplication.ui.theme.LocalSundayClarendonOsfProvider
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompositionLocalProvider(
                // FONT-GROUP: Serif
                LocalSerifOsfProvider provides AppTopographyTwo.Serif.Osf.PrimarySerifOsf(),
                LocalSerifScProvider provides AppTopographyTwo.Serif.Sc.PrimarySerifSc(),
                LocalSerifLfProvider provides AppTopographyTwo.Serif.Lf.PrimarySerifLf(),
                // FONT-GROUP: Serif
                LocalSansOsfProvider provides AppTopographyTwo.Sans.Osf.PrimarySansOsf(),
                LocalSansScProvider provides AppTopographyTwo.Sans.Sc.PrimarySansSc(),
                LocalSansLfProvider provides AppTopographyTwo.Sans.Lf.PrimarySansLf(),
                // FONT-GROUP: Sunday Clarendon
                LocalSundayClarendonOsfProvider provides AppTopographyTwo.SundayClarendon.Osf.Secondary1843Osf(),
                LocalSundayClarendonLfProvider provides AppTopographyTwo.SundayClarendon.Lf.Secondary1843Lf()
            ) {
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
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = EconomistTopography.primarySerifOsf.light
        )
        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = EconomistTopography.primarySerifOsf.lightItalic
        )
        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = EconomistTopography.primarySerifOsf.regular
        )
        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = EconomistTopography.primarySerifOsf.regularItalic
        )
        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = EconomistTopography.primarySerifOsf.medium
        )
        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = EconomistTopography.primarySerifOsf.mediumItalic
        )
        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = EconomistTopography.primarySerifOsf.semiBold
        )
        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = EconomistTopography.primarySerifOsf.semiBoldItalic
        )
        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = EconomistTopography.primarySerifOsf.bold
        )
        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = EconomistTopography.primarySerifOsf.boldItalic
        )
        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = EconomistTopography.primarySerifOsf.extraBold
        )
        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = EconomistTopography.primarySerifOsf.extraBoldItalic
        )
        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = EconomistTopography.primarySerifOsf.black
        )
        Text(
            text = "Hello $name!",
            modifier = modifier,
            style = EconomistTopography.primarySerifOsf.blackItalic
        )

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}