import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Thanathip Thinpracha"); //PUT YOUR NAME HERE
        groupMembers.add("Atchariya Pisaard"); //PUT YOUR NAME HERE
        groupMembers.add("Watthana Kwankitwongtron"); //PUT YOUR NAME HERE
        groupMembers.add("Pittapol Photipipit"); //PUT YOUR NAME HERE
    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}
