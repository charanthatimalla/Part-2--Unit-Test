import org.junit.Test;
import static org.junit.Assert.*;

public class HospitalTest {

    @Test
    public void testNurse() {
        Nurse nurse = new Nurse("Sonny", 789, 6);
        assertEquals("Sonny", nurse.getName());
        assertEquals(789, nurse.getNumber());
        assertEquals(6, nurse.getNumOfPatients());
        assertEquals("Sonny has 6 patients.", nurse.toString());
    }

    @Test
    public void testDoctor() {
        Doctor doctor = new Doctor("Michael", 234, "Heart");
        assertEquals("Michael", doctor.getName());
        assertEquals(234, doctor.getNumber());
        assertEquals("Heart", doctor.getSpecialty());
        assertEquals("Michael Heart", doctor.toString());
    }

    @Test
    public void testSurgeon() {
        Surgeon surgeon = new Surgeon("Vincent", 645, "Brain", true);
        assertEquals("Vincent", surgeon.getName());
        assertEquals(645, surgeon.getNumber());
        assertEquals("Brain", surgeon.getSpecialty());
        assertEquals(true, surgeon.isOperating());
        assertEquals("Vincent Brain Operating: true", surgeon.toString());
    }

    @Test
    public void testHospitalEmployee() {
        HospitalEmployee employee = new HospitalEmployee("Vito", 123);
        assertEquals("Vito", employee.getName());
        assertEquals(123, employee.getNumber());
        assertEquals("Vito", employee.toString());
    }
}
