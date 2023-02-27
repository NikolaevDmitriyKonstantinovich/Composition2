package com.bignerdranch.android.composition2.domain.usecases

import com.bignerdranch.android.composition2.domain.entity.GameSettings
import com.bignerdranch.android.composition2.domain.entity.Level
import com.bignerdranch.android.composition2.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}
