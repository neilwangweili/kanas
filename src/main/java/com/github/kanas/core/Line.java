package com.github.kanas.core;

@FunctionalInterface
public interface Line<T> {

    T produce(T t);

}
