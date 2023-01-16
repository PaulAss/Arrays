class Main {
  public static void main(String[] args) {
    
    int[] values;
    values = new int[3];
    System.out.println(values[0]);

    values[0]=20;
    values[1]=30;
    values[2]=40;

    System.out.println(values[0]);
    System.out.println(values[1]);
    System.out.println(values[2]);

    for(int i=0;i<values.length;i++){
      System.out.println(values[i]);
    }
    int[] number = {4,7,10};

    System.out.println(number[0]);
    System.out.println(number[1]);
    System.out.println(number[2]);

    for(int i=0;i<number.length;i++){
      System.out.println(number[i]);
    }
  }
}