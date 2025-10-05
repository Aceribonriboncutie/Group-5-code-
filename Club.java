public class Club {
    private String name;
    private String president;
    private int members;

    
    private static int totalClubs = 0;

  
    public Club(String name, String president, int members) {
        this.name = name;
        this.president = president;
        this.members = members;
        totalClubs++;
    }

    
    public String getName() { return name; }
    public String getPresident() { return president; }
    public int getMembers() { return members; }

    
    public static int getTotalClubs() {
        return totalClubs;
    }

  
    public void displayInfo() {
        System.out.println("Club: " + name + " | President: " + president + " | Members: " + members);
    }
}
