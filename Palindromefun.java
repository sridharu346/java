public class Palindromefun {

    public boolean IsPalindrome(int x){
        String n = String.valueOf(x);
        int m = n.length();
        for (int i =0, j = m-1; i<j; i++, j--){
            if(n.charAt(i )!= n.charAt(j))
            return false;
        }
        return true;

    }
    public static void main(String[] args) {
        Palindromefun obj = new Palindromefun();
        int[] testCases = {121, -121, 10, 12321, 12345};

        for(int testCase : testCases) {
            System.out.println(testCase + " " + obj.IsPalindrome(testCase));

        }

        
    }
    
}
