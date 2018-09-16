package company;

import java.math.BigDecimal;

public final class Salary {

    public BigDecimal getAmount() {
        return new BigDecimal(amount.longValueExact());
    }

    private final BigDecimal amount;

    public Salary(BigDecimal amount){
        this.amount=amount;
    }

    @Override
    public String toString() {
        return "company.Salary{" +
                "amount=" + amount +
                '}';
    }
}
