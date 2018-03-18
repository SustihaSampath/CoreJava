package org.sustiha.generics;

import java.util.Collection;

/**
 * Created by sustihashreesampath on 12/19/16.
 */
public class Fruit<E> implements FruitInterface{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean addAll(Collection c) {


        return false;
    }
}
