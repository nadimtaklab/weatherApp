Project Description:
- Files
1. WeatherApi
2. WeatherResponse.kt
3. WeatherViewModel
4. MainActivity.kt

- Prerequisites
1. Color.kt
   > val BlueJC = Color(0xFF3DC6F6)
   > val DarkBlueJC = Color(0xFF145DA0)
   
3. Libs Version.toml
   > retrofit = { group = "com.squareup.retrofit2", name = "retrofit", version.ref = "retrofit" }
   > retrofit-converter-gson = { group = "com.squareup.retrofit2", name = "converter-gson", version.ref = "retrofit" }
   > androidx-viewmodel-compose = { group = "androidx.lifecycle", name = "lifecycle-viewmodel-compose", version.ref = "livecycleCmopose" }
   > androidx-navigation-compose = { group = "androidx.navigation", name = "navigation-compose", version.ref = "navigationCompose" }
   
4. Gradle
   >//retrofit
   >implementation(libs.retrofit)
   >implementation(libs.retrofit.converter.gson)
   >
   >//viewModel
   >implementation(libs.androidx.viewmodel.compose)
   >implementation(libs.androidx.navigation.compose)
   
6. AndroidManifest <uses-permission android:name="android.permission.INTERNET"/>
7. API URL: https://weatherstack.com/ 
