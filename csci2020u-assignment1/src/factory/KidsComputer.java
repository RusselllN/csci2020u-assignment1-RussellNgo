package factory;

public class KidsComputer implements PC{
    String GPU = "Nvidia GTS 450";
    int GPU_clock = 783; // in MHz
    int GPU_VRAM = 1024; // in MB

    String CPU = "Intel Core 2 Duo";
    float CPU_clock = 2.4F; // in GHz
    int CPU_cores = 2;

    String RAM = "Samsung M378B5673FH0-CH9";
    int RAM_sticks = 2;
    int RAM_size = 2; // in GB
    int RAM_clock =  1333; // in MHz

    String Storage = "Kingston SATA SA400S37";
    int Storage_size = 240;
//    float Storage_remaining = 110.0F;

    public void printSpecSheet() {
        System.out.println("========================================================");
        System.out.println("A child's computer specs:");
        System.out.println("GPU - " + GPU + ", " + GPU_VRAM + "GB");
        System.out.println("CPU - " + CPU + ", " + CPU_clock + "GHz");
        System.out.println("RAM - " + RAM + ", " + RAM_size + "GB");
        System.out.println("Storage - " + Storage + ", " + Storage_size + "GB");
        System.out.println("========================================================");
        System.out.println("");
    }
}
