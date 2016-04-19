import org.junit.*;
import static org.junit.Assert.*;

public class NumToWordTest {

  @Test
  public void Scrabble_SingleLetterReturnValue_True() {
    NumToWord getTheWord = new NumToWord();
    String word = "one";
    assertEquals(word,getTheWord.getWord(1));
  }
}
