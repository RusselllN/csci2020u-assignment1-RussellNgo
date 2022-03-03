package factory;

public class PC_Factory {
    public static PC getPC(String PC_type){
        if(PC_type == null){
            return null;
        }
        if(PC_type.equals("FAMILY")){
            return new FamilyComputer();
        }
        if(PC_type.equals("GAMING")){
            return new GamingComputer();
        }
        if(PC_type.equals("KIDS")){
            return new KidsComputer();
        }
        return null;
    }
}
