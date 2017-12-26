package com.xtherebellion.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {
//        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//       double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        double[] results = new double[opCodes.length];

        MathEquation[] equations = new MathEquation[4];
        equations[0] = create(100.0d, 50.0d, 'd');
        equations[1] = create(25.0d, 92.0d, 'a');
        equations[2] = create(225.0d, 17.0, 's');
        equations[3] = create(11.0d, 3.0d, 'm');
//        for(int i = 0; i < opCodes.length; i++){
//
//        }

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.print("Result = ");
            System.out.println(equation.getResult());
        }
    }
        public static MathEquation create(double leftVal, double rightVal, char opCode){
            MathEquation equation = new MathEquation();
            equation.setLeftVal(leftVal);
            equation.setRightVal(rightVal);
            equation.setOpCode(opCode);

            return equation;

    }
}
