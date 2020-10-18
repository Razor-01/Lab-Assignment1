public class TrianglePrinting {
    public static void start(){
        for (int i=0;i<10;i++){
            for (int j=0;j<i;j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
        for (int i=10;i>=0;i--)
        {
            for(int j=0;j<i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        for (int i=10;i>0;i--){
            for (int j=10;j>i;j--){
                System.out.print(' ');
            }
            for (int k=1;k<=i;k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();
        for (int i=1;i<=10;i++) {
            for (int j=10;j>i;j--) {
                System.out.print(' ');
            } for (int k=1;k<=i;k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
