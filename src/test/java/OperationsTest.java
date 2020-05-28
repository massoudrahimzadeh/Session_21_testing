import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {


    @Test
    void divide() {
        Operations op = new Operations();
        int result=op.divide(10,5);
        assertEquals(2,result);
    }

    @Test
    void multiply() {
        Operations op = new Operations();
        int result=op.multiply(10,5);
        assertEquals(50,result);

    }

    @Test
    void sum() {
        Operations op = new Operations();
        int result=op.sum(10,5);
        assertEquals(15,result);
    }

    @Test
    void difference() {
        Operations op = new Operations();
        int result=op.difference(10,5);
        assertEquals(5,result);
    }
}