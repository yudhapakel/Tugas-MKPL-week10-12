package id.ac.telkom.mkpl.grade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class GradeCalculatorTest {

    private final GradeCalculator gradeCalculator = new GradeCalculator();

    @Test
    void shouldReturnGradeAWhenScoreIsAtLeast85() {
        assertEquals("A", gradeCalculator.convertScoreToGrade(90));
        assertEquals("A", gradeCalculator.convertScoreToGrade(85));
    }

    @Test
    void shouldReturnGradeBWhenScoreIsBetween70And84() {
        assertEquals("B", gradeCalculator.convertScoreToGrade(84));
        assertEquals("B", gradeCalculator.convertScoreToGrade(70));
    }

    @Test
    void shouldReturnGradeCWhenScoreIsBetween55And69() {
        assertEquals("C", gradeCalculator.convertScoreToGrade(69));
        assertEquals("C", gradeCalculator.convertScoreToGrade(55));
    }

    @Test
    void shouldReturnGradeDWhenScoreIsBetween40And54() {
        assertEquals("D", gradeCalculator.convertScoreToGrade(54));
        assertEquals("D", gradeCalculator.convertScoreToGrade(40));
    }

    @Test
    void shouldReturnGradeEWhenScoreIsBelow40() {
        assertEquals("E", gradeCalculator.convertScoreToGrade(39));
        assertEquals("E", gradeCalculator.convertScoreToGrade(0));
    }

    @Test
    void shouldPassWhenScoreIsAtLeast55() {
        assertTrue(gradeCalculator.isPassed(55));
        assertTrue(gradeCalculator.isPassed(100));
    }

    @Test
    void shouldNotPassWhenScoreIsBelow55() {
        assertFalse(gradeCalculator.isPassed(54));
        assertFalse(gradeCalculator.isPassed(0));
    }

    @Test
    void shouldThrowExceptionWhenScoreIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> gradeCalculator.convertScoreToGrade(120));
        assertThrows(IllegalArgumentException.class, () -> gradeCalculator.convertScoreToGrade(-1));
    }
}
