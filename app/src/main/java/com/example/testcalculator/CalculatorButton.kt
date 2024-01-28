package com.example.testcalculator

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testcalculator.ui.theme.white

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    icon: ImageVector? = null,
    onClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(RoundedCornerShape(1.dp))
            .clickable { onClick() }
            .then(modifier)

    ) {
        if (icon != null) {
            Icon(imageVector = icon, contentDescription = null)
        } else {
            Text(
                text = symbol,
                fontSize = 30.sp,
                color = white,

                )
        }

    }
}
