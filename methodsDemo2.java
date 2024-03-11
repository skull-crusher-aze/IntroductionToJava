public class Main {
    public static void main(String[] args) {
        String mesaj = "ashidasbdashda.";
        int s = toplama(5, 7,8,9,0,1,2,3,4,5,6,8);
        System.out.println(s);
    }
    public static void add(){
        System.out.println("Added!");
    }
    public static void remove(){
        System.out.println("Removed!!");
    }
    public static void refresh(){
        System.out.println("Refreshed!!!");
    }
    public static int topla(int say1, int say2){
        return say1 + say2;
    }
    public static int toplama(int... saylar){
        int cem = 0;
        for(int i : saylar){
            cem += i;
        }
        return cem;
    }
    public static String seher(){
        return "Sumqayit";
    }
}
