import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    public void testSimpleTaskIfMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Позвонить");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testSimpleTaskIfNotMatches() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("Написать");

        Assertions.assertFalse(actual);
    }

    @Test
    public void testMeetingIfMatchesTopic() {
        Meeting meeting = new Meeting(5,"Выкатка", "Приложение", "Сегодня");

        boolean actual = meeting.matches("Выкатка");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMeetingIfMatchesProject() {
        Meeting meeting = new Meeting(5,"Выкатка", "Приложение", "Сегодня");

        boolean actual = meeting.matches("Приложение");

        Assertions.assertTrue(actual);
    }

    @Test
    public void testMeetingIfNotMatches() {
        Meeting meeting = new Meeting(5,"Выкатка", "Приложение", "Сегодня");

        boolean actual = meeting.matches("НетоБанк");

        Assertions.assertFalse(actual);
    }

    @Test
    public void testEpicIfMatches() {
        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
        Epic epic = new Epic(3, subtasks);

        boolean actual = epic.matches("Молоко");

        Assertions.assertTrue(actual);
    }
}