package com.bignerdranch.android.composition2.domain.repository

import com.bignerdranch.android.composition2.domain.entity.GameSettings
import com.bignerdranch.android.composition2.domain.entity.Level
import com.bignerdranch.android.composition2.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}
