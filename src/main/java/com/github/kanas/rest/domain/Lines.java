package com.github.kanas.rest.domain;

import com.github.kanas.core.Line;
import com.google.common.collect.Lists;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Lines<T> {

    private final List<Line<T>> lines;

    public Lines() {
        this.lines = defaultLines();
    }

    public T produce(T value) {
        for (Line<T> line : lines) {
            value = line.produce(value);
        }
        return value;
    }

    public void add(@NotNull final Line<T> line) {
        this.lines.add(line);
    }

    private @NotNull List<Line<T>> defaultLines() {
        return Lists.newArrayList(o -> o);
    }

}
