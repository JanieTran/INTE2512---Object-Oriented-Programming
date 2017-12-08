package Week3_String_RegEx;

public class String_RegEx {
    public static void main(String[] args) {
        String s1 = "Hello World!";
        String s2 = new String("Hello World!");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.concat(s2));
        System.out.println(s1.length());
        System.out.println(s1.charAt(6));
        System.out.println(s1.substring(2,8));
        System.out.println();

        String[] s3 = s1.split("");
        for (int i = 0; i < s3.length; i++) {
            System.out.print(s3[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.printf("%6.2f\n", Math.PI);
        System.out.println();

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] " + args[i]);
        }
        System.out.println();

        for (String s: args) {
            System.out.println(s);
        }
        System.out.println();

        int[] intArr = {1,2,3,4,5};
        for (int i : intArr) {
            System.out.println(i);
        }
    }
}
