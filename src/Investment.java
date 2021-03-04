public class Investment {
    public static void main(String[] args)
    {

        double inicial = 1000.0; // Initial Value
        double monthly = 1000.0; // Monthly amount I will invest
        double rate = 0.01;    // Rate of return
        int meses = 48;  // Total of months investing the same amount

        System.out.println(inicial);
        System.out.println(rate);
        System.out.println(meses);

        int mes = 0;

        while (mes < meses ) {
            double total_money;

            total_money = inicial + (inicial * rate);

            inicial = total_money;
            inicial += monthly;
            mes += 1;

            System.out.printf("The total of money after %d months is: %1.2f", mes, total_money);
            System.out.println();

        } // End of while

    } //End of main()

} //End of the Class
