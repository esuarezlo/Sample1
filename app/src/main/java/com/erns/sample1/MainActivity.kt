package com.erns.sample1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.erns.sample1.foods.model.Datasource
import com.erns.sample1.foods.FoodScreen
import com.erns.sample1.ui.theme.Sample1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Sample1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->


//                    val datasource = Datasource(this)
//                    datasource.loadData()
//                    FoodScreen(modifier = Modifier.padding(innerPadding), datasource)

                    //SampleLayouts(modifier = Modifier.padding(innerPadding))

                    GreetingFormsLambda(
                        modifier = Modifier.padding(innerPadding)
                    )

//                    GreetingForms(
//                        modifier = Modifier.padding(innerPadding)
//                    )

//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
                }
            }
        }
    }
}


//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hi $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    Sample1Theme {
//        Greeting("Android")
//    }
//}

