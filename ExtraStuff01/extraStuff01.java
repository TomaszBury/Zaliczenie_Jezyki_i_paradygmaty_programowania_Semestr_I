package ExtraStuff01;

public class extraStuff01 {
    public static void main(String[] args) {
        int chosenInt = getRandomNumber(70, 9999);
        String result = String.valueOf(chosenInt);

        System.out.println(result);

        while (chosenInt > 1) {
            if (chosenInt % 2 == 0){
                chosenInt = chosenInt / 2;
                result += " " + String.valueOf(chosenInt);
            }else{
                chosenInt = chosenInt * 3 + 1;
                result += " " + String.valueOf(chosenInt);
            }
        }
        System.out.println(result);
    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    
}
