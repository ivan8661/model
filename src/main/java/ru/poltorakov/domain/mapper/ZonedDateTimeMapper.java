package ru.poltorakov.domain.mapper;

import org.mapstruct.Named;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeMapper {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ISO_ZONED_DATE_TIME;

    @Named("zonedDateTimeToString")
    public String zonedDateTimeToString(ZonedDateTime zonedDateTime) {
        return zonedDateTime != null ? DATE_TIME_FORMATTER.format(zonedDateTime) : null;
    }

    @Named("stringToZonedDateTime")
    public ZonedDateTime stringToZonedDateTime(String dateTime) {
        return dateTime != null ? ZonedDateTime.parse(dateTime, DATE_TIME_FORMATTER) : null;
    }
}
