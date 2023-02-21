import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2018 Wittry programming contest
 */
public class KeyboardKeyBoardCalculationsStudentTest extends junit.framework.TestCase
{
    public void testKeyboard01()
    {
        assertEquals(0, KeyBoardCalculations.kbDistance("A", "A"));
        assertEquals(1, KeyBoardCalculations.kbDistance("E", "R"));
        assertEquals(3, KeyBoardCalculations.kbDistance("W", "C"));
        assertEquals(8, KeyBoardCalculations.kbDistance("Q", "M"));

        assertEquals(1.0, KeyBoardCalculations.averageDistance("WAS"), 0.0002);
        assertEquals(5.0 / 3., KeyBoardCalculations.averageDistance("KING"), 0.0002);
        assertEquals(19.0 / 5, KeyBoardCalculations.averageDistance("SAMPLE"), 0.0002);
        assertEquals(19.0 / 7, KeyBoardCalculations.averageDistance("COMPUTER"), 0.0002);
        assertEquals(18 / 6, KeyBoardCalculations.averageDistance("AVERAGE"), 0.0002);
        assertEquals(40.0 / 6, KeyBoardCalculations.averageDistance("ALABAMA"), 0.0002);

        assertEquals(0, KeyBoardCalculations.numDirectionChanges("MIK"));
        assertEquals(0, KeyBoardCalculations.numDirectionChanges("MJU"));
        assertEquals(0, KeyBoardCalculations.numDirectionChanges("WZA"));
        assertEquals(0, KeyBoardCalculations.numDirectionChanges("NHY"));
        assertEquals(1, KeyBoardCalculations.numDirectionChanges("JUM"));
        assertEquals(1, KeyBoardCalculations.numDirectionChanges("WAZ"));
        assertEquals(1, KeyBoardCalculations.numDirectionChanges("TFV"));
        
        assertEquals(0, KeyBoardCalculations.numDirectionChanges("KING"));
        assertEquals(1, KeyBoardCalculations.numDirectionChanges("WAS"));
        assertEquals(2, KeyBoardCalculations.numDirectionChanges("SAMPLE"));
        assertEquals(4, KeyBoardCalculations.numDirectionChanges("COMPUTER"));
        assertEquals(5, KeyBoardCalculations.numDirectionChanges("AVERAGE"));
        assertEquals(5, KeyBoardCalculations.numDirectionChanges("ALABAMA"));

        assertEquals("elementary", KeyBoardCalculations.wordDifficulty("WAS"));
        assertEquals("basic", KeyBoardCalculations.wordDifficulty("KING"));
        assertEquals("so-so", KeyBoardCalculations.wordDifficulty("SAMPLE"));
        assertEquals("average", KeyBoardCalculations.wordDifficulty("COMPUTER"));
        assertEquals("demanding", KeyBoardCalculations.wordDifficulty("AVERAGE"));
        assertEquals("challenging", KeyBoardCalculations.wordDifficulty("ALABAMA"));
    }
}