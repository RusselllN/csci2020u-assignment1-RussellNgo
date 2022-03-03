package factory;

public class GamingComputer implements PC{
    String GPU = "Nvidia GeForce GTX 1660";
    int GPU_clock = 1530; // in MHz
    int GPU_VRAM = 6144; // in MB

    String CPU = "AMD Ryzen 9 3900X";
    float CPU_clock = 4.6F; // in GHz
    int CPU_cores = 12;

    String RAM = "Corsair Vengeance RGB Pro DDR4 (PC4-28800) C18";
    int RAM_sticks = 2;
    int RAM_size = 8; // in GB
    int RAM_clock =  3600; // in MHz

    String Storage = "Kingston NV1 M.2 2280 NVMe PCIe Internal SSD";
    int Storage_size = 2000; // 2TB in GB
//    float Storage_remaining = 0.0F;

    public void printSpecSheet() {
        System.out.println("========================================================");
        System.out.println("Above average gaming computer specs:");
        System.out.println("GPU - " + GPU + ", " + GPU_VRAM + "GB," + GPU_clock + "MHz");
        System.out.println("CPU - " + CPU + ", " + CPU_clock + "GHz, " + CPU_cores + " cores");
        System.out.println("RAM - " + RAM + ", " + RAM_size + "GB, " + RAM_clock + "3600");
        System.out.println("Storage - " + Storage + ", " + Storage_size + "GB ");
        System.out.println("========================================================");
        System.out.println("");
    }
}
