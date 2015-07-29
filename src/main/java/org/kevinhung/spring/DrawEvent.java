package org.kevinhung.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

/**
 * Created by Kevin on 2015/7/27.
 */
public class DrawEvent extends ApplicationEvent{

    public DrawEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "Draw Event Occured";
    }
}
