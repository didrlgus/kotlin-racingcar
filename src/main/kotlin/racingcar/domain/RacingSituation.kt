package racingcar.domain

import racingcar.dto.RacingResult

data class RacingSituation(
    val racingResults: List<RacingResult>,
) {

    fun maxOfOrNull(): Int? {
        return racingResults.maxOfOrNull { it.currentPosition }
    }

    fun evaluate(maxPosition: Int?): RacingSituation {
        return RacingSituation(racingResults.filter { it.currentPosition == maxPosition })
    }
}
