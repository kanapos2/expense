package csku.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class arrayCollectionTest {

    @Test
    public void testSizeZero() {
        arrayCollection arrayC = new arrayCollection();
        assertEquals(0 , arrayC.size());
    }

}