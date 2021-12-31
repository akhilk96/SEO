
import java.util.*;

public class College {

    HashMap<Integer,String> colleges=new HashMap<Integer,String>();

    public int college_id;

    public String college_name;


    public College() {}

    public void addCollege(int cid,String cname) {
        colleges.put(cid,cname);
    }

    public void editCollege(int cid,String cname) {
        colleges.replace(cid,cname);
    }

    public void deleteCollege(int cid) {
        colleges.remove(cid);
    }

    public void updateCollege() {
    }

    public void saveCollege() {
        System.out.printlln("Saved Successfully...")
    }

    public void searchCollege(int cid) {
    if (college_ids.contains(cid))
        System.out.println("College Found...");
    else
        System.out.println("Collge Not Found...")

}