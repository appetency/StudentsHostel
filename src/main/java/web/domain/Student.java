package web.domain;

/**
 * Created by Administrator on 2017/1/18.
 */
public class Student {
    private int Student_ID ;
    private int Student_DomitoryID ;
    private String Student_Username ;
    private String Student_Password ;
    private String Student_Name ;
    private String Student_Sex ;
    private String Student_Class ;
    private String Student_State ;
    private String Domitory_Name ;
    private String Building_Name ;
    private String Domitory_Type ;
    private String Domitory_Number ;
    private String Domitory_Tel ;

    public Student(int student_ID, int student_DomitoryID, String student_Username, String student_Password, String student_Name, String student_Sex, String student_Class, String student_State, String domitory_Name, String building_Name, String domitory_Type, String domitory_Number, String domitory_Tel) {
        Student_ID = student_ID;
        Student_DomitoryID = student_DomitoryID;
        Student_Username = student_Username;
        Student_Password = student_Password;
        Student_Name = student_Name;
        Student_Sex = student_Sex;
        Student_Class = student_Class;
        Student_State = student_State;
        Domitory_Name = domitory_Name;
        Building_Name = building_Name;
        Domitory_Type = domitory_Type;
        Domitory_Number = domitory_Number;
        Domitory_Tel = domitory_Tel;
    }

    public int getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(int student_ID) {
        Student_ID = student_ID;
    }

    public int getStudent_DomitoryID() {
        return Student_DomitoryID;
    }

    public void setStudent_DomitoryID(int student_DomitoryID) {
        Student_DomitoryID = student_DomitoryID;
    }

    public String getStudent_Username() {
        return Student_Username;
    }

    public void setStudent_Username(String student_Username) {
        Student_Username = student_Username;
    }

    public String getStudent_Password() {
        return Student_Password;
    }

    public void setStudent_Password(String student_Password) {
        Student_Password = student_Password;
    }

    public String getStudent_Name() {
        return Student_Name;
    }

    public void setStudent_Name(String student_Name) {
        Student_Name = student_Name;
    }

    public String getStudent_Sex() {
        return Student_Sex;
    }

    public void setStudent_Sex(String student_Sex) {
        Student_Sex = student_Sex;
    }

    public String getStudent_Class() {
        return Student_Class;
    }

    public void setStudent_Class(String student_Class) {
        Student_Class = student_Class;
    }

    public String getStudent_State() {
        return Student_State;
    }

    public void setStudent_State(String student_State) {
        Student_State = student_State;
    }

    public String getDomitory_Name() {
        return Domitory_Name;
    }

    public void setDomitory_Name(String domitory_Name) {
        Domitory_Name = domitory_Name;
    }

    public String getBuilding_Name() {
        return Building_Name;
    }

    public void setBuilding_Name(String building_Name) {
        Building_Name = building_Name;
    }

    public String getDomitory_Type() {
        return Domitory_Type;
    }

    public void setDomitory_Type(String domitory_Type) {
        Domitory_Type = domitory_Type;
    }

    public String getDomitory_Number() {
        return Domitory_Number;
    }

    public void setDomitory_Number(String domitory_Number) {
        Domitory_Number = domitory_Number;
    }

    public String getDomitory_Tel() {
        return Domitory_Tel;
    }

    public void setDomitory_Tel(String domitory_Tel) {
        Domitory_Tel = domitory_Tel;
    }
}
