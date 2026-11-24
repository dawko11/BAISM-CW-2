package com.example.baismcw2

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class ScoreFormatterTest {
    @Test
    fun formatsScoreInsideRange() {
        assertEquals("Security score: 100", ScoreFormatter.format(100))
        assertEquals("Security score: 0", ScoreFormatter.format(0))
    }

    @Test
    fun rejectsScoreAboveRange() {
        assertThrows(IllegalArgumentException::class.java) {
            ScoreFormatter.format(101)
        }
    }
}
