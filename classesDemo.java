public class Main {
    public static void main(String[] args) {
        numberFinder();
        numberFinder();
    }
    public static void numberFinder(){
        int[] arr = {1,2,3,4,5,6,7,8};
        int fin = 9;
        boolean flag = false;
        for(int i : arr){
            if(i == fin){
                flag = true;
                break;
            }
        }
        if(flag){
            String mesaj = "movcuddur " + fin;
            prints(mesaj);
        }
        else{
            prints("movcud deyil " + fin);
        }
    }
    public static void prints(String fin){
        System.out.println(fin);
    }
}
