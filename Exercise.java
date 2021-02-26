public class Exercise {
    public static void main(String[] args) {

        int numOne = 3;
        System.out.println(or35(numOne));

    }
    


    // Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod

    // or35(3) → true
    // or35(10) → true
    // or35(8) → false

    public static boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
        
    }
}