package seminars.homework.exercises;

import java.util.Collection;

public class PhoneData {
    public PhoneData(String initFirstName, String initLastName, String initPhoneNumber) {
        firstName = initFirstName;
        lastName = initLastName;
        phoneNumber = initPhoneNumber;
    }
    /**
     * Имя
     */
    private String firstName;
    /**
     * Фамилия
     */
    public String lastName;

    /**
     * Номер моб.телефона
     */
    public String phoneNumber;


    public String getFirstName() {
        return firstName;
    }
}