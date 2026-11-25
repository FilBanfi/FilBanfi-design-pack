package com.designsystem.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.graphics.shapes.CornerRounding
import androidx.graphics.shapes.RoundedPolygon
import androidx.graphics.shapes.toPath

/**
 * Shapes per Material 3 Expressive (Squircle)
 */
val ExpressiveShapes = Shapes(
    extraSmall = RoundedCornerShape(8.dp),
    small = RoundedCornerShape(12.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(28.dp),
    extraLarge = RoundedCornerShape(36.dp)
)

class SquircleShape(private val cornerScale: Float = 0.6f) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val minDimension = minOf(size.width, size.height)
        val radius = minDimension / 2f
        val polygon = RoundedPolygon(
            numVertices = 4,
            radius = radius,
            rounding = CornerRounding(radius * cornerScale)
        )
        val androidPath = polygon.toPath()
        android.graphics.Matrix().apply {
            postTranslate(size.width / 2f, size.height / 2f)
        }.let { androidPath.transform(it) }

        val composePath = androidPath.asComposePath()
        return Outline.Generic(composePath)
    }
}

fun squircleShape(cornerScale: Float = 0.6f): Shape = SquircleShape(cornerScale)
