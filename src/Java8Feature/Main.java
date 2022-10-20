package Java8Feature;

public class Main {
    public static void main(String[] args) {
//        anonymous class
        LambdaExpression lb = new LambdaExpression() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        System.out.println(lb.sum(71, 20));

        LambdaExpression lb1 = (a, b) -> a + b;
        System.out.println(lb1.sum(20, 35));
    }
}
