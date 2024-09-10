package ci.digitalacademy.monEtab.web.resource;

import ci.digitalacademy.monEtab.services.StudentService;
import ci.digitalacademy.monEtab.services.dto.StudentDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/students")
public class StudentResources {

    private final StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentDTO> saveStudent(@RequestBody StudentDTO studentDTO){
        log.debug("REST Request to save  {}", studentDTO);


        return new ResponseEntity<>(studentService.save(studentDTO), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?>  updateStudent(@RequestBody StudentDTO studentDTO, @PathVariable Long id){
        log.debug("REST Request to update ");
        Optional<StudentDTO> student = studentService.update(studentDTO, id);
        if (student.isPresent()){
            return new ResponseEntity<>(student.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}")
    public  ResponseEntity<?> getStudent (@PathVariable Long id){
        log.debug("Request to get one ");
        Optional<StudentDTO> studentDTO = studentService.findOne(id);
        if(studentDTO.isPresent()){
            return new ResponseEntity<>(studentDTO.get(), HttpStatus.OK);

        }else {
            return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
        }
    }


    public List<StudentDTO> getAllStudent(){
        log.debug("Request to all student ");

        return null;
    }

    public void  deleteStudent (@PathVariable Long id){
      studentService.deleteById(id);
    }
}