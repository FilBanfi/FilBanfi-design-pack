package com.designsystem.ui.motion

import androidx.compose.animation.core.*

/**
 * Motion tokens per Material 3 Expressive
 */
object AppMotion {
    val micro = spring<Float>(
        dampingRatio = 0.55f,
        stiffness = 700f
    )

    val component = spring<Float>(
        dampingRatio = 0.65f,
        stiffness = 350f
    )

    val page = spring<Float>(
        dampingRatio = 0.8f,
        stiffness = 150f
    )

    val playful = spring<Float>(
        dampingRatio = 0.5f,
        stiffness = 700f
    )

    const val STAGGER_DELAY = 50L
}
