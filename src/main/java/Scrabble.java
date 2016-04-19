import java.util.ArrayList;
import java.util.HashMap;

public class Scrabble {
  public static void main(String[] args) {}

  public Object getScore(String words){
    HashMap<String[], Integer> scrabbleValues = new HashMap<String[], Integer>();
    String[] valuesOne = {"a","e","i","o","u","l","n","r","s","t"};
    String[] valuesTwo = {"d","g"};
    Object[] totalArray = {valuesOne, valuesTwo};
    Integer total = 0;

    for (Integer index = 0; index < 2; index++){
        for(Integer index2 = 0; index2 < 5; index2++){
          if (totalArray[index][index2] == words){
            total = total + 1;
        }
      }
    }
    return total;
    // valuesOne.add("a");
    // valuesOne.add("e");
    // valuesOne.add("c");
    // scrabbleValues.put(valuesOne, 1);
    // for( Object key : scrabbleValues.keySet()) {
    //   for(Object keyArrayValue : key){
    //     if(keyArrayValue == words){
    //       Object value = scrabbleValues.get(key);
    //       return value;
    //     }
    //   }
    // }
  }
}
