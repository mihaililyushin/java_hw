package Homework_stream;

public class FileCyptor {

    private String keyword;

    static final FileCyptor FILE_CYPTOR = new FileCyptor();

    public void setKeyword(String password){
        this.keyword = password;
    }

    public String getKeyword(){
        return this.keyword;
    }

    public String checkKeyword(String password){
        if (password.equals(this.keyword)){
            return password;
        }
        else {
            System.out.println("Ключ шифрования не верен!");
        }
        return null;
    }

    protected static byte [] Encrypt(byte [] bytes, String password){
        byte[] keyword = password.getBytes();
        byte[] result = new byte[bytes.length];
        for(int i = 0; i< bytes.length; i++)
        {
            result[i] = (byte) (bytes[i] ^ keyword[i % keyword.length]);
        }
        return result;
    }

    public static String Decrypt(byte[] bytes, String password)
        {
            byte[] result = new byte[bytes.length];
            byte[] keyarr = password.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                result[i] = (byte) (bytes[i] ^ keyarr[i % keyarr.length]);
            }
            return new String(result);
        }


}

