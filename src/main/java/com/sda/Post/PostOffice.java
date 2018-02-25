package com.sda.Post;

public class PostOffice {

    private SenderService senderService;
    private UserStorage userStorage;

    public PostOffice(SenderService senderService, UserStorage userStorageorage) {
        this.senderService = senderService;
        this.userStorage = userStorageorage;
    }

    public PostOffice() {
    }

    public boolean createNewUser(String nickname){
        return userStorage.createNewUser(nickname);
    }

    public SenderService getSenderService() {
        return senderService;
    }

    public void setSenderService(SenderService senderService) {
        this.senderService = senderService;
    }

    public UserStorage getUserStorageorage() {
        return userStorage;
    }

    public void setUserStorageorage(UserStorage userStorageorage) {
        this.userStorage = userStorageorage;
    }
}
