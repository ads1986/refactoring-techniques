package com.refactoring.techniques.moving.features;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;

import static java.time.LocalDate.now;

public class LocalExtension {

    /**
     * Example before refactore.
     */
    class BeforeRefactore{

        class UserService {
            public void updateName(String firstName, String lastName){
                String firstNameUpper = StringUtils.upperCase(firstName + lastName);
                String firstNameCaptalize = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
                // Some code to udpate user information
            }

            public String capitalize(String firstName){
                return firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
            }
        }

    }

    /**
     * Example after applying Introduce Local Extension technique
     */
    class AfterRefactore{

        class UserService {
            public void updateName(String firstName, String lastName){
                UtilString util = new UtilString();
                String firstNameUpper = util.upperCase(firstName + lastName);
                String firstNameCaptalize = util.capitalize(firstName);
                // Some code to udpate user information
            }
        }

        class UtilString {

            public String upperCase(String text){
                return StringUtils.upperCase(text);
            }

            public String capitalize(String text){
                return text.substring(0, 1).toUpperCase() + text.substring(1);
            }

        }

    }

}
