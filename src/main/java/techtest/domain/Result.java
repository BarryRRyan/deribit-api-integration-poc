package techtest.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import techtest.domain.Deposit;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result<T> {
    private T[] data;
    private long count;

    public T[] getData() {
        return data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Result{" +
                "data=" + Arrays.toString(data) +
                ", count=" + count +
                '}';
    }
}
