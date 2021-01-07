package com.refactoring.techniques.composing.methods;

import com.refactoring.techniques.model.Car;

public class ReplaceMethod {

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
     * Example after applying Replace Method with Method Object technique
     * Tip: This technique can increase de program complexity, because
     * we are adding more classes.
     */
    class RefactoredCarService {

        public double[] getPriceRange(int code){
            return new RangeCalculator(code).compute();
        }

        class RangeCalculator{
            private double maxPrice;
            private double minPrice;
            private double code;

            public RangeCalculator(double code) {
                this.code = code;
            }

            public double[] compute(){
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
    }
}
