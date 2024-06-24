package fr.megarma.memorycard.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import fr.megarma.memorycard.domain.Card

@Composable
fun CardView(card: Card, onCardClick: (Card) -> Unit) {
    val background = if (card.isRevealed) Color(0xFFD4D8FF) else Color(0xFF4F62FD)

    Box(
        modifier = Modifier
            .size(height = 60.dp, width = 60.dp)
            .background(background, RoundedCornerShape(8.dp))
            .clickable { onCardClick(card) },
        contentAlignment = Alignment.Center
    ) {
        if (card.isRevealed) {
            Image(
                imageVector = card.image,
                contentDescription = null,
                modifier = Modifier.size(45.dp)
            )
        }
    }
}