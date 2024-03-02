public class Main {
    public static void main(String[] args) {
        int num = 2;
        int qalan = num % 2;
        //System.out.println(qalan);
        boolean flag = true;
        if (num == 1){
            flag = false;
        }
        else if (num < 2) {
            System.out.println("INVALID number");
        }
        for(int i = 2;i < num/2;i ++){
            if(num % i == 0){
                flag = false;
            }
        }
        if(flag){
            System.out.println("That is Prime");
        }
        else{
            System.out.println("That is not Prime");
        }
    }
}
