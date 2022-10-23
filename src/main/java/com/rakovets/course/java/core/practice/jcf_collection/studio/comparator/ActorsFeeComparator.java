package com.rakovets.course.java.core.practice.jcf_collection.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_collection.studio.Actor;

import java.util.Comparator;

public class ActorsFeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor ac1, Actor ac2) {
        return Double.compare(ac1.getFee(), ac2.getFee());
    }
}
