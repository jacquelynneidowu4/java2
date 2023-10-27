public class Calculator implements Calculatable {

    public Calculator() {

    }

    private String history = "";

    public Integer add(Integer number1, Integer number2) {
        history += number1 + "+" + number2 + "=" + (number1 + number2) + "\n";
        return number1 + number2;

    }

    ;

    public Integer subtract(Integer number1, Integer number2) {
        history += number1 + "-" + number2 + "=" + (number1 - number2);
        return number1 - number2;

    }

    ;

    public Integer multiply(Integer number1, Integer number2) {
        history += number1 + "*" + number2 + "=" + (number1 * number2);
        return number1 * number2;

    }

    ;

    public Integer divide(Integer number1, Integer number2) {
        history += number1 + "/" + number2 + "=" + (number1 / number2);
        return number1 / number2;

    }

    ;

    public String getHistory() {
        return history;

    }
}



