public class Lab {
    /**
     * @param b a true/false value.
     * @return if b is true, return true. if b is false, return false.
     */
    public boolean returnBoolean(boolean b){
        return b;
    }

    /**
     * @param b a true/false value.
     * @return if b is true, return false. if b is false, return true.
     * look into boolean operations to do this without using if/else statements.
     */
    public boolean returnNot(boolean b){
        return !b;
    }

    /**
     * @param b1 a true/false value.
     * @param b2 a true/false value.
     * @return true if both b1 and b2 are true. false otherwise.
     * look into boolean operations to do this without using if/else statements.
     */
    public boolean returnAnd(boolean b1, boolean b2){
        return b1 && b2;
    }

    /**
     * @param b1 a true/false value.
     * @param b2 a true/false value.
     * @return true if either b1 or b1 are true. false if both are false.
     * look into boolean operations to do this without using if/else statements.
     */
    public boolean returnOr(boolean b1, boolean b2){
        return b1 || b2;
    }
}
