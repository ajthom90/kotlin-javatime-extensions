package com.andrewthom.kotlin.localdate

import com.andrewthom.kotlin.localdate.us.UnitedStatesHoliday
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import java.time.LocalDate
import kotlin.test.assertFalse
import kotlin.test.assertTrue

object AnyHolidaysSpec: Spek({
	Feature("a local date") {
		Scenario("not Christmas") {
			Then("should return false") {
				assertFalse {
					LocalDate.of(2018, 12, 24).isAnyOfTheseHolidays(UnitedStatesHoliday.CHRISTMAS_DAY)
				}
			}
		}
		Scenario("Christmas") {
			val christmas = LocalDate.of(2018, 12, 25)
			Then("should return true when it is Christmas") {
				assertTrue {
					christmas.isAnyOfTheseHolidays(UnitedStatesHoliday.CHRISTMAS_DAY)
				}
			}
			Then("should not return true when it is Christmas but the given list doesn't include Christmas") {
				assertFalse {
					christmas.isAnyOfTheseHolidays(UnitedStatesHoliday.CHRISTMAS_EVE)
				}
			}
			Then("should return true even when called through Java") {
				assertTrue(CallingFromJavaUtils.getAnyOfTheseHolidaysChristmas_ShouldReturnTrue())
			}
		}
		Scenario("Labor Day") {
			val laborDay = LocalDate.of(2018, 9, 3)
			Then("should return true when the list given includes Labor Day") {
				assertTrue(laborDay.isAnyOfTheseHolidays(UnitedStatesHoliday.LABOR_DAY))
			}
		}
	}
})
