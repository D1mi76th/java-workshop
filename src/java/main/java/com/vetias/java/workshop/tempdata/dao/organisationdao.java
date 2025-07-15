package com.vetias.java.workshop.tempdata.dao;

import com.vetias.java.workshop.tempdata.model.Organisation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;

import org.h2.jdbcx.JdbcDataSource;
public class OrganisationDao {
    public void creaTable(){
        JdbcDataSource h2DataSource = new JdbcDataSource();
        h2DataSource.setURL("jdbc:h2:mem:tempdataDb");
        h2DataSource.setUser("sa");
         try(Connection dbConnection = h2DataSource.getConnection()) {
            Statement statement = dbConnection.createStatement();
            statement.execute("""
                    create table organistaion(
                    id int AUTO_INCREMENT PRIMARY KEY,
                    NAME VARCHAR(100),
                    EMAIL VARCHAR(100),
                    CONTACT_NUMBER VARCHAR(100),
                    REGISTRATION_NO INT,)
                    """);
         }catch (SQLException sqlException) {
        System.out.println("Error creating table: " + sqlException.getMessage());
        // TODO: handle exception
    }
    public int save(Connect dbConnection,Organisation vet){
        try(PreparedStatement preparedStatement =dbConnection.prepareStatement("""
                insert into orgainsation(name, website, email, contact_number, registration_no, description)
                values(?,?,?,?,?,?);
                """)){
                    preparedStatement.setString(1,vet.name());
                    preparedStatement.setString(2,vet.website());
                    preparedStatement.setString(3,vet.email());  
                    preparedStatement.setString(4,vet.contactNumber());
                    preparedStatement.setInt(5,vet.registrationNo());
                    preparedStatement.setString(6,vet.description());
                    preparedStatement.executeUpdate();
                } 
                
        catch (SQLException sqlExpection){
       System.out.println("Error inserting into table:" + sqlExpection);
        }
    }
           return 0;
}           
}

