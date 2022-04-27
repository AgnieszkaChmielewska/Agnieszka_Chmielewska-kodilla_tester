package com.kodilla.mockito;

import java.util.HashSet;
import java.util.Set;

public class NotificationService {
    private Set<Client> clients = new HashSet<>();

    public void addSubscriber(Client client) {
        this.clients.add(client);
    }

    public void sendNotification(Notification notification) {
        for (Client client : this.clients) {       //ale równie dobrze moglibyśmy użyć pętli.
            client.receive(notification);
        }
//        this.clients.forEach(client -> client.receive(notification)); //można użyć Streama,
    }

    public void removeNotification(Client client) {
        this.clients.remove(client);  // remove to funkcja Javy
    }


}
