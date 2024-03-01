public class Main {
    public static void main(String[] args) {
        int say1 = 20;
        int say2 = 25;
        int say3 = 35;
        if(say1 > say2 && say1 > say3){
            System.out.println(say1);
       }
        else if(say2 > say1 && say2 > say3){
            System.out.println(say2);
        }
        else if(say3 > say1 && say3 > say2){
            System.out.println(say3);
        }
    }
}
