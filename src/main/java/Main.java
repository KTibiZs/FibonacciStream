import java.util.stream.Stream;
public class Main {
    public static void main(String[] args) {
        // stream for Fibonacci numbers
        Stream
                .iterate(new Node(0, 1, 1), n -> new Node(n.current, n.previous + n.current,
                        n.ordinalNumber + 1))
                .map(n -> n.ordinalNumber + ". " + n.previous)
                .limit(20)
                .forEach(System.out::println);
    }

    // inner class
    static class Node {
        private int previous;
        private int current;
        private int ordinalNumber;

        public Node(int previous, int current, int ordinalNumber) {
            this.previous = previous;
            this.current = current;
            this.ordinalNumber = ordinalNumber;
        }
    }
}
