package com.example.myuipertama.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myuipertama.R



@Composable
fun Profileku(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 100.dp),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp)
        ) {

            Image(
                painterResource(R.drawable.akuasli),
                contentDescription = "Foto Profil",
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(10.dp))

            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically //
            ) {
                Image(
                    painterResource(R.drawable.facebook),
                    contentDescription = "Facebook",
                    modifier = Modifier.size(45.dp)
                )
                Image(
                    painterResource(R.drawable.gmail),
                    contentDescription = "Gmail",
                    modifier = Modifier.size(28.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painterResource(R.drawable.instagram),
                    contentDescription = "Instagram",
                    modifier = Modifier.size(45.dp)
                )
                Image(
                    painterResource(R.drawable.linkedin),
                    contentDescription = "LinkedIn",
                    modifier = Modifier.size(45.dp)
                )
            }

            Text(
                stringResource(R.string.name),
                color = Color.Black,
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                stringResource(R.string.username),
                color = Color.Gray,
                fontSize = 18.sp
            )

            Text(
                stringResource(R.string.job),
                color = Color.Black,
                fontSize = 18.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(16.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(10  .dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.DarkGray
                )
            ) {
                Row (){
                    val gambar = painterResource(R.drawable.privasi)
                    Image(
                        painter = gambar,
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp)
                            .padding(3.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Row() {
                        Text(
                            stringResource(R.string.privacy),
                            color = Color.White,
                            fontSize = 16.sp,
                            modifier = Modifier.padding(top = 15.dp)
                        )
                        Spacer(modifier = Modifier.width(180.dp))
                        val gambar = painterResource(R.drawable.play)
                        Image(
                            painter = gambar,
                            contentDescription = null,
                            modifier = Modifier
                                .size(50.dp)
                                .padding(3.dp)
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(10  .dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.DarkGray
                )
            ) {
                Row (){
                    val gambar = painterResource(R.drawable.riwayat)
                    Image(
                        painter = gambar,
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp)
                            .padding(3.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Row() {
                        Text(
                            stringResource(R.string.riwayat),
                            color = Color.White,
                            fontSize = 16.sp,
                            modifier = Modifier.padding(top = 15.dp)
                        )
                        Spacer(modifier = Modifier.width(100.dp))
                        val gambar = painterResource(R.drawable.play)
                        Image(
                            painter = gambar,
                            contentDescription = null,
                            modifier = Modifier
                                .size(50.dp)
                                .padding(3.dp)
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .padding(10  .dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.DarkGray
                )
            ) {
                Row (){
                    val gambar = painterResource(R.drawable.setting)
                    Image(
                        painter = gambar,
                        contentDescription = null,
                        modifier = Modifier
                            .size(50.dp)
                            .padding(3.dp)
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Row() {
                        Text(
                            stringResource(R.string.pengaturan),
                            color = Color.White,
                            fontSize = 16.sp,
                            modifier = Modifier.padding(top = 15.dp)
                        )
                        Spacer(modifier = Modifier.width(150.dp))
                        val gambar = painterResource(R.drawable.play)
                        Image(
                            painter = gambar,
                            contentDescription = null,
                            modifier = Modifier
                                .size(50.dp)
                                .padding(3.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(100.dp))

            Text(
                stringResource(R.string.copy_profile),
                color = Color.Gray,
                fontSize = 15.sp,
                modifier = Modifier
                    .padding(bottom = 5.dp)
            )
        }
    }
}
