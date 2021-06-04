package kodlamaio.hrms.core.adapters.mernis;


import java.time.LocalDate;

public class FakeMernisServiceAdapter implements UserCheckService {

    @Override
    public boolean checkIfRealPerson(String nationalIdentity, String firstName, String lastName, LocalDate birthDate) {
        return false;
    }
}
