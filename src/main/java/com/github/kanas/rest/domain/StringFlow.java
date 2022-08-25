package com.github.kanas.rest.domain;

public class StringFlow extends Flow<String> {

    protected StringFlow(ResponseValue value) {
        super(value);
    }

    @Override
    protected boolean matchType(Class<?> underlyingType) {
        return String.class.isAssignableFrom(underlyingType);
    }

}
