package org.example;


public class integral<T extends forOneVariable> implements function<T> {
    public double a, b;
    public int numberOfIntervals;

    public integral(double a, double b, int numberOfIntervals) {
        if (a >= b) {
            throw new IllegalArgumentException("Нижний предел должен быть меньше верхнего.");
        }
        if (numberOfIntervals <= 0) {
            throw new IllegalArgumentException("Количество разбиений должно быть больше 0.");
        }
        this.a = a;
        this.b = b;
        this.numberOfIntervals = numberOfIntervals;
    }

    @Override
    public double calculate(T function) {
        if (a < function.getLLine() || b > function.getULine()) {
            throw new IllegalArgumentException("Область определения функции не содержит отрезок интегрирования.");
        }

        double step = (b - a) / numberOfIntervals;
        double sum = 0;

        for (int i = 0; i < numberOfIntervals; i++) {
            double x = a + i * step + step / 2;
            sum += function.evaluate(x) * step;
        }
        return sum;
    }
}