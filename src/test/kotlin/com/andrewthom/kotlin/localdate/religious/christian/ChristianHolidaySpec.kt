package com.andrewthom.kotlin.localdate.religious.christian

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import java.time.LocalDate
import java.time.Year
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ChristianHolidaySpec: Spek({
	Feature("a date") {
		Scenario("Easter (Western Christianity)") {
			Then("should be true for 2017") {
				val easter2017 = LocalDate.of(2017, 4, 16)
				assertTrue { easter2017.isEasterSundayInWesternChristianity() }
			}
			Then("should be true for 2018") {
				val easter2018 = LocalDate.of(2018, 4, 1)
				assertTrue { easter2018.isEasterSundayInWesternChristianity() }
			}
			Then("should be true for 2019") {
				val easter2019 = LocalDate.of(2019, 4, 21)
				assertTrue { easter2019.isEasterSundayInWesternChristianity() }
			}
			Then("should be true for 2020") {
				val easter = LocalDate.of(2020, 4, 12)
				assertTrue { easter.isEasterSundayInWesternChristianity() }
			}
			Then("should be true for 2016") {
				val easter = LocalDate.of(2016, 3, 27)
				assertTrue { easter.isEasterSundayInWesternChristianity() }
			}
			Then("should be true for 1957") {
				val easter = LocalDate.of(1957, 4, 21)
				assertTrue { easter.isEasterSundayInWesternChristianity() }
			}
		}
		Scenario("Easter (Eastern Christianity)") {
			Then("should be true for 2017") {
				val easter2017 = LocalDate.of(2017, 4, 16)
				assertTrue { easter2017.isEasterSundayInEasternChristianity() }
			}
			Then("should be true for 2018") {
				val easter2018 = LocalDate.of(2018, 4, 8)
				assertTrue { easter2018.isEasterSundayInEasternChristianity() }
			}
			Then("should be true for 2019") {
				val easter2019 = LocalDate.of(2019, 4, 28)
				assertTrue { easter2019.isEasterSundayInEasternChristianity() }
			}
			Then("should be true for 2020") {
				val easter = LocalDate.of(2020, 4, 19)
				assertTrue { easter.isEasterSundayInEasternChristianity() }
			}
			Then("should be true for 2024") {
				val easter = LocalDate.of(2024, 5, 5)
				assertTrue { easter.isEasterSundayInEasternChristianity() }
			}
		}
		Scenario("a non-Easter date") {
			Then("should be false for Western Christianity when the date is Christmas") {
				val christmas = Year.of(2018).atMonth(12).atDay(25)
				assertFalse { christmas.isEasterSundayInWesternChristianity() }
			}
			Then("should be false for Eastern Christianity when the date is Christmas") {
				val christmas = Year.of(2018).atMonth(12).atDay(25)
				assertFalse { christmas.isEasterSundayInEasternChristianity() }
			}
		}
	}
})
