package com.acme.todolist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

import com.acme.todolist.domain.TodoItem;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@SpringBootTest
class TodolistApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
    public void isLateTrueTest(){
    	//System.out.println(Instant.now().minus(10, ChronoUnit.DAYS));
        TodoItem todoItem = new TodoItem("test", Instant.now().minus(10, ChronoUnit.DAYS),"test");
        Assertions.assertTrue(todoItem.isLate());
    }

    @Test
    void isLateFalseTest(){
    	//System.out.println(Instant.now().plus(10, ChronoUnit.DAYS));
        TodoItem todoItem = new TodoItem("test", Instant.now().plus(10, ChronoUnit.DAYS),"test");
        Assertions.assertFalse(todoItem.isLate());
    }

}
