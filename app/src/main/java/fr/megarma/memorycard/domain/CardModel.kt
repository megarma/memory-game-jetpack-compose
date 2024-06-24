package fr.megarma.memorycard.domain

import androidx.compose.ui.graphics.vector.ImageVector

data class Card(
    val id: Int,
    val image: ImageVector,
    var isRevealed: Boolean = false,
    var isVisible: Boolean = true
)