package factory;

public interface PC {
    public String GPU = new String();
    public int GPU_clock = 0; // in MHz
    public int GPU_VRAM = 0; // in MB

    public String CPU = new String();
    public float CPU_clock = 0.0F; // in GHz
    public int CPU_cores = 0;

    public String RAM = new String();
    public int RAM_sticks = 0;
    public int RAM_size = 0; // in GB
    public int RAM_clock =  0; // in MHz

    public String Storage = new String();
    public int Storage_size = 0;
//    public float Storage_remaining = 0.0F;

    void printSpecSheet();
//    boolean canItRunCrysis();
}
