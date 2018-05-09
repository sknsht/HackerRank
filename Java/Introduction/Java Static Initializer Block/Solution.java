    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag = B > 0 && H > 0;

    static {
        if (!flag)
            System.out.println("java.lang.Exception: Breadth and height must be positive");
    }