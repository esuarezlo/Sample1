package com.erns.sample1.foods

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.erns.sample1.foods.model.Datasource
import com.erns.sample1.foods.model.FoodEntity

@Composable
fun FoodScreen(modifier: Modifier = Modifier,datasource: Datasource) {
    val data = datasource.loadData()
    if (data != null) {
        FoodScreenView(foodData = data)
    }
}

@Composable
fun FoodScreenView(foodData: List<FoodEntity>) {
    LazyColumn() {
        items(foodData) {
            Row {
                Text(text = it.Codigo)
                Text(text = it.Nombre)
                Text(text = it.Grasa)
            }
        }
    }
}