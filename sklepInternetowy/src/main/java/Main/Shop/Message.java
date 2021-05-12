package Main.Shop;

import Main.Repo.Logger;

public class Message implements Logger {

    private Message() {
    }

    private static Message logObj = null;
    public static Message getInstance(){
        if(logObj == null){
            logObj = new Message();
        }
        return logObj;
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
