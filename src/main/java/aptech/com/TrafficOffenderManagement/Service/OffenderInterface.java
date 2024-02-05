package aptech.com.TrafficOffenderManagement.Service;

import aptech.com.TrafficOffenderManagement.Model.Offender;
import aptech.com.TrafficOffenderManagement.dto.OffenderDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface OffenderInterface {
    public OffenderDTO createOffender(OffenderDTO offenderDTO);
    public List<Offender> getAllOffenders();

    ResponseEntity<String> deleteoffender(@PathVariable Integer id);
}
