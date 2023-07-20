package com.example.donutstask.screens.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutstask.R
import com.example.donutstask.screens.home.HomeScreen
import com.example.donutstask.ui.theme.*


@Composable
fun cardItem(painter: Painter, color: Color, onClick: () -> Unit) {

    Box() {
        Column(
            modifier = Modifier
                .width(193.dp)
                .height(310.dp)
                .clickable { onClick }
                .background(color = color, shape = RoundedCornerShape(16.dp))
                .padding(end = 32.dp)

        ) {

            Row() {
                Icon(
                    painter = painterResource(id = R.drawable.ic_favorite_border_24),
                    contentDescription = null,
                    tint = Rose_1,
                    modifier = Modifier
                        .padding(start = 16.dp , top = 16.dp)
                        .clip(CircleShape)
                        .background(White)
                        .padding(8.dp)
                )
            }

            Row() {
                Image(
                    painter = painter,//painterResource(id = R.drawable.donut6),
                    contentDescription = null,
                    modifier = Modifier
                        .size(110.dp)
                        .offset(120.dp),
                    contentScale = ContentScale.Fit
                )
            }

            Row(modifier = Modifier.padding(start = 20.dp, end = 16.dp)) {
                Column() {
                    Text(
                        text = "Strawberry Wheel",
                        style = Typography.body2.copy(fontSize = 16.sp),
                        color = Black
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                        style = Typography.body2.copy(fontSize = 12.sp), color = Gray, maxLines = 3
                    )
                    Spacer(modifier = Modifier.height(8.dp))

                    Row(modifier = Modifier.align(Alignment.End),
                    horizontalArrangement = Arrangement.Center
                        )
                    {
                        Text(
                            text = "\$20",
                            style = Typography.button.copy(fontSize = 14.sp),
                            color = Gray,
                            modifier = Modifier.align(Alignment.Bottom)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "$16",
                            style = Typography.button.copy(fontSize = 22.sp),
                            color = Black,
                            modifier = Modifier.align(Alignment.Bottom)
                        )
                    }
                }
            }


        }


        

    }


}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewCardItem() {
    cardItem(painterResource(id = R.drawable.donut1), Plue, {})
}