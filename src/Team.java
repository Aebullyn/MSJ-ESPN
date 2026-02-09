public class Team {
  private String gender;
    private ArrayList<Player> roster;
    private String sport;

    public Team (String a, String c){
        gender = a;
        roster = new ArrayList<>();
        sport = c;
    }

    public void addPlayer(Player p) {
        roster.add(p);
    }

    public String getGender(){
        return gender;
    }
    public ArrayList<Player> getRoster(){
        return roster;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setRoster(ArrayList<Player> roster) {
        this.roster = roster;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}

