package techtest.domain;

public class Accounts {
    private Account result;

    public Account getResult() {
        return result;
    }

    public void setResult(Account result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "result=" + result +
                '}';
    }
}
