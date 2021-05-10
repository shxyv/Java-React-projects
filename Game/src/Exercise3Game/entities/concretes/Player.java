package Exercise3Game.entities.concretes;

import Exercise3Game.entities.abstracts.EntitiesInterface;

public class Player implements EntitiesInterface {
    private int id;
    private String firstName;
    private String lastName;
    private long identityNumber;
    private String birthDate;

    public Player(int id, String firstName, String lastName, long identityNumber, String birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNumber = identityNumber;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}
