package com.example.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    //Text(text = "Hello $name!")
    Column() {
        Image(painter = painterResource(id = R.drawable.logo), contentDescription ="background",modifier = Modifier.padding(10.dp,20.dp) )

        Box()
        {
            Text(text = "Tejas Koli", color = Color(56, 112, 179, 255), modifier = Modifier.padding(160.dp,6.dp).fillMaxSize(), fontWeight = FontWeight.Bold)
            Image(painter= painterResource(id = R.drawable.heart),contentDescription ="front" ,modifier = Modifier.padding(180.dp, 48.dp).size(60.dp))
            Text(text = "Jetpack Compose",color= Color(8,48,66,255),modifier = Modifier.padding(130.dp, 130.dp).fillMaxSize(),fontWeight = FontWeight.Bold)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTheme {
        Greeting()
    }
}