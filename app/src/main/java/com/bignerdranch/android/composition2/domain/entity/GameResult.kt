package com.bignerdranch.android.composition2.domain.entity

import java.io.Serializable

data class GameResult(
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
): Serializable
