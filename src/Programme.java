import java.util.Arrays;

public class Programme {

    public static void main(String[] args){
        System.out.println("Config");


        BingoNumber[] bingoSheet = new BingoNumber[10];

        for (int i = 0; i < 10; i++){
         bingoSheet[i] = new BingoNumber(i);
        }
        System.out.println(Arrays.toString(bingoSheet));
    }
}
