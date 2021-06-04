package kodlamaio.hrms.core.adapters.mernis;

import java.time.LocalDate;


public interface UserCheckService {
    boolean checkIfRealPerson(String nationalIdentity, String firstName, String lastName, LocalDate birthDate);
    default boolean checkMailActivation(){
        return true;
    }
    default boolean  checkUserActivationEmployee(){
        return true;
    }



}
