package com.andrewthom.kotlin.localdate

import com.andrewthom.kotlin.localdate.us.UnitedStatesHoliday
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import java.time.LocalDate
import kotlin.test.assertFalse
import kotlin.test.assertTrue

object AnyHolidaysSpec: Spek({
	given("a local date") {
		on("not Christmas") {
			it("should return false") {
				assertFalse {
					LocalDate.of(2018, 12, 24).isAnyOfTheseHolidays(UnitedStatesHoliday.CHRISTMAS_DAY)
				}
			}
		}
		on("Christmas") {
			val christmas = LocalDate.of(2018, 12, 25)
			it("should return true when it is Christmas") {
				assertTrue {
					christmas.isAnyOfTheseHolidays(UnitedStatesHoliday.CHRISTMAS_DAY)
				}
			}
			it("should not return true when it is Christmas but the given list doesn't include Christmas") {
				assertFalse {
					christmas.isAnyOfTheseHolidays(UnitedStatesHoliday.CHRISTMAS_EVE)
				}
			}
			it("should return true even when called through Java") {
				assertTrue(CallingFromJavaUtils.getAnyOfTheseHolidaysChristmas_ShouldReturnTrue())
			}
		}
		on("Labor Day") {
			val laborDay = LocalDate.of(2018, 9, 3)
			it("should return true when the list given includes Labor Day") {
				assertTrue(laborDay.isAnyOfTheseHolidays(UnitedStatesHoliday.LABOR_DAY))
			}
		}
	}
})
