package com.andrewthom.kotlin.localdate.us

import com.andrewthom.kotlin.localdate.Holiday
import java.time.LocalDate

enum class UnitedStatesHoliday(private val evaluator: (LocalDate) -> Boolean): Holiday {
	NEW_YEARS_DAY({ it.isNewYearsDay() }),
	MLK_DAY({ it.isMLKDay() }),
	MEMORIAL_DAY({ it.isMemorialDay() }),
	FOURTH_OF_JULY({ it.isFourthOfJuly() }),
	LABOR_DAY({ it.isLaborDay() }),
	THANKSGIVING_DAY({ it.isThanksgiving() }),
	DAY_AFTER_THANKSGIVING({ it.isDayAfterThanksgiving() }),
	CHRISTMAS_EVE({ it.isChristmasEve() }),
	CHRISTMAS_DAY({ it.isChristmasDay() }),
	KWANZAA({ it.isKwanzaa() });

	override fun evaluate(localDate: LocalDate): Boolean {
		return evaluator(localDate)
	}
}
