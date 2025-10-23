package com.example.pam3 // Package Anda sudah benar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
// Pastikan import Theme Anda sudah benar, sesuai nama project
import com.example.pam3.ui.theme.PAM3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Membungkus aplikasi Anda dengan Tema project (PAM3Theme)
            PAM3Theme {
                // Surface adalah container utama
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Memanggil Composable 'ActivitasPertama' yang kita buat
                    ActivitasPertama(modifier = Modifier)
                }
            }
        }
    }
}