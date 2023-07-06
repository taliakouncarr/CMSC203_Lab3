import junit.framework.TestCase;

public class GradeBookTester extends TestCase {
	//create 2 objects
	GradeBook grade1;
	GradeBook grade2;
	
	protected void setUp() throws Exception {
		//make them hold 5 scores
		 grade1 = new GradeBook(5);
		 grade2 = new GradeBook(5);
		
		//adding the scores
		grade1.addScore(55.0);
		grade1.addScore(60.0);
		grade2.addScore(70.0);
		grade2.addScore(80.0);
		grade2.addScore(50.0);
		
		super.setUp();
	}

	protected void tearDown() throws Exception {
		grade1= null;
		grade2=null;
		super.tearDown();
	}

	public void testAddScore() {
		
		assertEquals(2.0, grade1.getScoreSize(), .001);
		assertEquals(3.0, grade2.getScoreSize(), .001);
		
		assertTrue(grade1.toString().equals("55.0 60.0 "));
		assertTrue(grade2.toString().equals("70.0 80.0 50.0 "));
		
		
	}

	public void testSum() {
		assertEquals(115.0, grade1.sum(), .0001);
		assertEquals(200.0, grade2.sum(), .001);	
	}

	public void testMinimum() {
		assertEquals(55.0, grade1.minimum(), .001);
		assertEquals(50.0, grade2.minimum(), .001);
	}

	public void testFinalScore() {
		assertEquals(60.0, grade1.finalScore(), .001);
		assertEquals(150.0, grade2.finalScore(), .001);
	}

	
	//public void testGetScoreSize() {
		//fail("Not yet implemented");
	//}

	//public void testToString() {
		//fail("Not yet implemented");
//	}

}
