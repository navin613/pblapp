public class arr10 {
        public static void main(String[] args) {
            if (args.length != 9)
                System.out.println("Please enter 9 integer numbers");
            else{
            int[][] a = new int[3][3];
            int c = 0;
            // storing input to 2d array

	    for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    a[i][j] = Integer.parseInt(args[c++]);
                }
            }

            int max = 0;
            // getting max of array
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                        max = a[i][j] > max ? a[i][j] : max;
		}
            }
            System.out.println("The biggest number in the given array is " + max);
            }
        }
}