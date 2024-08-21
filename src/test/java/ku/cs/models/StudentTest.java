package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

   @Test
    void testAddScore(){
        Student s1 = new Student("61xxxxx", "sun");
        assertEquals(0, s1.getScore());
        s1.addScore(40.5);
        assertEquals(40.5, s1.getScore());
        s1.addScore(10);
        assertEquals(50.5, s1.getScore());
    }


    @Test
    void testCalculateGrade(){
        Student s1 = new Student("61xxxxxxx", "sun");
        s1.addScore(60.8);
        assertEquals("C", s1.grade());
    }

    @Test
    void changeName() {
       Student s1 = new Student ("61xxxxxxx","sea");
       s1.changeName("sun");
       assertEquals("sun", s1.getName());
    }
}