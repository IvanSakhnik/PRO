import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class CommonVariables{

    private static Random random = new Random();

    public static ReentrantLock mutex = new ReentrantLock();

    private static byte  Byte;
    private static short Short;
    private static int   Int;
    private static long  Long;
    private static char  Char;

    public CommonVariables(){
	    CommonVariables.setByte();
	    CommonVariables.setShort();
	    CommonVariables.setInt();
	    CommonVariables.setLong();
	    CommonVariables.setChar();
    }

    public static byte getByte(){
            return Byte; 
    }

    public static void setByte(){
            CommonVariables.Byte = (byte)random.nextInt(127);
    }

    public static short getShort(){
        return Short;
    }

    public static void setShort(){
        CommonVariables.Short = (short)random.nextInt(32767);
    }

    public static int  getInt(){
        return Int;
    }

    public static void setInt(){
        CommonVariables.Int = random.nextInt();
    }

    public static long getLong(){
        return Long;
    }

    public static void setLong(){
        CommonVariables.Long = random.nextLong();
    }

    public static char getChar(){
        return Char;
    }

    public static void setChar(){
        CommonVariables.Char = (char)random.nextInt(255);
    }

    public static void updateVariables(int i){
	    System.out.println("Thread" + i + " changes: ");
        switch (i){
            case 2:
                    setByte();
                    setChar();
                    setInt();
                    setLong();
                    break;

            case 3:
                    setShort();
                    setLong();
                    setInt();
                    setChar();
                    break;

            case 5:
                    setByte();
                    setShort();
                    setLong();
                    setChar();
                    break;
        }
        synchronized (System.out){
	    showValue(Byte);
	    showValue(Short);
	    showValue(Int);
	    showValue(Long);
	    showValue(Char);
	}
    }

    private static void showValue(byte Type){
            System.out.println(" Byte value: " + getByte());
    }

    private static void showValue(short Type){
            System.out.println(" Short value: " + getShort());
    }

    private static void showValue(int Type){
            System.out.println(" Int value: " + getInt());
    }

    private static void showValue(long Type){
            System.out.println(" Long value: " + getLong());
    }

    private static void showValue(char Type){
            System.out.println(" Char value: " + getChar());
    }

}
