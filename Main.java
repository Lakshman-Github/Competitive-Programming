class Main {

  public static void main(String args[]) {
    int n = 5;
    //Printing Upper Half for n rows
    //Loop to iterate over each row
    for (int i = 1; i <= n; i++) {
      //Loop to iterate over each column of the ith row
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    //Printing Lower Half for n-1 rows
    //Loop to iterate over each row in reverse order
    for (int i = n - 1; i >= 1; i--) {
      //Loop to iterate over each column of the ith row
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
