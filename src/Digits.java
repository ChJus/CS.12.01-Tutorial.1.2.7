import java.util.ArrayList;

public class Digits {
  private ArrayList<Integer> digitList = new ArrayList<>();

  public Digits(int num) {
    // Reject negative values
    if (num < 0)
      throw new IllegalArgumentException("The number passed to the constructor (" + num + ") cannot be negative!");

    // Convert to string and add each digit (loop through characters in string)
    String s = num + "";
    for (char c : s.toCharArray()) {
      digitList.add(Integer.parseInt(c + ""));
    }
  }

  public ArrayList<Integer> getDigitList() {
    return digitList;
  }


  // Checks if digits are strictly increasing from left to right
  public boolean isStrictlyIncreasing() {
    for (int i = 0; i < digitList.size() - 1; i++) { // Checks each pair digits (1, 2), (2, 3), ... (n-1, n)
      if (digitList.get(i) >= digitList.get(i + 1)) return false;
    }
    return true;
  }
}
