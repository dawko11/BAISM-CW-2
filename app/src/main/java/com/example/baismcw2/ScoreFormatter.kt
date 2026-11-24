package com.example.baismcw2

object ScoreFormatter {
    fun format(score: Int): String {
        require(score in 0..100) { "score must be between 0 and 100" }
        return "Security score: $score"
    }
}
