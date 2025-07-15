package src.java.main.java.com.vetias.java.workshop.tempdata;
import java.time.LocalDate;
public record Organization(String name,
    String completeAddress,
    String website,
    String email,
    String contactNumber,
    long registrationNumber,
    LocalDate registrationDate)
{
}
