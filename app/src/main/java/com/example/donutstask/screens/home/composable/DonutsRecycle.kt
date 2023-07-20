package com.example.donutstask.screens.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutstask.R
import com.example.donutstask.ui.theme.*
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun donutsRecycleItem(painter: Painter, donutName: String, donutPrice: String) {

    Box(
        modifier = Modifier
    ) {
        Column(
            modifier = Modifier.padding(16.dp).size(width = 138.dp, height = 111.dp )
                .clickable { }
                .background(color = White, shape = RoundedCornerShape(16.dp)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {

            Text(
                text = donutName, //"Chocolate Cherry",
                style = Typography.body2.copy(fontSize = 14.sp), color = Gray, maxLines = 1,
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = donutPrice,//"$22",
                modifier = Modifier.padding(bottom = 16.dp),
                style = Typography.body2.copy(fontSize = 14.sp), color = Rose_1, maxLines = 1
            )
        }
        Image(
            painter = painter, //painterResource(id = R.drawable.donut4),
            contentDescription = null,
            modifier = Modifier
                .size(110.dp)
                .offset(30.dp, -30.dp),
        )

    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewDonutsRecycle() {
    //donutsRecycleItem()
}