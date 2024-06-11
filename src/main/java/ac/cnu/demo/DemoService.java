package ac.cnu.demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    private double interestRate = 0.10;

    public int getExpectedInterest(Integer deposit) {
        return (int) (deposit * interestRate);
    }
}
