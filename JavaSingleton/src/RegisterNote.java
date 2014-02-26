


/**
 * コンストラクタの識別子が privateになっており、外部から生成することができない。
 * RegisterNoteのインスタンスがほしい時は、
 * RegisterNote note = Registernote.getInstance();
 * 
 * これによって、最初に呼び出された時にインスタンスしか利用できない。
 */


public class RegisterNote {
    private static RegisterNote registerNote = new RegisterNote();
    private RegisterNote(){}
    public static RegisterNote getInstance(){
        return registerNote;
    }

}
