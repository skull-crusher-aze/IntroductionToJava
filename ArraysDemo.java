public class Main {
    public static void main(String[] args) {
        //Array
        String sagird1 = "Malik";
        String sagird2 = "Eli";
        System.out.println(sagird1);
        System.out.println(sagird2);
        System.out.println("==Manual Bitti==");
        String[] sagirdder = new String[2];
        sagirdder[0] = "Malik";
        sagirdder[1] = "Eli";
        for(int i = 0;i < sagirdder.length;i ++){
            System.out.println(sagirdder[i]);
        }
        System.out.println("=======================");
        for(String i: sagirdder){
            System.out.println(i);
        }
    }
}
