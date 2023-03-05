package com.example.accountuijetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.accountuijetpackcompose.ui.InformationCard
import com.example.accountuijetpackcompose.ui.SpacerVertical
import com.example.accountuijetpackcompose.ui.theme.Orange

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          mainScreenUI()
        }
    }

    @Composable
    @Preview(showSystemUi = true)
    fun mainScreenUI(){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 12.dp, vertical = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextHeader(title = "Account", subTite = "Edit or manage your profile")
            SpacerVertical(32)
            Image(
                modifier = Modifier
                    .size(180.dp, 160.dp)
                    .clip(RoundedCornerShape(30.dp)),
                painter = painterResource(id = R.drawable.profileimage),
                contentDescription = "profile image"
            )
            SpacerVertical(value = 16)
            Text(text = "Change profile picture", color = Orange, fontSize = 18.sp)
            SpacerVertical(value = 32)

            Row(Modifier.fillMaxWidth()) {
                InformationCard(name = "First Name", information = "Eslam", modifier = Modifier
                    .weight(1f)
                    .padding(end = 10.dp))
                InformationCard(name = "Last Name", information = "Ahmed", modifier = Modifier.weight(1f))
            }
            SpacerVertical(value = 10)
            InformationCard(name = "Location", information = "shoubra,Cairo")
            SpacerVertical(value = 10)
            InformationCard(name = "Email", information = "EslamAhmed@gmail.com")
            SpacerVertical(value = 10)
            InformationCard(name = "Phone", information = "+02 01120541681")
            SpacerVertical(value = 30)
            Button(onClick = {  },Modifier.fillMaxWidth(), colors = ButtonDefaults.buttonColors(
                Color.Green)) {

                Text(text = "Save")
                
            }
        }
    }
}

