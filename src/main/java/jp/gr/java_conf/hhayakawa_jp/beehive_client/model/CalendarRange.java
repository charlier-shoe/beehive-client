package jp.gr.java_conf.hhayakawa_jp.beehive_client.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public final class CalendarRange {

    private final String beeType = "calendarRangeQuery";
    private final BeeId beeId;
    private final String start;
    private final String end;

    public CalendarRange(BeeId beeId, String start, String end) {
        super();
        this.beeId = beeId;
        this.start = start;
        this.end = end;
    }

    public String getBeeType() {
        return beeType;
    }

    public BeeId getCalendar() {
        return beeId;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

}
