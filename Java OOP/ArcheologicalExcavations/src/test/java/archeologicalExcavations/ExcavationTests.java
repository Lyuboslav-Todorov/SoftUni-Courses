package archeologicalExcavations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExcavationTests {
    private Excavation excavation;
    private Archaeologist archaeologist;

    @Before
    public void setUp() {
        this.excavation = new Excavation("bones", 2);
        this.archaeologist = new Archaeologist("Peter", 10);
    }

    @Test
    public void testGetCount() {
        this.excavation.addArchaeologist(this.archaeologist);
        Assert.assertEquals(1, excavation.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddArchaeologistThrowsExceptionForFullCapacity() {
        this.excavation.addArchaeologist(this.archaeologist);
        Archaeologist testArchaeologist = new Archaeologist("John", 5);
        Archaeologist testArchaeologist2 = new Archaeologist("Marin", 7);
        this.excavation.addArchaeologist(testArchaeologist);
        this.excavation.addArchaeologist(testArchaeologist2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddArchaeologistWithSameNameThrowsException() {
        this.excavation.addArchaeologist(this.archaeologist);
        Archaeologist testArchaeologist = new Archaeologist("Peter", 10);
        this.excavation.addArchaeologist(testArchaeologist);
    }

    @Test
    public void testRemoveArchaeologist() {
        this.excavation.addArchaeologist(this.archaeologist);
        Assert.assertTrue(this.excavation.removeArchaeologist("Peter"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorThrowsExceptionForLessThanZeroCapacity() {
        this.excavation = new Excavation("bon", -1);
        this.archaeologist = new Archaeologist("Peter", 10);
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameNotNullOrEmpty() {
        this.excavation = new Excavation(null, 2);
        this.archaeologist = new Archaeologist("Peter", 10);
    }
}
