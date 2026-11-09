
public class Stringarray {
    public static void main(String[] args) {

        String[] sentences = {
            "All the best",
            "better luck next time",
            "Don't Lose your hope",
            "Time is gold",
            "target acheiver",
            "you can,you did",
            "unStopbable"
        };

        int maxCount = 0;
        String maxSentence = "";

        for(int i=0;i<sentences.length;i++){
            int count = 0;
            String str = sentences[i].toLowerCase();
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            System.out.println(sentences[i] + " = " + count);
            if (count > maxCount) {
                maxCount = count;
                maxSentence = sentences[i];
            }
        }

        System.out.println("\nSentence with highest vowels: " + maxSentence);
        System.out.println("Highest vowel count: " + maxCount);
    }
}
