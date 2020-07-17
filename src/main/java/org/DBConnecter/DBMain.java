package org.DBConnecter;

import java.sql.SQLException;
import java.util.List;

public class DBMain {

    public static void main(String[] args) throws SQLException {

        DbManager.setMysqlDbConnection();
            List<String> mysqlQuery = DbManager.getMysqlQuery("SELECT first_name FROM users WHERE id=2");
        List<String> mysqlQuerylastName = DbManager.getMysqlQuery("SELECT last_name FROM users WHERE id=2");

        for (int i=0;i<mysqlQuery.size();i++){
            System.out.println(mysqlQuery.get(i)+" "+mysqlQuerylastName.get(i));

        }
    }
}
