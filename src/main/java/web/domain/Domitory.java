package web.domain;

/**
 * Created by Administrator on 2017/1/18.
 */
public class Domitory {
    private int Domitory_ID ;
    private int Domitory_BuildingID ;
    private String Domitory_Name ;
    private String Domitory_Type ;
    private String Domitory_Number ;
    private String Domitory_Tel ;
    private String Building_Name ;

    public Domitory(int domitory_ID, int domitory_BuildingID, String domitory_Name, String domitory_Type, String domitory_Number, String domitory_Tel, String building_Name) {
        Domitory_ID = domitory_ID;
        Domitory_BuildingID = domitory_BuildingID;
        Domitory_Name = domitory_Name;
        Domitory_Type = domitory_Type;
        Domitory_Number = domitory_Number;
        Domitory_Tel = domitory_Tel;
        Building_Name = building_Name;
    }

    public int getDomitory_ID() {
        return Domitory_ID;
    }

    public void setDomitory_ID(int domitory_ID) {
        Domitory_ID = domitory_ID;
    }

    public int getDomitory_BuildingID() {
        return Domitory_BuildingID;
    }

    public void setDomitory_BuildingID(int domitory_BuildingID) {
        Domitory_BuildingID = domitory_BuildingID;
    }

    public String getDomitory_Name() {
        return Domitory_Name;
    }

    public void setDomitory_Name(String domitory_Name) {
        Domitory_Name = domitory_Name;
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

    public String getBuilding_Name() {
        return Building_Name;
    }

    public void setBuilding_Name(String building_Name) {
        Building_Name = building_Name;
    }
}
