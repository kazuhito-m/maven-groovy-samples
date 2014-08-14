package sample

import org.junit.*

class GSampleTest {

    GSample sut
    
    @Before
    void setUp() {
        sut = new GSample()
    }

    @Test
    void testOneMethod() {
        // act an asserts
        assert sut.oneMethod().size() > 1
    }
    
}
