public class Test{
    int x = 10;

    public static void main(String args[]){
        System.out.println("Entry Point Method -> Compulsory");
        System.out.println(args[0]);
    }

    //Method-1
    public static String main1(String[] args){
        System.out.println("Return Type -> String");
        return "Method-1";
    }

    //Method-2
    public static int main2(String args[]){
        System.out.println("Return Type -> Integer");
        return 20;
    }

    //Method-3
    public static void main3(String args[]){
        System.out.println("Return Type -> Void");
    }
}

