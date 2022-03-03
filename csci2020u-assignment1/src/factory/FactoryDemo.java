package factory;

public class FactoryDemo {
    public static void main(String[] args){
        //get KidsComputer object and call printSpecSheet method
        PC computer1 = PC_Factory.getPC("KIDS");
        computer1.printSpecSheet();

        //get FamilyComputer object and call printSpecSheet method
        PC computer2 = PC_Factory.getPC("FAMILY");
        computer2.printSpecSheet();

        //get GamingComputer object and call printSpecSheet method
        PC computer3 = PC_Factory.getPC("GAMING");
        computer3.printSpecSheet();
    }
}
