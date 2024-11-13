package com.erns.sample1.foods


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.erns.sample1.foods.model.FoodEntity


@Composable
fun DetailDialog(
    openDialogState: MutableState<Boolean>,
    itemsEntity: List<FoodEntity>,
    callback: (FoodEntity) -> Unit
) {

    Dialog(
        onDismissRequest = { openDialogState.value = false }
    ) {

        Surface(
            shape = RoundedCornerShape(8.dp),
            color = Color.White,
            modifier = Modifier.height(240.dp)
        ) {
            LazyColumn(
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(40.dp)
                            .background(color = Color.Gray),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Categorias"
                        )
                    }
                }

                items(itemsEntity) {
                    Row(modifier = Modifier
                        .height(46.dp)
                        .fillMaxWidth()
                        .clickable {
                            callback(it)
                            openDialogState.value = false
                        }
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Text(
                                text = it.Nombre,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .wrapContentHeight(Alignment.CenterVertically),
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    Divider(color = Color(0xFFCAD3DB), thickness = 1.dp)

                }

            }

        }
    }

}

