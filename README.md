# 🌴 FilBanfi-design-pack

A standalone, ready-to-use Material 3 Expressive design system package for Jetpack Compose. Created to give any new Android project a polished, organic, and lively UI right from day one.

## What's Inside?

```
FilBanfi-design-pack/
├── font/
│   └── google_sans_flex.ttf       // Google Sans Flex variable font
├── motion/
│   ├── Motion.kt                  // Spring physics tokens (micro, component, playful)
│   └── Easing.kt                  // Custom cubic bezier easing curves
├── shape/
│   └── Shape.kt                   // Squircle shapes & ExpressiveShapes
├── theme/
│   ├── Color.kt                   // 13+ Premium themes (Minimal Ink B&W, Leonida Vice City, etc.)
│   ├── Theme.kt                   // Theme engine & expressiveBounce / expressiveClickable modifiers
│   └── Type.kt                    // Typography configuration
└── components/
    └── ExpressiveComponents.kt    // ExpressiveButton, ExpressiveCard, AnimatedIcon, SuccessAnimation, LoadingPulse
```

---

## How It Works & How to Use It in New Projects

### 1. Copy the Package
Copy the `FilBanfi-design-pack` folders (`font`, `motion`, `shape`, `theme`, `components`) directly into your new project's source code directory (e.g., `app/src/main/java/com/yourname/project/ui/` and font into `app/src/main/res/font/`).

### 2. Add Required Dependencies
In your module-level `build.gradle.kts`:
```kotlin
dependencies {
    implementation("androidx.compose.material3:material3")
    implementation("androidx.graphics:graphics-shapes:1.1.0") // Required for Squircle shapes
}
```

### 3. Apply the Theme & Enjoy!
Wrap your screens or content in your theme (e.g., `WalkYourTimeTheme` or `FilBanfiTheme`):
```kotlin
WalkYourTimeTheme(themeMode = 110) { // e.g., Leonida theme
    Surface {
        ExpressiveButton(onClick = { /* ... */ }) {
            Text("Tap me!")
        }
    }
}
```

---

## Publishing to GitHub
1. Create a new public or private repository on GitHub named `FilBanfi-design-pack`.
2. Initialize git inside this folder and push:
   ```bash
   cd FilBanfi-design-pack
   git init
   git add .
   git commit -m "Initial commit: FilBanfi M3 Expressive Design Pack v1.0"
   git branch -M main
   git remote add origin https://github.com/YourUsername/FilBanfi-design-pack.git
   git push -u origin main
   ```
3. You can now clone it or include it as a git submodule in any future Android project!
