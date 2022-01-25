package com.google.bhasker.jstreams;

public class StaticRefProg {
    public static void main(String args[])
    {
        System.out.println("max value is.." + max(1,2));
    }
    public static <T> T max(T x, T y) {
       // x > y ? x : y;
        final T t = x.equals(y) ? x : y;
        return t;
    }
}

