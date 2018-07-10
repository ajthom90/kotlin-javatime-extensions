# Kotlin Extensions for java.time

Some handy Kotlin extensions for java.time classes

[![Release](https://jitpack.io/v/com.andrewthom/kotlin-javatime-extensions.svg)](https://jitpack.io/#com.andrewthom/kotlin-javatime-extensions)

To use, add the following repository to your Maven configuration: 

```
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
```

And add the following dependency: 

```
<dependency>
  <groupId>com.andrewthom</groupId>
  <artifactId>kotlin-javatime-extensions</artifactId>
  <version>1.0.1</version> <!-- Replace with whatever the current version is -->
</dependency>
```

## Examples

This library has some basic date functions.  At this time, I have added holidays from the United States.  It can be used in a few different ways:
```kotlin
fun calculateHolidays() {
    val localDate = LocalDate.of(2018, 1, 1)
    localDate.isNewYearsDay() // returns true
    localDate.isChristmas() // returns false
    localDate.isAnyOfTheseHolidays(UnitedStatesHoliday.NEW_YEARS_DAY, UnitedStatesHoliday.CHRISTMAS) // returns true
    localDate.isAnyOfTheseHolidays(UnitedStatesHoliday.MLK_DAY, UnitedStatesHoliday.LABOR_DAY) // returns false
}
```

The library can also be called from Java if needed:
```java
import com.andrewthom.kotlin.localdate.HolidayUtils;
import com.andrewthom.kotlin.localdate.us.UnitedStatesHoliday;

public class HolidayHelper { 
    public static final boolean isHoliday(LocalDate date) {
        HolidayUtils.isAnyOfTheseHolidays(date, UnitedStatesHoliday.CHRISTMAS_DAY /* add more holidays as necessary */);
    }
}
```
