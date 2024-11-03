import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack;

    // Aufgabe 1. a)

    @BeforeEach
    void initializeStack() {
        // Initialize new stack for every test
        stack = new Stack(5);
    }

    @Test
    void isEmptyNewStack() {
        // Test if a new stack is empty
        assertTrue(stack.isEmpty());
    }

    @Test
    void isEmptyAfterPop() {
        // Test if stack is empty after pop
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void isEmptyAfterPush() {
        // Test if stack is not empty after push
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    void popEmptyStack() {
        // Test if pop returns -1 on empty stack
        assertEquals(-1, stack.pop());
    }

    @Test
    void popAfterPush() {
        // Test if pop returns the latest element
        stack.push(1);
        stack.push(5);
        assertEquals(5, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void pushNegativeElement() {
        // Test if pushing negative element to the stack throws IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> stack.push(-1));
    }

    @Test
    void pushOnMaxSize() {
        // Test if push on full stack throws StackOverflowError
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assertThrows(StackOverflowError.class, () -> stack.push(6));
    }

    @Test
    void sizeEmptyStack() {
        assertEquals(0, stack.size());
    }

    @Test
    void sizeOnFilledStack() {
        stack.push(1);
        assertEquals(1, stack.size());
    }

    // Aufgabe 2. b)

    @Test
    void topEmptyStack() {
        assertEquals(-1, stack.top());
    }

    @Test
    void topAfterSinglePush() {
        stack.push(1);
        assertEquals(1, stack.top());
    }

    @Test
    void topAfterMultiplePush() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.top());
    }

    @Test
    void topAfterPop() {
        stack.push(1);
        stack.push(2);
        stack.pop();
        assertEquals(1, stack.top());
    }
}