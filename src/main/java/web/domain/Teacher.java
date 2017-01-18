package web.domain;

/**
 * Created by Administrator on 2017/1/18.
 */
public class Teacher {
    private int Teacher_ID ;
    private String Teacher_Username ;
    private String Teacher_Password ;
    private String Teacher_Name ;
    private String Teacher_Sex ;
    private String Teacher_Tel ;

    public Teacher(int teacher_ID, String teacher_Username, String teacher_Password, String teacher_Name, String teacher_Sex, String teacher_Tel) {
        Teacher_ID = teacher_ID;
        Teacher_Username = teacher_Username;
        Teacher_Password = teacher_Password;
        Teacher_Name = teacher_Name;
        Teacher_Sex = teacher_Sex;
        Teacher_Tel = teacher_Tel;
    }

    public int getTeacher_ID() {
        return Teacher_ID;
    }

    public void setTeacher_ID(int teacher_ID) {
        Teacher_ID = teacher_ID;
    }

    public String getTeacher_Username() {
        return Teacher_Username;
    }

    public void setTeacher_Username(String teacher_Username) {
        Teacher_Username = teacher_Username;
    }

    public String getTeacher_Password() {
        return Teacher_Password;
    }

    public void setTeacher_Password(String teacher_Password) {
        Teacher_Password = teacher_Password;
    }

    public String getTeacher_Name() {
        return Teacher_Name;
    }

    public void setTeacher_Name(String teacher_Name) {
        Teacher_Name = teacher_Name;
    }

    public String getTeacher_Sex() {
        return Teacher_Sex;
    }

    public void setTeacher_Sex(String teacher_Sex) {
        Teacher_Sex = teacher_Sex;
    }

    public String getTeacher_Tel() {
        return Teacher_Tel;
    }

    public void setTeacher_Tel(String teacher_Tel) {
        Teacher_Tel = teacher_Tel;
    }
}
