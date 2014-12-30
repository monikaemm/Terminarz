package com.github;

import java.util.Date;

/**
 * Created by MiluchM on 2014-12-30.
 */
public class TimeRange {
    private Date startPoint;
    private Date endPoint;

    public TimeRange(Date startPoint, Date endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public boolean contains(Date date) {
        return startPoint.before(date) && endPoint.after(date);
    }

}
