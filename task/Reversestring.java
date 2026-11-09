// import java.util.Scanner;
public class Reversestring {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        //  Reverse a string Input: "hello" → Output: "olleh"
        String s1 = "hello";
        for(int i=s1.length()-1;i>=0;i--){
            System.out.print(s1.charAt(i));
        }
        System.out.println();

        //  Check palindrome Input: "madam" → Output: true
        String s2="madam";
        // String s3=s2;
        int count=0;
        for (int i = 0; i < s2.length()/2; i++) {
            if (s2.charAt(i) == s2.charAt(s2.length()-1-i)) {
                count++;
                // System.out.println(s2.charAt(i)+"="+s3.charAt(j));
            }
        }
        if(count==s2.length()/2){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        // Count vowels and consonants Input: "hello" → Output: Vowels = 2, Consonants = 3
        String s4="hello";
        int vcount=0,ccount=0;
        for(int i=0;i<s4.length();i++){
            char ch=s4.toLowerCase().charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vcount++;
            }
            else{
                ccount++;
            }
        }
        System.out.println("Vowels:"+vcount+" Consonants:"+ccount);

        //   Count characters Input: "java" → Output: 4
        String s5="java";
        int c=0;
        for(int i=0;i<s5.length();i++){
            // System.out.print(s5.charAt(i));
            c++;
        }
        System.out.println(c);

        //  Convert lowercase to uppercase Input: "java" → Output: "JAVA" 
        String s7="java";
        for(int i=0;i<s7.length();i++){
            System.out.print(s7.toUpperCase().charAt(i));
        }
        System.out.println();

        //  Count words in a sentence Input: "I love Java" → Output: 3
        String s6="I love Java";
        // s6.trim();
        // System.out.println(s6);
        int words=1;
        for(int i=0;i<s6.trim().length();i++){
            char ch= s6.charAt(i);
            if(ch==' '){
                words++;
            }
        }
        System.out.println(words);

        // Remove spaces Input: "ja va code" → Output: "javacode" 
        String s8="ja va code";
        String s9="";
        for(int i=0;i<s8.length();i++){
            char ch=s8.charAt(i);
            if(ch==' '){
                continue;
            }
            s9+=ch;
        }
        System.out.println(s9);

        // Count a specific character Input: "banana", character = 'a' → Output: 3
        String   s10="banana";
        char ch='a';
        int lcount=0;
        for(int i=0;i<s10.length();i++){
            char ch1=s10.toLowerCase().charAt(i);
            if(ch==ch1){
                lcount++;
            }
        }
        System.out.println("banana"+lcount);

        //  Compare two strings Input: "java", "java" → Output: true
        String s11="java";
        String s12="java";
        boolean f1=true;
        if(s11.length()!=s12.length()){
            f1=false;
        }else{
            for(int i=0,j=0;i<s11.length()&&j<s12.length();i++,j++){
                if(s11.charAt(i) != s12.charAt(j)){
                    f1 = false;
                    break;
                }
            }  
        }
        System.out.println(f1);
        
        // Remove duplicate characters Input: "programming" → Output: "progamin"
        String s13= "programming";
        String s14="";
        for(int i=0;i<s13.length();i++){
            char chs = s13.charAt(i);
            if(s14.indexOf(chs)==-1){
                s14=s14+chs;
            }
        }
        System.out.println(s14);

        // Character frequency Input: "aabbc" → Output: a=2, b=2, c=1
        String s15="aabbcc";
        for (int i = 0; i < s15.length(); i++) {
            int counter = 0;
            boolean countf = false;
            for (int j = 0; j < i; j++) {
                if (s15.charAt(i) == s15.charAt(j)) {
                    countf = true;
                    break;
                }
            }

            if (countf == false) {

                for (int j = 0; j < s15.length(); j++) {

                    if (s15.charAt(i) == s15.charAt(j)) {
                        counter++;
                    }
                }

                System.out.print(s15.charAt(i) + " = " + counter);
            }
        }
        System.out.println();

        // First non-repeating character Input: "swiss" → Output: 'w'
        String s16="swiss";
        for(int i=0;i<s16.length();i++){
            int nr=0;
            for(int j=0;j<s16.length();j++){
                if(s16.charAt(i)==s16.charAt(j)){
                    nr++;
                }
            }
            if(nr==1){
                System.out.println(s16.charAt(i));
                break;
            }
        }

        // First repeating character Input: "abca" → Output: 'a'
        String s17="abca";
        for(int i=0;i<s17.length();i++){
            int r=0;
            for(int j=0;j<s17.length();j++){
                if(s17.charAt(i)==s17.charAt(j)){
                    r++;
                }
            }
            if(r>1){
                System.out.println(s17.charAt(i));
                break;
            }
        }

        // Check anagrams Input: "listen", "silent" → Output: true
        String s18="slient";
        String s19="listen";
        boolean b=true;
        for(int i=0;i<s18.length();i++){
            int count1=0; 
            for(int j=0;j<s19.length();j++){
                if(s18.charAt(i)==s19.charAt(j)){
                    count1++;
                }
            }
            if(count1==0){
                b=false;
                break;
            }
        }
        if(b==false){
            System.out.println("false");
        }
        else{
            System.out.println("true");
        }

        // Remove duplicate words Input: "java is java easy" → Output: "java is easy"
        String s20="java is java easy";
        String[] arr=s20.split(" ");
        String s21="";
        for(int i=0;i<arr.length;i++){
            boolean f=false;
            for(int j=0;j<i;j++){
                if(arr[i].equals(arr[j])){
                    f=true;
                    break;
                }
            }
            if(f==false){
                    s21=s21+arr[i]+" ";
            }
        }
        System.out.println(s21.trim());

        // Find the longest word Input: "I love programming" → Output: "programming"
        String s22="I Love programming";
        String[] arr1=s22.split(" ");
        String longest=arr1[0];
        for(int i=0;i<arr1.length;i++){
            if(arr1[i].length()>longest.length()){
                longest=arr1[i];
            }
        }
        System.out.println(longest);

        // Count each word's frequency Input: "java code java" → Output: java=2, code=1
        String s26 = "java code java";
        String[] arr2=s26.split(" ");
        for(int i=0;i<arr2.length;i++){
            boolean f=false;
            for(int j=0;j<i;j++){
                if(arr2[i].equals(arr2[j])){
                    f=true;
                    break;
                }
            }
            if(f==false){
                int countes =0;
                for(int k=0;k<arr2.length;k++){
                    if(arr2[i].equals(arr2[k])){
                        countes++;
                    }
                }
                System.out.println(arr2[i]+"="+countes);
            }
        }

        // Check string rotation Input: "abcd", "cdab" → Output: true
        String s24="abcd";
        String s25="cdab";
        if(s24.length()==s25.length()){
            String res=s24+s24;
            if(res.contains(s25)){
                System.out.println("True");
            }
        }
        else{
                System.out.println("False");
        }

        // Find the longest substring without repeating characters Input: "abcabcbb" → Output: 3 ("abc")

        // Run-length encoding Input: "aabbcca" → Output: "a2b2c2a1"
        String s23="aabbca";
        String r="";
        int counts=1;
        for(int i=0;i<s23.length()-1;i++){
            if(s23.charAt(i)==s23.charAt(i+1)){
                counts++;
            }
            else{
                r=r+s23.charAt(i)+counts;
                counts=1;
            }
        }
        r=r+s23.charAt(s23.length()-1)+counts;
        System.out.println(r);
    }
}