public class Calculator {
    public int add(int a, int b) {
        return a +b;
    }

    public int subtract (int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(String.format("total of 10 and 20 is: %d", c.add(10, 20)));
        System.out.println(String.format("Take away 10 from 20 is: %d", c.add(20, 10)));
    }
}
