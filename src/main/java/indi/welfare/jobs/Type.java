package indi.welfare.jobs;

public enum Type {
    RED("red"){
        @Override
        public double calculate(double x, double y) {
            return 0;
        }
    },
    BLUE("blue"){
        @Override
        public double calculate(double x, double y) {
            return 0;
        }
    };

    private Type(String string) {
    }


    public abstract double calculate(double x, double y);
    public static void main(String[] args) {
        System.out.println(Type.RED.ordinal());
    }
}
