package techtest.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Deposits {
    private Result<Deposit> result;

    public Result<Deposit> getResult() {
        return result;
    }

    public void setResult(Result<Deposit> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Deposits{" +
                "result=" + result +
                '}';
    }
}
