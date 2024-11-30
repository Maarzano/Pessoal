// tabuada inteira
package For;
public class Att1 {
    public static void main(String[] args) {
        System.out.println("Lá vem a tabuada...");

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    for(int num1 = 0;num1 <= 10;num1++){
        System.out.println();

        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int num2 = 0;num2 <= 10;num2++){

            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2) );
        }
    }
}
}
