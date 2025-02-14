package org.example;


public class sum <T extends forOneVariable> implements function<T>{

    @Override
    public double calculate(T function) {
        double a = function.getLLine();
        double b = function.getULine();
        double middle = (a + b) / 2.0;

        return function.evaluate(a) + function.evaluate(middle) + function.evaluate(b);
    }
}