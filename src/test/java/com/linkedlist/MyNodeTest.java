package com.linkedlist;

import com.linkedlist.MyNode.MyNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyNodeTest {
    @Test
    public  void given3NumberWhenLinkedShouldPassesLinkedListTest(){
        MyNode<Integer>myFirstNode=new MyNode<>(56);
        MyNode<Integer>mySecondNode=new MyNode<>(30);
        MyNode<Integer>myThirdNode=new MyNode<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result=myFirstNode.getNext().equals(mySecondNode)&&
                mySecondNode.getNext().equals(myThirdNode);
        Assertions.assertTrue(result);

    }
}
