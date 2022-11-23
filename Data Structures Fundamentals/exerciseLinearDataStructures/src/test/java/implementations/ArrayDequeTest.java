package implementations;

import junit.framework.TestCase;
import org.junit.Test;

public class ArrayDequeTest extends TestCase {

    @Test
    public void testLastShouldAddElementOnTheEnd() {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addLast("George");
        arrayDeque.addLast("Vladimir");
        arrayDeque.addLast("Stefan");
        arrayDeque.addLast("Miroslav");
    }

}