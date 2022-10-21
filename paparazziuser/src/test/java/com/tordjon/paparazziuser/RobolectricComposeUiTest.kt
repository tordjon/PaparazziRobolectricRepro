package com.tordjon.paparazziuser

import androidx.compose.material.Text
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Test
import org.junit.Rule
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class RobolectricComposeUiTest {

    @get:Rule
    val rule = createComposeRule()
    
    @Test
    fun textIsDisplayed(){
        rule.setContent {
            Text("Hello")
          }

        rule.onNodeWithText("Hello").assertIsDisplayed()
    }

}