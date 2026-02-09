public class Player {
  private String name;
    private int cost;
    private int stat1;
    private int stat2;
    private int stat3;

    public Player( String d, int e, int f, int g, int h){
        name = d;
        cost = e;
        stat1 = f;
        stat2 = g;
        stat3 = h;
    }
    public String getName(){
        return name;
    }
    public int  getCost(){
        return cost;
    }
    public int getStat1(){
        return stat1;
    }
    public int getStat2(){
        return stat2;
    }
    public int getStat3(){
        return stat3;
    }
    public int getTotalStats() {
        return stat1 + stat2 + stat3;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setStat1(int stat1) {
        this.stat1 = stat1;
    }

    public void setStat2(int stat2) {
        this.stat2 = stat2;
    }

    public void setStat3(int stat3) {
        this.stat3 = stat3;
    }
}

