import org.example.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyser_TestCase {
    @Test
    public void Get_HappyMood_Message()
    {
        MoodAnalyser ob = new MoodAnalyser("happy");
        String actual = ob.analyser("i am in happy mood");
        Assert.assertEquals("happy", actual );
    }
    @Test
    public void Get_SadMood_Message()
    {
        MoodAnalyser ob = new MoodAnalyser("sad");
        String actual = ob.analyser("i am in sad mood");
        Assert.assertEquals("sad", actual );
    }
}
