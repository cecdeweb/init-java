import daos.impl.ClientDao;
import models.Client;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ClientDao clientDao=new ClientDao();

        ArrayList<Client> clients=clientDao.getAll();

        for(Client client:clients){
            System.out.println(client);
        }

    }
}