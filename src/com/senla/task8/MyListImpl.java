package com.senla.task8;

public interface MyListImpl<T> extends Collection<Integer> {


    void size();

    void isEmpty();

    void contains(Object value);

    void add(Integer value);

    void remove(Object value);

    void addAll(Collection<? extends Integer> value);

}

