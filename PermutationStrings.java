public class PermutationStrings{
    public static void main(String[] args) {
        System.out.println(permutation("cat", "aaa"));
    }

    public static boolean permutation(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        int[] letters = new int[128];
        char[] s_array = s.toCharArray();
        for (char c: s_array){
            letters[c]++;
        }

        for(char e: t.toCharArray()){
            letters[e]--;
            if(letters[e]<0){
                return false;
            }
        }

        return true;
    }
}