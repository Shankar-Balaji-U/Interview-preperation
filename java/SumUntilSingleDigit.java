class SumUntilSingleDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long value = input.nextLong();
    }

    public long sum(long value) {
        while (value > 9) {
            long sum = 0L;
            
            while (value != 0) {
                sum = sum % 10;
                value = value / 10;
            }
            value = sum;
        }

        return value;
    }
}
