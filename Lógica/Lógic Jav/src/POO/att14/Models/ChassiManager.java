package att14.Models;

public class ChassiManager {
    private int ID;
    private static ChassiManager instance;

    private ChassiManager(){
        this.ID = 1;
    }

    public static ChassiManager getInstance(){
        if (instance == null) {
            instance = new ChassiManager();
        }
        return instance;
    }

    public int nextID(){
        return ID++;
    }
}
