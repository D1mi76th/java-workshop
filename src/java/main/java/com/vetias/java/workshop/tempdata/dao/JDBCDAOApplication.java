public class JDBCDAOApplication {
    public static void main(String[] args) {
        OrganisationDao organisationDao = new OrganisationDao();
        organisationDao.creaTable();
    }
} 