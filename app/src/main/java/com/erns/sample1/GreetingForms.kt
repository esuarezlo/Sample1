package com.erns.sample1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GreetingForms(modifier: Modifier = Modifier) {
    val textfieldName = remember {
        mutableStateOf("")
    }

    val textDisplay = remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.padding(top = 40.dp, start = 10.dp, end = 10.dp)) {
        Text(text = "Hello World")
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            OutlinedTextField(
                value = textfieldName.value,
                onValueChange = { text ->
                    textfieldName.value = text
                },
                label = { Text(text = "Nombre") }

            )
            Button(onClick = { textDisplay.value = textfieldName.value }) {
                Text(text = "Click")
            }
        }
        Text(text = "Display 1: ${textfieldName.value}")
        Text(text = "Display 2: ${textDisplay.value}")

    }
}