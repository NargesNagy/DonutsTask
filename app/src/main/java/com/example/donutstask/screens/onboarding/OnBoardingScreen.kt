package com.example.donutstask.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutstask.R
import com.example.donutstask.ui.theme.*

@Composable
fun OnBoardingScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color = Rose_3)) {

        Image(
            painter = painterResource(id = R.drawable.image_splash),
            contentDescription = null,
            modifier = Modifier
        )

        Box(
            modifier = Modifier
                .align(Alignment.BottomCenter),
        ) {
            Column(
                modifier = Modifier.padding(horizontal = 40.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Gonuts\n with\n Donuts",
                    color = Rose_1, fontSize = 54.sp, style = Typography.body1
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
                    maxLines = 4, color = Rose_2, style = Typography.body2
                )

                Spacer(modifier = Modifier.height(32.dp))

                Button(
                    onClick = { },
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(50.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = White,
                        contentColor = Black
                    )

                ) {
                    Text(
                        text = "Get Started", style = Typography.body2,
                        modifier = Modifier.padding(vertical = 16.dp)
                    )
                }

            }
        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewPager() {
    OnBoardingScreen()
}
