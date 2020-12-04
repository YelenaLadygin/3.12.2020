  Scanner s = new Scanner(System.in);
        System.out.println("Please enter temperature ");
        float temperature = s.nextFloat();
        boolean temp = temperature > 36.5;
        if (temperature > 36.5) {
            System.out.println("Hot");
        }
        if (temperature < 36.5) {
            System.out.println(" Cold");
        }
      System.out.println("please enter your age ");
        int my_age = s.nextInt();
        boolean age = my_age> 18;
        if (my_age >= 18) {
            System.out.println("Grown up");
        }
        if (my_age <= 13) {
            System.out.println("Child");
        }
        System.out.println("Please enter number for a");
        double a = s.nextDouble();
        System.out.println("Please enter number for b");
        double b = s.nextDouble();
        boolean num = a>b;
        if (a > b) {
            System.out.println("a is bigger" + " " + a);
        }
        if (a < b) {
            System.out.println("b is bigger" + " " + b);
        }
