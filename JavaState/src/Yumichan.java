
public class Yumichan {
    
    /** 良い時 **/
    private static final int GOOD_MODE = 0;
    
    /** 悪い時 **/
    private static final int BAD_MODE = 1;
    
    /** 状態を表すプロパティ **/
    private int state = -1;
    
    public void changeState(int state){
        this.state = state;
    }
    
    public String morningGreet(){
        if(state == BAD_MODE){
            return "おっす";
        }else if(state == GOOD_MODE){
            return "おはよう";
        }else{
            return "…";
        }
    }
    

}
