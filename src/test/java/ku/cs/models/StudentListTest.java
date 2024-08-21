package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentListTest {
    Student s1;

    @BeforeEach
    void init(){
        s1 = new Student("61xxx", "sun");
    }

    @Test
    @DisplayName("ทดสอบเพิ่มชื่อid")
    void testAddNewStudent() {
        s1 = new Student("61xxx", "sun");
        assertEquals("61xxx", s1.getId());
    }

    @Test
    @DisplayName("ทดสอบหาid")
    void findStudentById() {
        s1 = new Student(null, null);
        assertNull(null);
        assertNotNull(s1);
    }

    @Test
    @DisplayName("ทดสอบเพิ่มคะแนน")
    void giveScoreToId() {
        s1 = new Student("61xxx", "sun");
        assertEquals(0, s1.getScore());
        s1.addScore(10);
        assertEquals(10, s1.getScore());
    }

    @Test
    void viewGradeOfId() {
        s1 = new Student("61xxx", "sun");
        s1.addScore(87);
        assertEquals("A", s1.grade());
    }
}