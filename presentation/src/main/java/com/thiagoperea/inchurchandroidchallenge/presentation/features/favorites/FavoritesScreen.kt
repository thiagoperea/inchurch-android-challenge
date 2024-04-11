package com.thiagoperea.inchurchandroidchallenge.presentation.features.favorites

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.thiagoperea.inchurchandroidchallenge.presentation.theme.InChurchAndroidChallengeTheme

@Composable
fun FavoritesScreen(
    appNavController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text("Favorites Screen")
    }
}

@Preview
@Composable
fun FavoritesScreenPreview() {
    InChurchAndroidChallengeTheme {
        Surface {
            FavoritesScreen(rememberNavController())
        }
    }
}