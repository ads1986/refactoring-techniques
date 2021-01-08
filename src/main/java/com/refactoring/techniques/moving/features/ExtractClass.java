package com.refactoring.techniques.moving.features;

import java.time.LocalDate;
import java.util.List;

public class ExtractClass {

    /**
     * Example before refactore.
     */
    class BeforeRefactore{

        class Person {

            private String name;
            private String officeAreaCode;
            private String officeNumber;

            public Person(String name, String officeAreaCode, String officeNumber) {
                this.name = name;
                this.officeAreaCode = officeAreaCode;
                this.officeNumber = officeNumber;
            }

            public String getName() {
                return name;
            }

            public String getTelephoneNumber(){
                return officeAreaCode + officeNumber;
            }

        }

    }

    /**
     * Example after applying Extract Class technique
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
