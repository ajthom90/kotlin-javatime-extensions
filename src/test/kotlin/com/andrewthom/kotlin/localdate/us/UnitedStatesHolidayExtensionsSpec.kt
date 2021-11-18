package com.andrewthom.kotlin.localdate.us

import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature
import java.time.LocalDate
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

object ThanksgivingSpec: Spek({
	Feature("a date") {
		Scenario("checking thanksgiving 2018") {
			val thanksgiving2018 = LocalDate.of(2018, 11, 22)
			val isThanksgiving = thanksgiving2018.isThanksgiving()
			Then("should be true") {
				assertEquals(true, isThanksgiving)
			}
		}
		Scenario("checking thanksgiving 2017") {
			val thanksgiving2017 = LocalDate.of(2017, 11, 23)
			val isThanksgiving = thanksgiving2017.isThanksgiving()
			Then("should be true") {
				assertEquals(true, isThanksgiving)
			}
		}
		Scenario("checking non-thanksgiving dates") {
			val notThanksgiving1 = LocalDate.of(2019, 11, 21)
			val notThanksgiving2 = LocalDate.of(2019, 11, 29)
			val notThanksgiving3 = LocalDate.of(2018, 11, 28)
			Then("should not be true") {
				assertEquals(false, notThanksgiving1.isThanksgiving())
				assertEquals(false, notThanksgiving2.isThanksgiving())
				assertEquals(false, notThanksgiving3.isThanksgiving())
			}
		}
	}
})

object ChristmasSpec: Spek({
	Feature("a date") {
		Scenario("checking Christmas day") {
			val christmas = LocalDate.of(2018, 12, 25)
			Then("should be true") {
				assertEquals(true, christmas.isChristmasDay())
			}
		}
		Scenario("checking Christmas eve") {
			val christmas = LocalDate.of(2018, 12, 24)
			Then("should be true") {
				assertEquals(true, christmas.isChristmasEve())
			}
		}
		Scenario("checking Christmas Day - not the day") {
			val christmas = LocalDate.of(2018, 12, 24)
			Then("should be false") {
				assertEquals(false, christmas.isChristmasDay())
			}
		}
		Scenario("checking Christmas Eve - not the day") {
			val christmas = LocalDate.of(2018, 12, 25)
			Then("should be false") {
				assertEquals(false, christmas.isChristmasEve())
			}
		}
	}
})

object MLKSpec: Spek({
	Feature("a date") {
		Scenario("checking MLK day") {
			val mlkDay = LocalDate.of(2018, 1, 15)
			Then("should be true") {
				assertEquals(true, mlkDay.isMLKDay())
			}
		}
		Scenario("checking MLK Day - not the day") {
			val christmas = LocalDate.of(2018, 1, 16)
			Then("should be false") {
				assertEquals(false, christmas.isMartinLutherKingJrDay())
			}
		}
		Scenario("checking MLK day 2017") {
			val mlkDay = LocalDate.of(2017, 1, 16)
			Then("should be true") {
				assertEquals(true, mlkDay.isMLKDay())
			}
		}
		Scenario("checking MLK Day 2017 - not the day") {
			val christmas = LocalDate.of(2017, 1, 15)
			Then("should be false") {
				assertEquals(false, christmas.isMartinLutherKingJrDay())
			}
		}
		Scenario("checking MLK day 2020") {
			val mlkDay = LocalDate.of(2020, 1, 20)
			Then("should be true") {
				assertEquals(true, mlkDay.isMLKDay())
			}
		}
		Scenario("checking MLK Day 2020 - not the day") {
			val christmas = LocalDate.of(2020, 1, 15)
			Then("should be false") {
				assertEquals(false, christmas.isMartinLutherKingJrDay())
			}
		}
	}
})

object ElectionDaySpec: Spek({
	Feature("a date") {
		Scenario("checking Election Day") {
			val electionDay = LocalDate.of(2016, 11, 8)
			Then("should be true") { assertTrue { electionDay.isElectionDayUS() } }
		}
		Scenario("a day that isn't election day") {
			val notElectionDay = LocalDate.of(2016, 11, 9)
			Then("should be false") { assertFalse { notElectionDay.isElectionDayUS() } }
		}
		Scenario("election day 2018") {
			val electionDay = LocalDate.of(2018, 11, 6)
			Then("should be true") { assertTrue { electionDay.isElectionDayUS() } }
		}
	}
})
