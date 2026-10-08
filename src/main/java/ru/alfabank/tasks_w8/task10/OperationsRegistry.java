package ru.alfabank.tasks_w8.task10;

public class OperationsRegistry{
    public double eval(String op, double a, double b) {
        for(Operation o:Operation.builtin()){
            if(o.name().equalsIgnoreCase(op)){
                return o.apply(a,b);
            }
        }
        throw new IllegalStateException("Unknown op: "+op);
    }

    static void main() {
        System.out.println(new OperationsRegistry().eval("ADD",2,3));
        System.out.println(new OperationsRegistry().eval("POW",2,10));
        //tet unknown operation
        // System.out.println(new OperationsRegistry().eval("DIV",2,0));
    }
}
