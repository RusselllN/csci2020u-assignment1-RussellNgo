package factory;

public class FamilyComputer implements PC{
    String GPU = "Radeon HD 5770";
    int GPU_clock = 850; // in MHz
    int GPU_VRAM = 1024; // in MB

    String CPU = "AMD Ryzen 5 3600";
    float CPU_clock = 4.2F; // in GHz
    int CPU_cores = 6;

    String RAM = "Crucial RAM DDR4 CL19 CT8G4DFRA266";
    int RAM_sticks = 1;
    int RAM_size = 8; // in GB
    int RAM_clock =  2666; // in MHz

    String Storage = "Seagate BarraCuda 3TB Internal Hard Drive HDD";
    int Storage_size = 3000; // 3TB in GB
//    float Storage_remaining = 2500.0F;

    @Override
    public void printSpecSheet() {
        System.out.println("========================================================");
        System.out.println("Family household computer specs:");
        System.out.println("GPU - " + GPU + ", " + GPU_VRAM + "GB");
        System.out.println("CPU - " + CPU + ", " + CPU_clock + "GHz");
        System.out.println("RAM - " + RAM + ", " + RAM_size + "GB");
        System.out.println("Storage - " + Storage + ", " + Storage_size + "GB");
        System.out.println("========================================================");
        System.out.println("");
    }
}

//    public boolean canItRunCrysis(){
//        // game requirements found on systemrequirementslab.com and on Steam
//        // component requirements found on techpowerup.com
//        if (GPU_clock < 783){
//            System.out.println("no");
//            return false;
//        }
//        if (GPU_VRAM < 1024){
//            System.out.println("no");
//            return false;
//        }
//        if (CPU_cores < 2) {
//            System.out.println("no");
//            return false;
//        }
//        if (RAM_size1 < 3) {
//            System.out.println("no");
//            return false;
//        }
//        if (Storage_remaining < 17.0){
//            System.out.println("no");
//            return false;
//        }
//
//        return true;
//    }