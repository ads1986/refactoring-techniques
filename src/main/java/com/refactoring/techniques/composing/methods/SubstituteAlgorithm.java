package com.refactoring.techniques.composing.methods;

public class SubstituteAlgorithm {

    /**
     * Example before refactore.
     */
    class CarDeal {

        public double[] getRangePrice(int code){
            double maxPrice = code > 1 ? 100000 : 50000;
            double minPrice = code < 10 ? 10000 : 5000;

            double[] range = new double[2];

            if (maxPrice == 10000)
                range[1] = maxPrice + 1000;
            else
                range[1] = maxPrice;

            if (minPrice == 10000)
                range[0] = minPrice + 100;
            else
                range[0] = minPrice;

            return range;
        }

    }

    /**
     * Example after applying Substitute Algorithm technique
     */
    class RefactoredCarService {

        public double[] getRangePrice(int code){
            double maxPrice = code > 1 ? 101000 : 50000;
            double minPrice = code < 10 ? 10100 : 5000;

            double[] range = new double[2];
            range[0] = minPrice;
            range[1] = maxPrice;
            return range;
        }
    }
}
