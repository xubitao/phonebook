package cn.thiki.phonebook;

/**
 * Created by Administrator on 2015/9/4.
 */
public class Person {
    private int id;
    private String name;
    private String phoneNumber;
    private String company;
    private int groupId;
    private String birthPlace;
    private boolean sex;
    private String personRepository;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPersonRepository() {
        return personRepository;
    }

    public void setPersonRepository(String personRepository) {
        this.personRepository = personRepository;
    }
}
