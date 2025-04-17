public class Test {
  public void countDown(int n) {
    if (n <= 0) {
        return;
    }
    System.out.println(n);
    countDown(n - 1);
  }

  public int sumToN(int n) {
    if (n != 0) {
        return n + sumToN(n - 1);
    }
    return n; 
  }

  public void printDashes(int n) {
    if (n <= 0) {
        return;
    }
    System.out.print("-");
    printDashes(n - 1);
}
}
