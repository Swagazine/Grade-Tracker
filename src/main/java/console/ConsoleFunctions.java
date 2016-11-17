package console;

public class ConsoleFunctions {
    /* This class contains functions that are used in the GradeTrackerConsole */

    /* Global Variables (values for no, yes and quit) */
    String[] no = {"no", "n"};
    String[] yes = {"yes", "ye", "y"};
    String[] quit = {"quit", "q", "exit"};

    /* Returns whether input is valid or not */
    public boolean isNo(String input) {
        return checkInput(no, input);
    }

    public boolean isYes(String input) {
        return checkInput(yes, input);
    }

    public boolean isQuit(String input) {
        return checkInput(quit, input);
    }

    /* Checks the input (String) against a set of values (String[]) */
    private boolean checkInput(CharSequence[] value, String key) {

        key = cleanInput(key);
        System.out.println(key);

        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                return true;
            }   else {
                continue;
            }
        }

        return false;
    }

    /* Removes duplicate values in key for convenience */
    private String cleanInput(String input) {
        input = input.toLowerCase();
        input = input.replaceAll("(.)\\1{1,}", "$1");
        return input;
    }
}