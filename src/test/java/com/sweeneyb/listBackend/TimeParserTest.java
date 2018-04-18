package com.sweeneyb.listBackend;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class TimeParserTest {

    @Test
    public void parseTime() {
        String time = "2018-04-15T20:54:21.573";
        LocalDateTime result = LocalDateTime.parse(time, java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        assertThat( result.getYear()).isEqualTo(2018);
    }
}
