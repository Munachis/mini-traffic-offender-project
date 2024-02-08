package aptech.com.TrafficOffenderManagement.Controller;

import aptech.com.TrafficOffenderManagement.Model.Offender;
import aptech.com.TrafficOffenderManagement.Service.impl.OffenderServiceImpl;
import aptech.com.TrafficOffenderManagement.dto.OffenderDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/offenders")
public class OffenderController {
    private final OffenderServiceImpl offenderService;

    public OffenderController(OffenderServiceImpl offenderService) {
        this.offenderService = offenderService;
    }
    @PostMapping
    public ResponseEntity<OffenderDTO> createOffender(@RequestBody OffenderDTO offenderDTO){
        OffenderDTO offenderDTO2 = offenderService.createOffender(offenderDTO);
        return new ResponseEntity<>(offenderDTO2    , HttpStatus.CREATED);

    }
    @GetMapping("/getting")
    public List<Offender> getAllOffenders() {
        return offenderService.getAllOffenders();
    }

    @DeleteMapping("/deleting/{id}")
    public ResponseEntity<String> deletingoffender(@PathVariable Integer id) {
        return offenderService.deleteoffender(id);

    }

}
