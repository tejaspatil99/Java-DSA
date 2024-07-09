public class SwitchStatement {
    public static void main(String args[]){

        int button = 5;
        switch (button) {
            case 1: System.out.println("Volume up");
                 break;
            case 2: System.out.println("Volume Down");
                break;
            case 3: System.out.println("Next Song");
                 break;
            case 4: System.out.println("Previous Song");
                break;
            default: System.out.println("Repeat song");
                break;
        }

    }
}
