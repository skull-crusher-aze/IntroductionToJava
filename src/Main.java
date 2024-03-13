public class Main {
    public static void main(String[] args) {
        CustomerManager cM;
        CustomerManager cM2 = new CustomerManager();
        cM = cM2;
        cM.Add();
        cM.Remove();
        cM.Refreshed();
    }
}