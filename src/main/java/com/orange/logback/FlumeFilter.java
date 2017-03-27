package com.orange.logback;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.filter.Filter;
import ch.qos.logback.core.spi.FilterReply;

/**
 * Created by Yashon on 2017/3/23.
 */
public class FlumeFilter extends Filter<ILoggingEvent> {

    public FilterReply decide(ILoggingEvent iLoggingEvent) {
        if (iLoggingEvent.getLoggerName().startsWith("flume")) {
            return FilterReply.ACCEPT;
        } else {
            return FilterReply.DENY;
        }
    }
}
