package com.apitesting.api;

import java.io.Serializable;

public class OrderId implements Serializable {

    private static String id;

    public static String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
/*
    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                '}';
    }
*/

    public OrderId() {
    }

}