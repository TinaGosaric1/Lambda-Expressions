public class Main {
    public static void main(String[] args) {

        // without lambda expression

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from the Runnable1");
            }
        }).start();

        // with lambda expression

        new Thread(()-> {
            System.out.println("Printing from the Runnable2");
            System.out.println("One more statement");
        }).start();
    }
}