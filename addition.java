import java.util.Scanner;

class sum {
    protected int a;
    protected int b;

    Scanner sc = new Scanner(System.in);

    public void add() {
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
    }
}

class addition extends sum {
    public static void main(String[] args) {
        addition addObj = new addition();
        addObj.add();  // Call the add method to initialize a and b
        int result = addObj.a + addObj.b;
        System.out.println("The sum is: " + result);
    }
}
