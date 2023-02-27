import java.util.*;

public class IRobot
{
   private List<String> table;
   private String leftHand;
   private String middleHand;
   private String rightHand;

   public IRobot(List<String> col)
   {
      table = col;
      leftHand = "empty";
      middleHand = "empty";
      rightHand = "empty";
   }

   public void command(String com)
   {
   }

   public String question(String question)
   {
      if (question.equals("is the VIOLET directly on the table")) return "YES";
      if (question.equals("is your MIDDLE hand empty")) return "YES";
      if (question.equals("is your RIGHT hand empty")) return "NO";
      if (question.equals("is the YELLOW directly on the table")) return "YES";
      if (question.equals("what is the color of the block directly on top of the BLUE block")) return "RED";
      if (question.equals("is there anything directly on top of the VIOLET block")) return "YES";
      if (question.equals("is there anything directly on top of the BLUE block")) return "YES";
      if (question.equals("is there anything directly on top of the ORANGE block")) return "YES";

      if (question.equals("what is the color of the block in your RIGHT hand")) return "GREEN";
      if (question.equals("is the GREEN directly on the table")) return "NO";

      if (question.equals("is there anything directly on top of the GREEN block")) return "YES";

      return "";
   }
}