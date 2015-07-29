package org.kevinhung.spring;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Kevin on 2015/7/27.
 */

@Component
public class MyEventListener implements ApplicationListener{
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event.toString());
    }
}
