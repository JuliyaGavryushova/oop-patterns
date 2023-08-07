package homework.model;

import builder.item.Characteristic;

public final class Calculator implements Calculable {
    private double argument1;
    private double argument2;

    @Override
    public double sum(double arg1, double arg2) {
        return arg1 + arg2;
    }

    @Override
    public double dif(double arg1, double arg2) {
        return arg1 - arg2;
    }

    @Override
    public double multi(double arg1, double arg2) {
        return arg1 * arg2;
    }

    @Override
    public double div(double arg1, double arg2) {
        return arg1 / arg2;
    }

//    private Calculator(Builder builder) {
//        this.argument1 = builder.argument1;
//        this.argument2 = builder.argument2;
//    }
//
//    public static class Builder {
//        private double argument1;
//        private double argument2;
//
//        public Builder argument1(double argument1) {
//            this.argument1 = argument1;
//            return this;
//        }
//
//        public Builder argument2(double argument2) {
//            this.argument2 = argument2;
//            return this;
//        }
//
//        public Calculator build() {
//            return new Calculator(this);
//        }
//    }
//
//    public static Builder builder() {
//        return new Builder();
//    }
}
