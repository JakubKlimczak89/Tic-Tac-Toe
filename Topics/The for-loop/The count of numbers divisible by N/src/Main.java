class Main {
    public static void main(String[] args) {

        char[] characters = { 'a', 'b', 'c', 'a', 'b', 'c', 'a' };
        int count = 0;
        int count1 = 0;

        for (char ch :
                characters) {
            if (ch == 'a') {
                count++;
            }
        }
        System.out.println("The amount of \"A's\" in array = " + count);

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == 'a') {
                count1++;
            }

        }
        System.out.println(count1);



    }
}