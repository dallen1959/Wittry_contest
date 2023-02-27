import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StudentIRobotTest extends junit.framework.TestCase
{
   public void testIRobot01()
   {
      List<String> colors = new ArrayList<String>();
      colors.add("RED");
      colors.add("BLUE");
      colors.add("ORANGE");
      colors.add("YELLOW");
      colors.add("GREEN");
      colors.add("VIOLET");
      colors.add("INDIGO");

      IRobot ir = new IRobot(colors);
      ir.command("pick up RED block with MIDDLE hand");
      ir.command("pick up BLUE block with LEFT hand");
      ir.command("pick up GREEN block with RIGHT hand");
      ir.command("place block in LEFT hand on VIOLET block");
      ir.command("place block in MIDDLE hand on BLUE block");
      ir.command("pick up INDIGO block with MIDDLE hand");
      ir.command("place block in MIDDLE hand on ORANGE block");

      assertEquals("YES", ir.question("is the VIOLET directly on the table"));
      assertEquals("YES", ir.question("is your MIDDLE hand empty"));
      assertEquals("NO", ir.question("is your RIGHT hand empty"));
      assertEquals("YES", ir.question("is the YELLOW directly on the table"));
      assertEquals("RED", ir.question("what is the color of the block directly on top of the BLUE block"));
      assertEquals("YES", ir.question("is there anything directly on top of the VIOLET block"));
      assertEquals("YES", ir.question("is there anything directly on top of the BLUE block"));
      assertEquals("YES", ir.question("is there anything directly on top of the ORANGE block"));

      assertEquals("GREEN", ir.question("what is the color of the block in your RIGHT hand"));
      assertEquals("NO", ir.question("is the GREEN directly on the table"));
      ir.command("drop block in RIGHT hand on table");

      assertEquals("YES", ir.question("is the YELLOW directly on the table"));
      ir.command("pick up YELLOW block and place on GREEN block");
      assertEquals("YES", ir.question("is there anything directly on top of the GREEN block"));
   }
}