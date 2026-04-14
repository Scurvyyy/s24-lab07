package frogger;

import java.util.Objects;

public class FroggerID {
        private String firstName, lastName, phoneNumber, zipCode, state, gender;
    
        /**
         * Constructs a FroggerID with the specified personal information.
         *
         * @param firstName the first name
         * @param lastName the last name
         * @param phoneNumber the phone number
         * @param zipCode the zip code
         * @param state the state
         * @param gender the gender
         */
      public FroggerID(String firstName, String lastName, String phoneNumber,
                       String zipCode, String state, String gender) {
            this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.state = state;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FroggerID)) return false;
        FroggerID that = (FroggerID) o;
        return Objects.equals(firstName, that.firstName) &&
               Objects.equals(lastName, that.lastName) &&
               Objects.equals(phoneNumber, that.phoneNumber) &&
               Objects.equals(zipCode, that.zipCode) &&
               Objects.equals(state, that.state) &&
               Objects.equals(gender, that.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, phoneNumber, zipCode, state, gender);
    }
}