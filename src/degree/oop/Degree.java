package degree.oop;

public class Degree {
    private String[] studentName;
    private final int[] degrees;
    public Degree(String[] nameArray,int[] degreesArray){
        this.studentName=nameArray;
        this.degrees=degreesArray;
    }
    public String[] getStudentName(){
        return studentName;
    }
    public void setStudentName(String[] nameArray){
        studentName=nameArray;
    }
    public void proccesDegree(){
        //getName();
        System.out.println("Birinci: "+getName1()+" " + getFirst()+"'");
        System.out.println("Ikinci: " +getName2()+" " + getSecond()+"'");
        System.out.println("Ucuncu: " +getName3()+" " + getThird()+"'");
        sorting();
    }
    public int getFirst(){
        int lowdegree=degrees[0];
        for (int degree:degrees){
            if (degree<lowdegree)
                lowdegree=degree;
        }
        return  lowdegree;
    }
    public int getSecond(){
        int first=getFirst();
        int seconddegree=degrees[0];
        for (int degree:degrees){
            if (degree<seconddegree && degree>first)
                seconddegree=degree;
        }
        return seconddegree;
    }
    public int getThird(){
        int second=getSecond();
        int thirddegree=degrees[0];
        for (int degree:degrees){
            if (degree<thirddegree && degree>second)
                thirddegree=degree;
        }
        return thirddegree;
    }
    public String getName1(){
        int a=getFirst();
        int num1=0;
        for (int i=0;i<degrees.length;i++){
            if(degrees[i]==a)
                num1=i;
        }
        return studentName[num1];
    }
    public String getName2(){
        int b=getSecond();
        int num2=0;
        for (int i=0;i<degrees.length;i++){
            if(degrees[i]==b)
                num2=i;
        }
        return studentName[num2];
    }
    public String getName3(){
        int c=getThird();
        int num3=0;
        for (int i=0;i<degrees.length;i++){
            if(degrees[i]==c)
                num3=i;
        }
        return studentName[num3];
    }
    public void sorting(){
        int sortinga=0;
        int sortingb=0;
        int sortingc=0;
        for (int degree:degrees){
            if (200<degree && degree<=299) {
                sortinga++;
            }else if (degree>300 && degree<=399){
                sortingb++;
            } else if (degree>=400) {
                sortingc++;
            }
        }
        System.out.println("A-->"+ sortinga+" \nB-->"+sortingb+"\nC-->"+sortingc);
    }
}
