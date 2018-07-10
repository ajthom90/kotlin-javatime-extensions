package com.andrewthom.kotlin.localdate.religious.christian

import com.andrewthom.kotlin.localdate.Holiday
import java.time.LocalDate

enum class ChristianHoliday(private val evaluator: (LocalDate) -> Boolean): Holiday {
	WESTERN_EASTER({ it.isEasterSundayInWesternChristianity() });

	override fun evaluate(localDate: LocalDate): Boolean {
		return evaluator(localDate)
	}
}
