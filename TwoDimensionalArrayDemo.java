public class Main {
    public static void main(String[] args) {
        //2 Dimensional Arrays
        String[][] seherler = new String[3][3];
        seherler[0][0] = "Sumqayit";
        seherler[0][1] = "Baki";
        seherler[0][2] = "Xizi";
        seherler[1][0] = "Lenkeran";
        seherler[1][1] = "Astara";
        seherler[1][2] = "Lerik";
        seherler[2][0] = "Qarabag";
        seherler[2][1] = "Lacin";
        seherler[2][2] = "Kelbecer";
        for(int i = 0;i < 3;i ++){
            System.out.println("-------------------------");
            for(int j = 0;j < 3;j ++){
                System.out.print(seherler[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
