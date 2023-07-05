public class GRT {
    public static void main(String[] args) {
        if (args.length > 0) {
            int max = Integer.parseInt(args[0]);
            for (int i = 1; i < args.length; i++) {
                int num = Integer.parseInt(args[i]);
                if (num > max) {
                    max = num;
                }
            }
            System.out.println("The greatest number is: " + max);
        } else {
            System.out.println("No arguments found.");
        }
    }
}
