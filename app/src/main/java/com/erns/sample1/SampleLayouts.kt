package com.erns.sample1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
//import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun SampleLayouts(modifier: Modifier = Modifier) {
//Spacer(modifier = Modifier.padding(top = 40.dp))
    //    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(color = Color.Cyan)
//            .padding(start = 10.dp, top = 40.dp),
//        verticalArrangement = Arrangement.spacedBy(10.dp)
//    ) {
    //ArtistCard()
//        Divider(color = Color(0xFFD500F9), thickness = 1.dp)
    //ArtistCardColumn()
//        Divider(color = Color(0xFFD500F9), thickness = 1.dp)
    //ArtistCardRow()
//        Divider(color = Color(0xFFD500F9), thickness = 1.dp)
        ArtistAvatar()
    // }
}

@Composable
fun ArtistCard() {
    Text("Alfred Sisley")
    Text("3 minutes ago")
}

@Composable
fun ArtistCardColumn() {
    Column {
        Text("Alfred Sisley")
        Text("3 minutes ago")
    }
}

@Composable
fun ArtistCardRow() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(top = 40.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.tuna),
            contentDescription = "tuna",
        )
        Column {
            Text("Tuna")
            Text("Morada")
        }
    }
}

@Composable
fun ArtistAvatar() {
    Box(
        modifier = Modifier
            .padding(top = 40.dp)
            .border(
                width = 1.dp,
                color = Color.Red,
                shape = RoundedCornerShape(12.dp)
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.tuna),
            contentDescription = "tuna",
            modifier = Modifier.align(Alignment.Center)
        )
        Icon(
            Icons.Filled.Check,
            contentDescription = "Check mark",
            modifier = Modifier.align(Alignment.BottomEnd)
        )
    }
}