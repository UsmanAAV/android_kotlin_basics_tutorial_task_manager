package com.example.android_tutorial_task_manager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_tutorial_task_manager.ui.theme.Android_tutorial_task_managerTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android_tutorial_task_managerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainLayout()
                }
            }
        }
    }
}

@Composable
fun MainLayout(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.ic_task_completed)
    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = image, contentDescription = stringResource(id = R.string.ic_task_completed_description))
        Text(
            text = stringResource(id = R.string.all_task_completed),
            fontSize = 16.sp,
            fontWeight = Bold,
            modifier = modifier.padding(0.dp, 24.dp, 0.dp, 8.dp)
        )
        Text(
            text = stringResource(id = R.string.nice_work),
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Android_tutorial_task_managerTheme {
        MainLayout()
    }
}