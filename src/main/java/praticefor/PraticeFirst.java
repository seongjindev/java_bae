package praticefor;

public class PraticeFirst {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("first");
        }

        for (int i = 1; i <= 10; i++) {
            System.out.print("\n");
            if(i<5){
                for(int j = 1; j<=i;j++){
                    System.out.print("*");
                }
            }else{
                for(int k = 10; k>=i;k--){
                    System.out.print("*");
                }
            }

        }

    }
}

