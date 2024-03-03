package degree.oop;

public class DegreeTest {
    public static void main(String[] args) {
        int[] degreesArray={341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};
        String[] nameArray={"Kadir","Gokhan","Hakan","Suzan","Pinar","Mehmet","Ali","Emel","Firat","James","Jale","Ersin","Deniz","Gozde","Anil","Burak"};
        Degree myDegree=new Degree(nameArray,degreesArray);
        myDegree.proccesDegree();
    }
}
