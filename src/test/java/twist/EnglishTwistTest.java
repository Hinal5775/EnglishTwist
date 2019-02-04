package twist;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnglishTwistTest {


    @Test
    public void emptyStringAtIndex0() {
        //setup
        EnglishTwist twist = new EnglishTwist();
        List<String> expected = new ArrayList<>();

        //exercise
        List<String> actual = twist.play(new ArrayList<>());

        //asset
        Assert.assertEquals("If a list is empty return an empty list", expected, actual);
    }

    @Test
    public void allWordsMatchTogether() {
        //Setup
        List<String> expected = Arrays.asList("dog", "goose", "elephant", "tiger", "rhino", "orc", "cat");
        EnglishTwist twist = new EnglishTwist();

        //Exercise
        List<String> actual = twist.play(expected);

        //Assert
        Assert.assertEquals("You will be given a list of strings, a transcript of an English Shiritori match. ", expected, actual);
    }

    @Test
    public void wordNotMatch() {
        //Setup
        List<String> expected = Arrays.asList("dog", "goose");
        EnglishTwist twist = new EnglishTwist();

        //Exercise
        List<String> actual = twist.play(Arrays.asList("dog", "goose", "tiger", "cat"));

        //Assert
        Assert.assertEquals("return a list that contains every valid string until the mistake. ", expected, actual);
    }

    @Test
    public void invalidEmptyString() {
        //Setup
        List<String> expected = Arrays.asList("dog", "goose");
        EnglishTwist twist = new EnglishTwist();

        //Exercise
        List<String> actual = twist.play(Arrays.asList("dog", "goose", "", "cat"));

        //Assert
        Assert.assertEquals(" If one of the elements is an empty string, that is invalid and should be handled.", expected, actual);
    }

    @Test
    public void invalidEmptyStringAtIndex0() {
        //Setup
        List<String> expected = new ArrayList<>();
        EnglishTwist twist = new EnglishTwist();

        //Exercise
        List<String> actual = twist.play(Arrays.asList("", "goose", "", "cat"));

        //Assert
        Assert.assertEquals(" If first element is empty, expected empty list as a result", expected, actual);
    }

}
