package gr.aueb.cf.schoolapp2.dto;


public class StudentReadOnlyDTO extends BaseStudentDTO {
    private Integer id;
    private String uuid;

    public StudentReadOnlyDTO(){

    }

    public StudentReadOnlyDTO(Integer id, String uuid,String firstname , String lastname,
                              String vat, String fatherName, String phoneNum,
                              String email, String street, String streetNum, String zipCode,
                              Integer cityId) {
        super(firstname, lastname, vat, fatherName, phoneNum, email, street, streetNum, zipCode, cityId);
        this.id = id;
        this.uuid = uuid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "StudentReadOnlyDTO{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}

