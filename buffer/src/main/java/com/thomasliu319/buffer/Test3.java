package com.thomasliu319.buffer;

import java.nio.CharBuffer;

/**
 * @Author: jian.liu
 * @Description //position是下一个读取或写入操作的index
 * @Date: 2022/11/30 00:02
 */
public class Test3 {

    public static void main(String[] args) {
        char[] charArray = new char[]{ 'a','b', 'c', 'd'};
        CharBuffer charBuffer = CharBuffer.wrap(charArray);

        System.out.println("A capacity() ="+charBuffer.capacity()+" limit()="+charBuffer.limit()+" position()="+charBuffer.position());

        charBuffer.position(2);
        System.out.println("B capacity ()="+charBuffer.capacity()+" limit()="+charBuffer.limit()+" position()="+charBuffer.position());
        charBuffer.put("z");
        for (int i=0; i< charArray.length; i++){
            System.out.println(charArray[i]+" ");
        }
    }
}
