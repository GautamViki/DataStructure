public class Main {
    public static void main(String[] args) {

        Demo demo = new Demo() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };
        System.out.println(demo.sum(5, 6));

        Demo demo1 = ((a, b) -> a + b);
        System.out.println(demo1.sum(2, 8));
    }
}