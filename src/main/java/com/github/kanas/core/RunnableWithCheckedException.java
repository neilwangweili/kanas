package com.github.kanas.core;

@FunctionalInterface
public interface RunnableWithCheckedException {
    void run() throws Exception;
}
