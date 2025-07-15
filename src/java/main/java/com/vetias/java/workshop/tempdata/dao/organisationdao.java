package com.vetias.java.workshop.tempdata.dao;




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
                    preparedStatement.setString(parameterIndex:1,vet.name());
                    preparedStatement.setString(parameterIndex:2,vet.website());
                    preparedStatement.setString(parameterIndex:3,vet.email());  
                    preparedStatement.setString(parameterIndex:4,vet.contactNumber());
                    preparedStatement.setInt(parameterIndex:5,vet.registrationNo());
                    preparedStatement.setString(parameterIndex:6,vet.description());
                    preparedStatement.executeUpdate();
                } 
                
    }catch (SQLException sqlExpection){
        System.out.println("Error inserting into table:" + sqlExpection.getMessage());
    }
}
        return 0; 
}