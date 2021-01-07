package com.refactoring.techniques.moving.features;

public class MethodMove {

    /**
     * Example before refactore.
     */
    class BeforeRefactore{

        class SalaryCalculator {

            public boolean hasEnouthMoney(double[] salaries, double balance){
                double totalSalaries = sumAll(salaries);
                if (totalSalaries > balance)
                    return false;
                return true;
            }

            public double sumAll(double[] numbers){
                double total = 0;
                // Code to sum values here
                return total;
            }

        }

        class TaxCalculator {

            public double calculateTaxes(double[] taxes){
                SalaryCalculator calculator = new SalaryCalculator();
                double total = calculator.sumAll(taxes);
                // Some rules here
                double calculateValue = total;
                return calculateValue;
            }

            public double sumFees(double[] taxes){
                SalaryCalculator calculator = new SalaryCalculator();
                return calculator.sumAll(taxes);
            }

            public double sumTickets(double[] taxes){
                SalaryCalculator calculator = new SalaryCalculator();
                double total = calculator.sumAll(taxes);
                // Some rules here
                double ticketValues = total;
                return ticketValues;
            }

        }

    }

    /**
     * Example after applying Move Method technique
     */
    class AfterRefactore{

        class SalaryCalculator {

            public boolean hasEnouthMoney(double[] salaries, double balance){
                double totalSalaries = 0;
                // Code to sum values here
                if (totalSalaries > balance)
                    return false;
                return true;
            }

        }

        class TaxCalculator {

            public double calculateTaxes(double[] taxes){
                SalaryCalculator calculator = new SalaryCalculator();
                double total = sumAll(taxes);
                // Some rules here
                double calculateValue = total;
                return calculateValue;
            }

            public double sumFees(double[] taxes){
                SalaryCalculator calculator = new SalaryCalculator();
                return sumAll(taxes);
            }

            public double sumTickets(double[] taxes){
                SalaryCalculator calculator = new SalaryCalculator();
                double total = sumAll(taxes);
                // Some rules here
                double ticketValues = total;
                return ticketValues;
            }

            public double sumAll(double[] numbers){
                double total = 0;
                // Code to sum values here
                return total;
            }

        }

    }

}
