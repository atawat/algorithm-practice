package com.craig.learning.algorithm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

public class ActivetyNotificationTests {

    @Test
    void activetyNotificationsTest() {
        List<Integer> source = new ArrayList<>() {
            {
                add(2);
                add(3);
                add(4);
                add(2);
                add(3);
                add(6);
                add(8);
                add(4);
                add(5);
            }
        };
        int result = ActivetyNotification.activityNotifications(source, 5);
        assertEquals(2, result);
    }

    @Test
    void activetyNotificationsTest2() {
        List<Integer> source = new ArrayList<>() {
            {
                add(10);
                add(20);
                add(30);
                add(40);
                add(50);
            }
        };
        int result = ActivetyNotification.activityNotifications(source, 3);
        assertEquals(1, result);
    }

    @Test
    void activetyNotificationsTest3() {
        List<Integer> source = new ArrayList<>() {
            {   
                add(50);
                add(40);
                add(30);
                add(20);
                add(10);
            }
        };
        int result = ActivetyNotification.activityNotifications(source, 3);
        assertEquals(0, result);
    }

    @Test
    void activetyNotificationsTest4() {
        List<Integer> source = new ArrayList<>() {
            {   
                add(1);
                add(2);
                add(3);
                add(4);
                add(4);
            }
        };
        int result = ActivetyNotification.activityNotifications(source, 4);
        assertEquals(0, result);
    }
}
