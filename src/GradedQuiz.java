class Sum {
    static int sum = 0;
    static void add(int i) { i++; }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) add(sum);
        System.out.println(sum);
    }
}