import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
      Assert.assertTrue("Wrong number!:(", this.getLocalNumber() == 14);
    }
}
