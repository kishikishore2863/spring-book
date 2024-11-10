package com.loose.coupling;

public class LooseCoupling {
    public static void main(String[] args) {
        UserDataProvider databaseProvider =new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webSeviceProvider =new WebServiceDataProvider();
        UserManager userManagerWithWS =new UserManager(webSeviceProvider);
        System.out.println(userManagerWithWS.getUserInfo());

        UserDataProvider newdb =new NewDatabaseProvider();
        UserManager userManagerwithNewDm = new UserManager(newdb);
        System.out.println(userManagerwithNewDm.getUserInfo());


//        Car tesla = new Tesla();
//       String engine =tesla.engine();
//       String type =tesla.type();
//        System.out.println(engine+" "+type);
    }
}
