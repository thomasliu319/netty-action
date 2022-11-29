package com.thomasliu319.buffer;

import java.nio.CharBuffer;

/**
 * @Author: jian.liu
 * @Description //TODO
 * @Date: 2022/11/30 00:11
 */
public class Test2 {

    public static void main(String[] args) {
        char[] charArray = new char[]{ 'a','b', 'c', 'd', 'e'};
        CharBuffer buffer = CharBuffer.wrap(charArray);

        System.out.println("A capacity() ="+buffer.capacity()+" limit()="+buffer.limit());

        buffer.limit(3);
        System.out.println();
        System.out.println("B capacity ()="+buffer.capacity()+" limit()="+buffer.limit());
        buffer.put(0, 'o');//0
        buffer.put(1, 'p');//1
        buffer.put(2, 'q');//2
        buffer.put(3, 'r');//3
        buffer.put(4, 's');//4
        buffer.put(5, 'p');//5
        buffer.put(6, 'q');//6
    }
}
