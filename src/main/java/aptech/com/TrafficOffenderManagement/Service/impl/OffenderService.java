package aptech.com.TrafficOffenderManagement.Service.impl;

import aptech.com.TrafficOffenderManagement.Model.Offender;
import aptech.com.TrafficOffenderManagement.Service.OffenderInterface;
import aptech.com.TrafficOffenderManagement.dto.OffenderDTO;
import aptech.com.TrafficOffenderManagement.him.OffenderRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class OffenderService implements OffenderInterface {
    private final OffenderRepo offenderRepo;

    public OffenderService(OffenderRepo offenderRepo) {
        this.offenderRepo = offenderRepo;
    }

    @Override
    public OffenderDTO createOffender(OffenderDTO offenderDTO) {
        Offender offender = new Offender();
        offender.setFirstname(offenderDTO.getFirstname());
        offender.setLastname(offenderDTO.getLastname());
        offender.setOffenceNo(offenderDTO.getOffenceNo());
        offender.setGender(offenderDTO.getGender());
        offender.setOffence(offenderDTO.getOffence());
        Offender save = offenderRepo.save(offender);

        OffenderDTO offenderDTO1 = new OffenderDTO();

        offenderDTO1.setFirstname(save.getFirstname());
        offenderDTO1.setLastname(save.getLastname());
        offenderDTO1.setOffenceNo(save.getOffenceNo());
        offenderDTO1.setGender(save.getGender());
        offenderDTO1.setOffence(save.getOffence());


        return offenderDTO1;

    }
    @Override
    public List<Offender> getAllOffenders() {
        return offenderRepo.findAll();
    }

    @Override
    public ResponseEntity<String> deleteoffender(@PathVariable Integer id){
        offenderRepo.deleteById(Long.valueOf(id));
        String message = "the offender with " + id + "has been deleted";
        return ResponseEntity.ok(message);
    }

}
