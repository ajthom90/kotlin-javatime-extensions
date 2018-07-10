package com.andrewthom.kotlin.localdate.religious.christian

import com.andrewthom.kotlin.localdate.Holiday
import java.time.LocalDate

enum class ChristianHoliday(private val evaluator: (LocalDate) -> Boolean): Holiday {
	EASTER_WESTERN_CHRISTIANITY({ it.isEasterSundayInWesternChristianity() }),
	EASTER_EASTERN_CHRISTIANITY({ it.isEasterSundayInEasternChristianity() });

	override fun evaluate(localDate: LocalDate): Boolean {
		return evaluator(localDate)
	}
}
