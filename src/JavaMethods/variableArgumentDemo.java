package JavaMethods;

public class variableArgumentDemo {
    public void printMsgs(int num, String ...msgs){
        for(int i=0;i<num;i++){
            System.out.println(msgs[i]);
        }
    }
}
