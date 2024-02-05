package aptech.com.TrafficOffenderManagement.him;

import aptech.com.TrafficOffenderManagement.Model.Offender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffenderRepo extends JpaRepository<Offender,Long> {
}
