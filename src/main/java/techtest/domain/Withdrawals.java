package techtest.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Withdrawals {
    private Result<Withdrawal> result;

    public Result<Withdrawal> getResult() {
        return result;
    }

    public void setResult(Result<Withdrawal> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Withdrawals{" +
                "result=" + result +
                '}';
    }
}
