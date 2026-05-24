import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {

    private final GradeCalculator gradeCalculator = new GradeCalculator();

    @Test
    void shouldReturnGradeAWhenScoreIsAtLeast85() {
        assertEquals("A", gradeCalculator.convertScoreToGrade(90));
    }

    @Test
    void shouldReturnGradeBWhenScoreIsBetween70And84() {
        assertEquals("B", gradeCalculator.convertScoreToGrade(75));
    }

    @Test
    void shouldReturnGradeCWhenScoreIsBetween55And69() {
        assertEquals("C", gradeCalculator.convertScoreToGrade(60));
    }

    @Test
    void shouldReturnGradeDWhenScoreIsBetween40And54() {
        assertEquals("D", gradeCalculator.convertScoreToGrade(45));
    }

    @Test
    void shouldReturnGradeEWhenScoreIsBelow40() {
        assertEquals("E", gradeCalculator.convertScoreToGrade(30));
    }

    @Test
    void shouldPassWhenScoreIsAtLeast55() {
        assertTrue(gradeCalculator.isPassed(55));
    }

    @Test
    void shouldNotPassWhenScoreIsBelow55() {
        assertFalse(gradeCalculator.isPassed(54));
    }

    @Test
    void shouldThrowExceptionWhenScoreIsInvalid() {
        assertThrows(IllegalArgumentException.class, () -> gradeCalculator.convertScoreToGrade(120));
    }
}
