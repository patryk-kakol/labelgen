package com.protolab.rest.commons;

public interface Mapper<F, T> {

    T map (F from);

    F reverseMap(T to);

}
