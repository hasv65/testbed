package com.whiteboard.wb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by IntelliJ IDEA.
 * User: ryan
 * Date: 10/18/11
 * Time: 11:09 AM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath*:WEB-INF/spring-data.xml")
public class NewTest {

    @PersistenceContext
    EntityManager entityManager;
    @Autowired
    DataGenerator dataGenerator;

    @Test
    @Transactional
    public void test(){
        dataGenerator.generateTestData();
        entityManager.flush();
    }
}




