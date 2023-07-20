package com.example.donutstask.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutstask.R
import com.example.donutstask.screens.home.composable.cardItem
import com.example.donutstask.ui.theme.*

@Composable
fun DetailsScreen (){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Rose_3)) {

        Column(modifier = Modifier.fillMaxSize()) {
            Row(modifier = Modifier.weight(.8f)) {
                Image(
                    painter = painterResource(id = R.drawable.donut6),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }

            Row(modifier = Modifier
                .weight(1.2f)
                .fillMaxWidth()
                .background(
                    color = White,
                    shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
                )
            ) {
                Column(modifier = Modifier.padding(32.dp)) {
                    Text(text = "Strawberry Wheel",
                        style = Typography.button.copy(fontSize = 30.sp), color = Rose_1
                    )

                    Spacer(modifier = Modifier.height(24.dp))

                    Text(
                        text = "About Gonut",
                        style = Typography.body2.copy(fontSize = 18.sp), color = Black
                    )

                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                        style = Typography.body2.copy(fontSize = 14.sp), color = Gray, maxLines = 5
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Text(
                        text = "Quantity",
                        style = Typography.body2.copy(fontSize = 18.sp), color = Black
                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {

                        Button(
                            onClick = { },
                            modifier = Modifier.padding(8.dp),
                            shape = RoundedCornerShape(16.dp),
                            border = null,
                                colors = ButtonDefaults.buttonColors(backgroundColor = White, contentColor = Black)

                        ) {

                                Text(text = "-", color = Black,
                                    style = Typography.body1.copy(fontSize = 20.sp))

                        }

                        Button(
                            onClick = { },
                            modifier = Modifier.padding(8.dp),
                            shape = RoundedCornerShape(16.dp),
                            border = null,
                            colors = ButtonDefaults.buttonColors(backgroundColor = White, contentColor = Black)

                        ) {

                            Text(text = "1", color = Black,
                                style = Typography.body1.copy(fontSize = 20.sp))

                        }

                        Button(
                            onClick = { },
                            modifier = Modifier.padding(8.dp),
                            shape = RoundedCornerShape(16.dp),
                            border = null,
                            colors = ButtonDefaults.buttonColors(backgroundColor = Black, contentColor = White)

                        ) {

                            Text(text = "+", color = White,
                                style = Typography.button.copy(fontSize = 20.sp))

                        }

                    }

                    Spacer(modifier = Modifier.height(16.dp))

                    Row(modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "$16",
                            style = Typography.button.copy(fontSize = 30.sp), color = Black
                        )

                        Button(
                            onClick = { },
                            modifier = Modifier.padding(8.dp),
                            shape = RoundedCornerShape(50.dp),
                            border = null,
                            colors = ButtonDefaults.buttonColors(backgroundColor = Rose_1, contentColor = White)

                        ) {

                            Text(text = "Add To cart", color = White,
                                style = Typography.button.copy(fontSize = 20.sp),
                                modifier = Modifier.padding(horizontal = 50.dp, vertical = 16.dp)
                            )

                        }

                    }

                }
            }
        }


    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewDetailsScreen() {
    DetailsScreen()
}