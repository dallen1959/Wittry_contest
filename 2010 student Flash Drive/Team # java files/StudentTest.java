import java.util.*;

/**
 * The test class studentTest.
 *
 * @author  Don Allen
 * @version 2010 programming contest
 */
public class StudentTest extends junit.framework.TestCase
{
   public void testAutomorphicNumber01()
   {
      AutomorphicNumber h = new AutomorphicNumber();

      assertEquals(false, h.isAutomorphicNumber(7));
      assertEquals(true, h.isAutomorphicNumber(5));
      assertEquals(true, h.isAutomorphicNumber(76));
      assertEquals(false, h.isAutomorphicNumber(11));

      int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 24, 25, 26, 75, 76};
//      ArrayList<Integer> ans = h.getAutomorphicNumberFromArray(numbers);
      ArrayList<Integer> sol = new ArrayList<Integer>();
      sol.add(new Integer(1));
      sol.add(new Integer(5));
      sol.add(new Integer(6));
      sol.add(new Integer(25));
      sol.add(new Integer(76));
      assertEquals(sol, h.getAutomorphicNumberFromArray(numbers));
   }

   public void testCircle01()
   {
      Point a = new Point(2, 4);
      Point b = new Point(6, 8);
      Point c = new Point(12, 4);
      
      Circle ans = new Circle(a, b, c);
      Point cc = new Point(7., 3.);

      assertEquals(cc.getX(), ans.getCenter().getX());
      assertEquals(cc.getY(), ans.getCenter().getY());
      assertEquals(Math.sqrt(26.), ans.getRadius());
   }

   public void testClimbThis01()
   {
      ClimbThis ladder = new ClimbThis( );
      ArrayList<String> words = new ArrayList<String>();
      words.add("BOY");
      words.add("TOY");
      words.add("TOE");
      assertEquals(true, ladder.isLadder(words));

      ladder = new ClimbThis( );
      words = new ArrayList<String>();
      words.add("HEAD");
      words.add("HEAL");
      words.add("VEAL");
      words.add("VEIL");
      words.add("VAIL");
      words.add("TAIL");
      assertEquals(true, ladder.isLadder(words));

      ladder = new ClimbThis( );
      words = new ArrayList<String>();
      words.add("CAME");
      words.add("CARE");
      words.add("CANT");
      words.add("WENT");
      assertEquals(false, ladder.isLadder(words));
   }

   public void testEdnaGoesToVegas01()
   {
       ArrayList<Fraction> die1 = new ArrayList<Fraction>();
       die1.add(new Fraction(1, 2));
       die1.add(new Fraction(1, 5));
       die1.add(new Fraction(3, 10));

       ArrayList<Fraction> die2 = new ArrayList<Fraction>();
       die2.add(new Fraction(1, 5));
       die2.add(new Fraction(1, 10));
       die2.add(new Fraction(3, 10));
       die2.add(new Fraction(2, 5));

       ArrayList<Fraction> die3 = new ArrayList<Fraction>();
       die3.add(new Fraction(1, 10));
       die3.add(new Fraction(9, 10));

       ArrayList< ArrayList<Fraction> > d = new ArrayList< ArrayList<Fraction> >();
       d.add(die1);
       d.add(die2);
       d.add(die3);
       Dice di = new Dice(d);
       EdnaGoesToVegas edna = new EdnaGoesToVegas(di);

       assertEquals(new Fraction(13, 125), edna.getProbability(5));

       Fraction f = new Fraction(1, 3);
       Fraction g = new Fraction(2, 3);
       f.add(g);
       assertEquals(new Fraction(2, 3), g);
       assertEquals(new Fraction(1, 1), f);

       Fraction j = new Fraction(1, 3);
       Fraction k = new Fraction(2, 3);
       j.multiply(k);
       assertEquals(new Fraction(2, 9), j);
       assertEquals(new Fraction(2, 3), k);
   }

   public void testManipulateThis01()
   {
      ManipulateThis str = new ManipulateThis("Manipulate");
      assertEquals("some string", str.toString());
   }

   public void testMoreFunctionsGoneWild00()
   {
      assertEquals(1499, MoreFunctionsGoneWild.f1(12));
      assertEquals(true, Math.abs(-939.40437 - MoreFunctionsGoneWild.f2(10)) < 0.05);
      assertEquals(true, Math.abs(19.26097 - MoreFunctionsGoneWild.f3(50, 1, 1)) < 0.05);
      assertEquals(true, Math.abs(0.0986123 - MoreFunctionsGoneWild.f4(1, 1)) < 0.05);
      assertEquals(true, Math.abs(1.41142 - MoreFunctionsGoneWild.f5(1, 2)) < 0.05);
      assertEquals(true, Math.abs(19.5191285 - MoreFunctionsGoneWild.f5(-1, 2)) < 0.05);
      assertEquals(true, Math.abs(1.066968 - MoreFunctionsGoneWild.f6(1., 2., 1.)) < 0.05);
      assertEquals(true, MoreFunctionsGoneWild.f7(false, true, false));
      assertEquals(true, MoreFunctionsGoneWild.f8(false, true, false, true));
      assertEquals(true, Math.abs(75997.8079512 - MoreFunctionsGoneWild.f9(5.69, 2.37, 5.03, 0.85, 4.11)) < 0.05);
      assertEquals(false, MoreFunctionsGoneWild.f10(false, false, true, false));
   }

   public void testPowerSquare01()
   {
      PowerSquare sq = new PowerSquare(3);
      sq.swapZeroDown();
      sq.swapZeroRight();

      int[] ans = sq.getFourPossibleNeighbors();
      ArrayList<Integer> temp = new ArrayList<Integer>();
      temp.add(new Integer(8));
      temp.add(new Integer(4));
      temp.add(new Integer(7));

      Set<Integer> s = new HashSet<Integer>();
      assertEquals(ans.length, temp.size());
      for (int j = 0; j < ans.length; j++)
      {
         assertEquals(true, temp.contains(ans[j]));
         s.add(ans[j]);
      }
      assertEquals(ans.length, s.size());
   }
   public void testGameSet01()
   {
      Card c1 = new Card (1, "square" , "red", "clear");
      Card c2 = new Card (2, "square" , "red", "clear");
      Card c3 = new Card (3, "square" , "red", "clear");
      Card c4 = new Card (1, "square" , "blue", "clear");

      assertEquals(true, GameSet.isSet(c1, c2, c3));
      assertEquals(false, GameSet.isSet(c1, c2, c4));

      assertEquals(c3, GameSet.makeSet(c1, c2));

      Card[] temp = {  new Card(2, "square", "red", "dashed"),     
                        new Card(2, "circle", "green", "dashed"),
                        new Card(3, "square", "red", "dashed"),
                        new Card(2, "triangle", "blue", "solid"),
                        new Card(2, "triangle", "green", "clear"),
                        new Card(3, "square", "blue", "dashed"),
                        new Card(1, "square", "blue", "dashed"),
/* 8 */                 new Card(3, "circle", "red", "clear"),
                        new Card(1, "triangle", "blue", "solid"),
                        new Card(1, "square", "green", "clear"),
                        new Card(3, "triangle", "green", "clear"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "square", "green", "clear"),
                        new Card(1, "square", "green", "clear") };
      assertEquals(false, GameSet.containsSet(temp));

      Card[] temp1 = {  new Card(2, "square", "red", "dashed"),
                        new Card(2, "circle", "green", "dashed"),
                        new Card(3, "square", "red", "dashed"),
                        new Card(2, "triangle", "blue", "solid"),
                        new Card(2, "triangle", "green", "clear"),
                        new Card(3, "square", "blue", "dashed"),
                        new Card(1, "square", "blue", "dashed"),
/* 8 */                 new Card(3, "square", "red", "clear"),
                        new Card(1, "triangle", "blue", "solid"),
                        new Card(1, "square", "green", "clear"),
                        new Card(3, "triangle", "green", "clear"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "circle", "blue", "dashed"),
                        new Card(3, "square", "green", "clear"),
                        new Card(1, "square", "green", "clear") };
      assertEquals(true, GameSet.containsSet(temp1));
   }

   public void testTextMessaging01()
   {
      TextMessaging tx = new TextMessaging();

      tx.addTableEntry( new TableEntry("i", 8));
      tx.addTableEntry( new TableEntry("am", 2));
      tx.addTableEntry( new TableEntry("art", 1));

      assertEquals("i", tx.getWord("4"));
      assertEquals("am", tx.getWord("26"));
      assertEquals("i am art", tx.getTextMessage("4 26 278"));

      tx = new TextMessaging();

      tx.addTableEntry( new TableEntry("i", 8));
      tx.addTableEntry( new TableEntry("that", 7));
      tx.addTableEntry( new TableEntry("is", 6));
      tx.addTableEntry( new TableEntry("an", 4));
      tx.addTableEntry( new TableEntry("am", 2));
      tx.addTableEntry( new TableEntry("artist", 1));

      assertEquals("i", tx.getWord("4"));
      assertEquals("am", tx.getWord("26"));
      assertEquals("an", tx.getWord("260"));
      assertEquals("artist", tx.getWord("278478"));
      assertEquals("i am an artist", tx.getTextMessage("4 26 260 278478"));
   }

   public void testTrainTracks01()
   {
      int k = 0;
      int [][] tracks= { {3, 1, 3, 2, 3}, {3, 1, 1, 1, 2}, {1, 1, 3, 2, 1} };
      TrainTracks thomas = new TrainTracks( tracks );
      ArrayList<String> sol = thomas.getRoute();
      assertEquals(15, sol.size());
      String[] blocks = {"A1", "A2", "A3", "B3", "C3", "C4", "B4", "A4", "A5", "B5", "B4", "B3", "B2", "B1", "A1"};
      for(String b : blocks)
      {
         assertEquals(b, sol.get(k));
         k++;
      }
   }
}