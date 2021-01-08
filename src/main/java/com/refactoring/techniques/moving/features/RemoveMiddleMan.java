package com.refactoring.techniques.moving.features;

public class RemoveMiddleMan {

    /**
     * Example before refactore.
     */
    class BeforeRefactore{

        class Person {

            private String name;
            private BeforeRefactore.TelephoneNumber telephoneNumber;

            public Person(String name, BeforeRefactore.TelephoneNumber telephoneNumber) {
                this.name = name;
                this.telephoneNumber = telephoneNumber;
            }

            public String getName() {
                return name;
            }

            public String getTelephoneNumber(){
                return telephoneNumber.getTelephoneNumber();
            }
        }

        class TelephoneNumber{

            public String officeAreaCode;
            public String officeNumber;

            public TelephoneNumber(String officeAreaCode, String officeNumber) {
                this.officeAreaCode = officeAreaCode;
                this.officeNumber = officeNumber;
            }

            public String getTelephoneNumber(){
                return officeAreaCode + officeNumber;
            }

        }

    }

    /**
     * Example after applying Remove Middle Man technique
     */
    class AfterRefactore{

        class Person {

            private String name;
            private TelephoneNumber telephoneNumber;

            public Person(String name, TelephoneNumber telephoneNumber) {
                this.name = name;
                this.telephoneNumber = telephoneNumber;
            }

            public String getName() {
                return name;
            }

            public TelephoneNumber getTelephoneNumber() {
                return telephoneNumber;
            }
        }

        class TelephoneNumber{

            public String officeAreaCode;
            public String officeNumber;

            public TelephoneNumber(String officeAreaCode, String officeNumber) {
                this.officeAreaCode = officeAreaCode;
                this.officeNumber = officeNumber;
            }

            public String getTelephoneNumber(){
                return officeAreaCode + officeNumber;
            }

        }

    }

}
