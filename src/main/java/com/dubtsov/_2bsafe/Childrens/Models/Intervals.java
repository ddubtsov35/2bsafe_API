package com.dubtsov._2bsafe.Childrens.Models;

import java.util.List;

/**
 * Created by user on 23.08.17.
 */
public class Intervals {

    private int id;
    private String interval_start;
    private String interval_end;
    private List<Integer> repeat;
    private int group_id;
    private String alias;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInterval_start() {
        return interval_start;
    }

    public void setInterval_start(String interval_start) {
        this.interval_start = interval_start;
    }

    public String getInterval_end() {
        return interval_end;
    }

    public void setInterval_end(String interval_end) {
        this.interval_end = interval_end;
    }

    public List<Integer> getRepeat() {
        return repeat;
    }

    public void setRepeat(List<Integer> repeat) {
        this.repeat = repeat;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
