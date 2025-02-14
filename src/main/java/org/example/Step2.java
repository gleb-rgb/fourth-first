package org.example;

import java.util.Arrays;

public class Step2
{
    public Step1 moduleStep1;
    public Step2(Step1 moduleStep1)
    {
        if(moduleStep1 == null)
        {
            throw new IllegalArgumentException("Не может быть null");
        }
        this.moduleStep1 = moduleStep1;
    }

    public double getMaxElement()
    {
        double[] roots = moduleStep1.execute();
        if(roots.length == 0)
        {
            throw new IllegalStateException("Нет корней у квадратного уравнения.");
        }
        return Arrays.stream(roots).max().orElseThrow();
    }
    @Override
    public String toString() {
        return "Квадратный трёхчлен: " + moduleStep1;
    }
    public static void main(String[] args) {
        Step1 equation = new Step1(1, -3, 2);
        Step2 rootFinder = new Step2(equation);
        System.out.println(rootFinder);
        System.out.println("Больший корень: " + rootFinder.getMaxElement());
    }
}