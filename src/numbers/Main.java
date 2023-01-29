package numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
    intList.sort(Comparator.naturalOrder());
    for (Integer intValue : intList) {
      if (intValue > 0 && intValue % 2 == 0) {
        System.out.println(intValue);
      }
    }
  }
}
