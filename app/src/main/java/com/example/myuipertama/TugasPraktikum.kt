import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
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
                verticalAlignment = Alignment.CenterVertically
            ){
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

        }
    }
}
