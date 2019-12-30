import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
      Assert.assertTrue("Wrong number!:(", this.getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber()
    {
       Assert.assertTrue("Error: Less than 45", this.getClassNumber() > 45);
    }
}
