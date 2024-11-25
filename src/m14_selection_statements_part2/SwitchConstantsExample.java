package m14_selection_statements_part2;

public class SwitchConstantsExample {
    public static final int OPTION_ONE = 1;
    public static final int OPTION_TWO = 2;
    public static final int OPTION_THREE = 3;

    public static void main(String[] args) {
        int choice = 2;

        switch (choice){
            case OPTION_ONE:
                System.out.println("You picked 1");
                break;
            case 2:
                System.out.println("You picked 2");
                break;
        }
    }
}
