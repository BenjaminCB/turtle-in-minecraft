package dat4project.turtleinminecraft.TurtleInterpreter;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
https://junit.org/junit5/docs/current/user-guide/index.html

ALT+ENTER on a CLASS
Create Test
Type: Junit 5 test
Checkoff what methods you want to have a test for
    Will create a new file, like this one, for you to put your tests in

To run the test RIGHTCLICK this/the test file and "Run 'NameOfTheFile'"

As we operate on a parsetree, testing is kinda inpossible as we don't know the context, and Antler does some work on it
*/

class ExecutionVisitorTest {

    @Test
    @Disabled
    void NameOfMethodTest(){
        assertEquals(1,1);
    }

    @Test
    void TrueTest(){
        assertEquals(10,10);
    }

    @Test
    void FalseTest(){
        assertEquals(9,21);
    }

}