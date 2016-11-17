package com.gft.structuraltest.testconference.registrationdata;

import static org.junit.Assert.*;
import org.junit.*;

public class AnswerEntityTest{

    @Test
    public void shouldReturnFalseWhenObjectIsNull(){
        AnswerEntity an1 = new AnswerEntity();
        AnswerEntity an2 = null;
		AnswerEntity an3 = new AnswerEntity();
		QuestionEntity Q1 = new QuestionEntity();
		QuestionEntity Q2 = new QuestionEntity();
		long id1 = 2;
		long id2 = 3;
		
        assertFalse(an1.equals(an2));
		
		assertTrue(an1.equals(an1));
		
		assertTrue(an1.equals(an3));
		
		int liczba1 = 8;
		assertFalse(an1.equals(liczba1));
		
		an1.setAnswerText("Test");
		assertFalse(an1.equals(an3));
		
		an3.setAnswerText("Test1");
		assertFalse(an1.equals(an3));
		
		an1.setAnswerText(null);
		assertFalse(an1.equals(an3));
		
		an1.setAnswerText("Test1");
		assertTrue(an1.equals(an3));
		
		an1.setId(id1);
		an3.setId(id2);
		assertFalse(an1.equals(an3));
		
		an1.setId(null);
		assertFalse(an1.equals(an3));
		
		id2 = 2;
		an1.setId(id1);
		an3.setId(id2);
		assertTrue(an1.equals(an3));
		
		an1.setQuestion(Q1);
		assertFalse(an1.equals(an3));
		
		an1.setQuestion(null);
		an3.setQuestion(Q2);
		assertFalse(an1.equals(an3));
		
		an1.setQuestion(Q2);
		assertTrue(an1.equals(an3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    }
    
}