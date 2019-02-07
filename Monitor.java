public class Monitor{
    private String display;

    public String getDisplay(){ return display;}
    public void setDisplay(String dplay){ display = dplay; }
    public static final String RESOLUTION = "2400x1600";
    public void clear(){ setDisplay(""); }
    public String toString(){return "Display: "+display;}
}
