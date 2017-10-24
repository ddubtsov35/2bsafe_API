package com.dubtsov._2bsafe.Childrens.Models;

import java.util.List;

/**
 * Created by user on 23.08.17.
 */
public class Rules {

    public Integer id;
    public Integer trigger_id;
    public List<Integer> actions;
    public List<Integer> options;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTrigger_id() {
        return trigger_id;
    }

    public void setTrigger_id(Integer trigger_id) {
        this.trigger_id = trigger_id;
    }

    public List<Integer> getActions() {
        return actions;
    }

    public void setActions(List<Integer> actions) {
        this.actions = actions;
    }

    public List<Integer> getOptions() {
        return options;
    }

    public void setOptions(List<Integer> options) {
        this.options = options;
    }
}
